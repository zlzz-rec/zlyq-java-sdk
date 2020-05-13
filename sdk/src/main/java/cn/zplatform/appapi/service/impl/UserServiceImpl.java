package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.bean.user.UserFollowRawBody;
import cn.zplatform.appapi.bean.user.UserInfoSynchronizeRawBody;
import cn.zplatform.appapi.path.Path;
import cn.zplatform.appapi.service.UserService;

/**
 * 用户数据同步
 *
 * @author Lilac
 * 2020-03-31
 */
public class UserServiceImpl extends AbstractAppServiceImpl implements UserService {

    @Override
    public String userInfoSynchronize(UserInfoSynchronizeRawBody body, InitConfig initConfig) {
        return post(Path.USER_INFO_SYNCHRONIZE, null, body, initConfig) ;
    }

    @Override
    public String userFollowSynchronize(UserFollowRawBody body, InitConfig initConfig) {
        return post(Path.USER_FOLLOW_SYNCHRONIZE, null, body, initConfig);
    }
}
