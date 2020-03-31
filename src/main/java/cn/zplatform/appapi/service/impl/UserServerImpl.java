package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.app.AppInfo;
import cn.zplatform.appapi.bean.user.UserFollowRequest;
import cn.zplatform.appapi.bean.user.UserInfoSynchronizeRequest;
import cn.zplatform.appapi.path.Path;
import cn.zplatform.appapi.service.UserServer;

/**
 * 用户中心调用实现类
 *
 * @author Lilac
 * 2020-03-31
 */
public class UserServerImpl extends AbstractAppServerImpl implements UserServer {

    @Override
    public String userInfoSynchronize(UserInfoSynchronizeRequest body, AppInfo appInfo) {
        return post(Path.DOMAIN + Path.USER_INFO_SYNCHRONIZE, null, body, appInfo) ;
    }

    @Override
    public String userFollowSynchronize(UserFollowRequest body, AppInfo appInfo) {
        return post(Path.DOMAIN + Path.USER_FOLLOW_SYNCHRONIZE, null, body, appInfo);
    }
}
