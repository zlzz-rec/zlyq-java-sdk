package cn.zplatform.appapi.auth;


import cn.zplatform.appapi.app.InitConfig;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;

import java.text.SimpleDateFormat;

/**
 * AppToken 身份验证
 *
 * @author Lilac
 * 2020-03-30
 */
@Slf4j
public class AppToken implements Auth{

    private String initConfigStr;
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public AppToken(InitConfig initConfig){

        if (initConfig == null || initConfig.isEmpty()){
            return;
        }

        initConfigStr = initConfig.getAppKey() + initConfig.getAppSecret() ;

    }
    @Override
    public String getHeaderStr() {

        String str = initConfigStr + simpleDateFormat.format(System.currentTimeMillis());

        log.debug(" calculable string :[{}]", str );

        String XSignValue = DigestUtils.md5Hex(str).toUpperCase();

        log.debug(" after md5 calculable result :[{}]", XSignValue);

        return XSignValue;
    }
}
