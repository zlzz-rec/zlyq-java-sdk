package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.auth.AppToken;
import cn.zplatform.appapi.auth.Sign;
import cn.zplatform.appapi.http.HttpGet;
import cn.zplatform.appapi.http.RequestBody;
import cn.zplatform.appapi.service.AppService;
import cn.zplatform.appapi.util.Constant;
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
public abstract class AbstractAppServiceImpl implements AppService {

    /**
     * get方法
     *
     * @author Lilac
     * 2020-03-31
     */
    protected String get(String url, Map<String, String> params, RequestBody body, InitConfig initConfig) {

        log.debug("initConfig.isDisabledDomain() :[{}]", initConfig.isDisabledDomain());

        if (initConfig.isDisabledDomain()){
            throw new RuntimeException("Path.Domain 未设置 ，请设置domain后使用");
        }

        if (StringUtils.isEmpty(url)) {
            return "";
        }

        if (params == null) {
            params = new HashMap<>();
        }
        params.put(Constant.APPID, initConfig.getAppId());
        params.put(Constant.TIME, System.currentTimeMillis() + "");

        //handle param
        HttpGet req = new HttpGet(initConfig.getDomain() + url + RequestTools.handlerParamStr(params));

        // handle body
        if (body != null) {
            ByteArrayEntity entity = new ByteArrayEntity(JSON.toJSONString(body).getBytes(StandardCharsets.UTF_8));
            entity.setContentType(Constant.JSON_CONTENT_TYPE);
            req.setEntity(entity);
        }

        // handle auth
        req.addHeader(Constant.X_SIGN_HEADER, new Sign(params, initConfig).getHeaderStr());
        req.addHeader(Constant.X_APP_TOKEN, new AppToken(initConfig).getHeaderStr());

        // 处理请求
        return RequestTools.execute(req);
    }

    /**
     * post方法
     *
     * @author Lilac
     * 2020-03-31
     */
    protected String post(String url, Map<String, String> params, RequestBody body, InitConfig initConfig) {

        log.debug("initConfig.isDisabledDomain() :[{}]", initConfig.isDisabledDomain());
        if (initConfig.isDisabledDomain()){
            throw new RuntimeException("Path.Domain 未设置 ，请设置domain后使用");
        }

        if (StringUtils.isEmpty(url)) {
            return "";
        }

        if (params == null || params.size() == 0) {
            params = new HashMap<>();
        }
        params.put(Constant.APPID, initConfig.getAppId());
        params.put(Constant.TIME, System.currentTimeMillis() + "");

        //handle param
        HttpPost req = new HttpPost(initConfig.getDomain() + url + RequestTools.handlerParamStr(params));

        log.debug("url :[{}]", req.getURI());
        // handle auth
        req.addHeader(Constant.X_SIGN_HEADER, new Sign(params, initConfig).getHeaderStr());
        req.addHeader(Constant.X_APP_TOKEN, new AppToken(initConfig).getHeaderStr());

        // handle body
        if (body != null) {
            ByteArrayEntity entity = new ByteArrayEntity(JSON.toJSONString(body).getBytes(StandardCharsets.UTF_8));
            entity.setContentType(Constant.JSON_CONTENT_TYPE);
            req.setEntity(entity);
        }

        // 处理请求
        return RequestTools.execute(req);
    }


}
