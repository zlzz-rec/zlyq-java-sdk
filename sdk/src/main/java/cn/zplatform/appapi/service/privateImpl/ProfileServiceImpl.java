package cn.zplatform.appapi.service.privateImpl;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.bean.profile.UserProfileInfo;
import cn.zplatform.appapi.path.Path;
import cn.zplatform.appapi.service.ProfileService;

/**
 * 埋点数据实现
 *
 * @author Lilac
 * 2020-03-31
 */
public class ProfileServiceImpl extends AbstractAppServiceImpl implements ProfileService {

    @Override
    public String setUserProfile(UserProfileInfo body, InitConfig initConfig) {
        body.setDebug_mode(initConfig.getDebugMode());
        body.setProject_id(initConfig.getProjectId());
        body.getCommon().setType("set");
        return post(Path.KEPLER_PROFILE + "/" + initConfig.getProjectId(), null, body, initConfig);
    }

    @Override
    public String setUserProfileOnce(UserProfileInfo body, InitConfig initConfig) {
        body.setDebug_mode(initConfig.getDebugMode());
        body.setProject_id(initConfig.getProjectId());
        body.getCommon().setType("set_once");
        return post(Path.KEPLER_PROFILE + "/" + initConfig.getProjectId(), null, body, initConfig);
    }

    @Override
    public String appendUserProfileOnce(UserProfileInfo body, InitConfig initConfig) {
        body.setDebug_mode(initConfig.getDebugMode());
        body.setProject_id(initConfig.getProjectId());
        body.getCommon().setType("append");
        return post(Path.KEPLER_PROFILE + "/" + initConfig.getProjectId(), null, body, initConfig);
    }

    @Override
    public String increaseUserProfileOnce(UserProfileInfo body, InitConfig initConfig) {
        body.setDebug_mode(initConfig.getDebugMode());
        body.setProject_id(initConfig.getProjectId());
        body.getCommon().setType("increase");
        return post(Path.KEPLER_PROFILE + "/" + initConfig.getProjectId(), null, body, initConfig);
    }

    @Override
    public String deleteUserProfileOnce(UserProfileInfo body, InitConfig initConfig) {
        body.setDebug_mode(initConfig.getDebugMode());
        body.setProject_id(initConfig.getProjectId());
        body.getCommon().setType("delete");
        return post(Path.KEPLER_PROFILE + "/" + initConfig.getProjectId(), null, body, initConfig);
    }

    @Override
    public String unsetUserProfileOnce(UserProfileInfo body, InitConfig initConfig) {
        body.setDebug_mode(initConfig.getDebugMode());
        body.setProject_id(initConfig.getProjectId());
        body.getCommon().setType("unset");
        return post(Path.KEPLER_PROFILE + "/" + initConfig.getProjectId(), null, body, initConfig);
    }
}
