package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.app.AppInfo;
import cn.zplatform.appapi.auth.AppToken;
import cn.zplatform.appapi.auth.Sign;
import cn.zplatform.appapi.http.HttpGet;
import cn.zplatform.appapi.http.RequestBody;
import cn.zplatform.appapi.path.Path;
import cn.zplatform.appapi.service.AppServer;
import cn.zplatform.appapi.util.RequestTools;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * *封装Post和Get方法
 *
 * @author Lilac
 * 2020-03-31
 */
@Slf4j
public abstract class AbstractAppServerImpl implements AppServer {

    /**
     * get方法
     *
     * @author Lilac
     * 2020-03-31
     */
    protected String get(String url, Map<String, String> params, RequestBody body, AppInfo appInfo) {

        log.info("Path.isDisabledDomain() :[{}]", Path.isDisabledDomain());

        if (Path.isDisabledDomain()){
            throw new RuntimeException("Path.Domain 未设置 ，请设置domain后使用");
        }

        if (StringUtils.isEmpty(url)) {
            return "";
        }

        if (params == null) {
            params = new HashMap<>();
        }
        params.put("appId", appInfo.getAppId());
        params.put("time", System.currentTimeMillis() + "");

        //handle param
        HttpGet req = new HttpGet(url + RequestTools.handlerParamStr(params));

        // handle body
        if (body != null) {
            ByteArrayEntity entity = new ByteArrayEntity(JSON.toJSONString(body).getBytes(StandardCharsets.UTF_8));
            entity.setContentType("application/json");
            req.setEntity(entity);
        }

        // handle auth
        req.addHeader("X-Sign", new Sign(params, appInfo).getHeaderStr());
        req.addHeader("X-App-Token", new AppToken(appInfo).getHeaderStr());

        // 处理请求
        return RequestTools.execute(req);
    }

    /**
     * post方法
     *
     * @author Lilac
     * 2020-03-31
     */
    protected String post(String url, Map<String, String> params, RequestBody body, AppInfo appInfo) {

        log.info("Path.isDisabledDomain() :[{}]", Path.isDisabledDomain());
        if (Path.isDisabledDomain()){
            throw new RuntimeException("Path.Domain 未设置 ，请设置domain后使用");
        }

        if (StringUtils.isEmpty(url)) {
            return "";
        }

        if (params == null || params.size() == 0) {
            params = new HashMap<>();
        }
        params.put("appId", appInfo.getAppId());
        params.put("time", System.currentTimeMillis() + "");

        //handle param
        HttpPost req = new HttpPost(url + RequestTools.handlerParamStr(params));

        // handle auth
        req.addHeader("X-Sign", new Sign(params, appInfo).getHeaderStr());
        req.addHeader("X-App-Token", new AppToken(appInfo).getHeaderStr());

        // handle body
        if (body != null) {
            ByteArrayEntity entity = new ByteArrayEntity(JSON.toJSONString(body).getBytes(StandardCharsets.UTF_8));
            entity.setContentType("application/json");
            req.setEntity(entity);
        }

        // 处理请求
        return RequestTools.execute(req);
    }


}
