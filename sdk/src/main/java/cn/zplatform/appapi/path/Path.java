package cn.zplatform.appapi.path;

import org.apache.commons.lang3.StringUtils;

public class Path {

    private static final String PREFIX = "/api/v1/" ;

    // 微信app端下单api
    public static final String WX_APP_TRANSACTION = PREFIX + "transaction/wx/app";

    // 用户关注数据迁移api
    public static final String USER_FOLLOW_SYNCHRONIZE = PREFIX + "synchronize/userFollow";

    // 用户数据迁移api
    public static final String USER_INFO_SYNCHRONIZE = PREFIX + "synchronize/userInfo";

    // 用户历史埋点数据上报
    public static final String HISTORY_SYNCHRONIZE = "/trace";

}
