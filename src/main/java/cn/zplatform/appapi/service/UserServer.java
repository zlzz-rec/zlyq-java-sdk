package cn.zplatform.appapi.service;

        import cn.zplatform.appapi.app.AppInfo;
        import cn.zplatform.appapi.bean.user.UserFollowRequest;
        import cn.zplatform.appapi.bean.user.UserInfoSynchronizeRequest;

/**
 * 用户中心相关服务处理
 *
 * @author Lilac
 * 2020-03-31
 */
public interface UserServer extends AppServer{

    /**
     * 用户信息同步
     * 调用次接口后会在中量系统中注册成功用户并得到用户唯一标识
     * @param body 请求Body数据
     * @param appInfo app数据
     * @return response
     */
    String userInfoSynchronize(UserInfoSynchronizeRequest body, AppInfo appInfo);


    /**
     * 用户关注数据同步
     * followMap不超过100个key
     * @param body 请求Body数据
     * @param appInfo app数据
     * @return response
     */
    String userFollowSynchronize(UserFollowRequest body, AppInfo appInfo);

}
