package cn.zplatform.appapi.auth;

import cn.zplatform.appapi.app.InitConfig;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.*;

/**
 * Sign 身份验证
 *
 * @author Lilac
 * 2020-03-30
 */
@Slf4j
public class Sign implements Auth {
    /**
     * 第一版sign只校验 param中数据 未校验body
     */
    private String XSignValue = "";

    public Sign(Map<String, String> params, InitConfig initConfig){

        if (params == null || params.size() == 0){
            return;
        }

        if (initConfig == null || initConfig.isEmpty()){
            return;
        }

        List<String> keys = new ArrayList<>(params.keySet());
        log.debug(" unorderlyKey keys:[{}]", JSON.toJSONString(keys));

        Collections.sort(keys);
        log.debug(" orderlyKey keys:[{}]", JSON.toJSONString(keys));

        StringBuilder stringBuilder = new StringBuilder(initConfig.getAppSecret());

        for (String orderlyKey: keys) {
            stringBuilder.append("&" + orderlyKey + "=" + params.get(orderlyKey));
        }

        log.debug(" calculable string :[{}]", stringBuilder.toString());

        XSignValue = DigestUtils.md5Hex(stringBuilder.toString()).toUpperCase();

        log.debug(" after md5 calculable result :[{}]",XSignValue);
    }

    @Override
    public String getHeaderStr() {
        return XSignValue;
    }
}
