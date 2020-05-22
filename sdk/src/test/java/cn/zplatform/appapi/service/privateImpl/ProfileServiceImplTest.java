package cn.zplatform.appapi.service.privateImpl;

import cn.zplatform.appapi.bean.profile.UserProfile;
import cn.zplatform.appapi.bean.profile.UserProfileCommon;
import cn.zplatform.appapi.bean.profile.UserProfileInfo;
import cn.zplatform.appapi.bean.track.Os;
import cn.zplatform.appapi.bean.track.SdkType;
import cn.zplatform.appapi.service.impl.NotSubmit;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Date;

class ProfileServiceImplTest {

    private static UserProfileInfo userProfileInfo;

    @BeforeAll
    public static void init() {
        UserProfile user_profile = UserProfile.builder()
                .user_id ( "123")
                .distinct_id ( "6020103928102918274")
                .udid ( "abcdefg")
                .birthday ( "1990-01-01 20:00:00")
                .name ( "小脑斧")
                .gender ( "男")
                .browser ( "chrome")
                .browser_version ( "1.0.0")
                .first_visit_time ( "2020-02-02 20:00:00")
                .utm_source ( "toutiao")
                .utm_media ( "cpc")
                .utm_campaign ( "app")
                .utm_content ( "20200101")
                .utm_term ( "delicacy")
                .os (Os.IOS.value())
                .os_version ( "10.0.1")
                .sdk_type ( SdkType.IOS.value())
                .sdk_version ( "1.0.1")
                .app_version ( "2.0.0")
                .update_time(new Date(System.currentTimeMillis()))
                .build();


        UserProfileCommon user_profile_common = UserProfileCommon.builder()
                .distinct_id("6039281029182710291")
                .user_id("1234")
                .type("1234")
                .time(new Date(System.currentTimeMillis()))
                .build();

        userProfileInfo = new UserProfileInfo(2, user_profile_common, user_profile);

        System.out.println(JSON.toJSONString(userProfileInfo));


    }

    @Test
    void setUserProfile() {
        System.out.println(new ProfileServiceImpl().setUserProfile(userProfileInfo, NotSubmit.kepler));
    }

    @Test
    void setUserProfileOnce() {
        System.out.println(new ProfileServiceImpl().setUserProfileOnce(userProfileInfo, NotSubmit.kepler));
    }

    @Test
    void appendUserProfileOnce() {
        System.out.println(new ProfileServiceImpl().appendUserProfileOnce(userProfileInfo, NotSubmit.kepler));
    }

    @Test
    void increaseUserProfileOnce() {
        System.out.println(new ProfileServiceImpl().increaseUserProfileOnce(userProfileInfo, NotSubmit.kepler));
    }

    @Test
    void deleteUserProfileOnce() {
        System.out.println(new ProfileServiceImpl().deleteUserProfileOnce(userProfileInfo, NotSubmit.kepler));
    }

    @Test
    void unsetUserProfileOnce() {
        System.out.println(new ProfileServiceImpl().unsetUserProfileOnce(userProfileInfo, NotSubmit.kepler));
    }
}