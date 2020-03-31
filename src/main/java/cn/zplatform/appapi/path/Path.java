package cn.zplatform.appapi.path;

import org.apache.commons.lang3.StringUtils;

public class Path {

    public static String DOMAIN = "";

    private static final String PREFIX = "/api/v1/" ;

    public static final String WX_APP_TRANSACTION = PREFIX + "transaction/wx/app";

    public static boolean isDisabledDomain(){
        return StringUtils.isEmpty(DOMAIN) ;
    }

}
