package cn.zplatform.appapi.auth;

import cn.zplatform.appapi.app.InitConfig;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Kepler Sign 身份验证
 *
 * @author Lilac
 * 2020-03-30
 */
@Slf4j
public class KeplerSign implements Auth {
    /**
     * sign校验
     */
    private String XSignValue = "";

    public KeplerSign(Map<String, String> params, Map<String, String>  body, InitConfig initConfig){

        if ((params == null || params.size() == 0) && (body == null || body.size() == 0)){
            return;
        }

        if (initConfig == null || initConfig.isEmpty()){
            return;
        }

        log.debug(" before md5 string :[{}]", mapToStr(params) + "&" + initConfig.getApiKey() + "&" + mapToStr(body) );

        XSignValue = DigestUtils.md5Hex(mapToStr(params)).toUpperCase();

        log.debug(" after md5 calculable result :[{}]",XSignValue);
    }

    private String mapToStr(Map<String, String> map) {
        if (map.size() == 0){
            return "";
        }

        List<String> keys = new ArrayList<>(map.keySet());
        log.debug(" un orderly Key keys:[{}]", JSON.toJSONString(keys));

        Collections.sort(keys);
        log.debug(" orderlyKey keys:[{}]", JSON.toJSONString(keys));

        StringBuilder stringBuilder = new StringBuilder();

        for (String orderlyKey: keys) {
            stringBuilder
                    .append(stringBuilder.length() == 0 ? "" : "&")
                    .append(orderlyKey)
                    .append("=")
                    .append(map.get(orderlyKey));
        }
        return stringBuilder.toString();
    }

    @Override
    public String getHeaderStr() {
        return XSignValue;
    }
}
