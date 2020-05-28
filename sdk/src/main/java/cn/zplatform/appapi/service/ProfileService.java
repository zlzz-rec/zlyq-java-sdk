package cn.zplatform.appapi.service;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.bean.profile.UserProfileInfo;

/**
 * 用户画像服务
 *
 * @author Lilac
 * 2020-03-31
 */
public interface ProfileService extends AppService {

    /**
     * @param body       请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String setUserProfile(UserProfileInfo body, InitConfig initConfig);

    /**
     * @param body       请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String setUserProfileOnce(UserProfileInfo body, InitConfig initConfig);

    /**
     * @param body       请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String appendUserProfileOnce(UserProfileInfo body, InitConfig initConfig);

    /**
     * @param body       请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String increaseUserProfileOnce(UserProfileInfo body, InitConfig initConfig);

    /**
     * @param body       请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String deleteUserProfileOnce(UserProfileInfo body, InitConfig initConfig);

    /**
     * @param body       请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String unsetUserProfileOnce(UserProfileInfo body, InitConfig initConfig);

}
