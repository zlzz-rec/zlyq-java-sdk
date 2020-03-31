package cn.zplatform.appapi.path;

import org.apache.commons.lang3.StringUtils;

public class Path {

    public static String DOMAIN = "";

    private static final String PREFIX = "/api/v1/" ;

    // 微信app端下单api
    public static final String WX_APP_TRANSACTION = PREFIX + "transaction/wx/app";

    // 用户关注数据迁移api
    public static final String USER_FOLLOW_SYNCHRONIZE = PREFIX + "synchronize/userFollow";

    // 用户数据迁移api
    public static final String USER_INFO_SYNCHRONIZE = PREFIX + "synchronize/userInfo";

    /**
     * 判断DOMAIN 是否配置。如果未配置需要根据不同环境进行DOMAIN配置
     *
     * @author Lilac
     * 2020-03-31
     */
    public static boolean isDisabledDomain(){
        return StringUtils.isEmpty(DOMAIN) ;
    }

}
