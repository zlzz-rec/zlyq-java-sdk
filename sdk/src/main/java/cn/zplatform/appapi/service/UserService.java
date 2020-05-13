package cn.zplatform.appapi.service;

        import cn.zplatform.appapi.app.InitConfig;
        import cn.zplatform.appapi.bean.user.UserFollowRawBody;
        import cn.zplatform.appapi.bean.user.UserInfoSynchronizeRawBody;

/**
 * 用户中心相关服务处理
 *
 * @author Lilac
 * 2020-03-31
 */
public interface UserService extends AppService {

    /**
     * 用户信息同步
     * 调用次接口后会在中量系统中注册成功用户并得到用户唯一标识
     * @param body 请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String userInfoSynchronize(UserInfoSynchronizeRawBody body, InitConfig initConfig);


    /**
     * 用户关注数据同步
     * followMap不超过100个key
     * @param body 请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String userFollowSynchronize(UserFollowRawBody body, InitConfig initConfig);

}
