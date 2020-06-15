package cn.zplatform.appapi.path;


public class Path {

    private static final String PREFIX = "/api/v1";

    // 微信app端下单api
    public static final String WX_APP_TRANSACTION = PREFIX + "transaction/wx/app";

    // 用户关注数据迁移api
    public static final String USER_FOLLOW_SYNCHRONIZE = PREFIX + "synchronize/userFollow";

    // 用户数据迁移api
    public static final String USER_INFO_SYNCHRONIZE = PREFIX + "synchronize/userInfo";

    // 用户历史埋点数据上报
    public static final String TRACK_SYNCHRONIZE = "/trace";


    // 同步视频
    public static final String VIDEO_SYNCHRONIZE = PREFIX + "/videoSync";
    // 同步图文
    public static final String ARTICLE_SYNCHRONIZE = PREFIX + "/articleSync";
    // 上传并同步图片
    public static final String IMAGE_UPLOAD_SYNCHRONIZE = PREFIX + "/imageUploadSync";
    // 上传并同步视频
    public static final String VIDEO_UPLOAD_SYNCHRONIZE = PREFIX + "/videoUploadSync";
    // 上传并同步图文
    public static final String ARTICLE_UPLOAD_SYNCHRONIZE = PREFIX + "/articleUploadSync";

    // 点赞数据
    public static final String MEDIA_LIKE_SYNCHRONIZE = PREFIX + "/mediaLikeSync";
    // 收藏数据
    public static final String MEDIA_FAVORITE_SYNCHRONIZE = PREFIX + "/mediaFavoriteSync";
    // 评论数据
    public static final String COMMENT_SYNCHRONIZE = PREFIX + "/commentSync";
    // 评论点赞数据
    public static final String COMMENT_LIKE_SYNCHRONIZE = PREFIX + "/commentLikeSync";


    // 下面的是开普勒的接口

    private static final String KEPLER_PREFIX = "/api/v1";

    public static final String KEPLER_TRACK = KEPLER_PREFIX + "/track";

    public static final String KEPLER_PROFILE = KEPLER_PREFIX + "/user_profile";


}
