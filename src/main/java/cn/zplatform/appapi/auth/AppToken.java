package cn.zplatform.appapi.auth;


import cn.zplatform.appapi.app.AppInfo;
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

    private String appInfoStr;
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public AppToken(AppInfo appInfo){

        if (appInfo == null || appInfo.isEmpty()){
            return;
        }

        appInfoStr = appInfo.getAppKey() + appInfo.getAppSecret() ;

    }
    @Override
    public String getHeaderStr() {

        String str = appInfoStr + simpleDateFormat.format(System.currentTimeMillis());

        log.debug(" calculable string :[{}]", str );

        String XSignValue = DigestUtils.md5Hex(str).toUpperCase();

        log.debug(" after md5 calculable result :[{}]", XSignValue);

        return XSignValue;
    }
}
