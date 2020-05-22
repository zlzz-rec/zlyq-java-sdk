package cn.zplatform.appapi.bean.profile;

import cn.zplatform.appapi.bean.track.Os;
import cn.zplatform.appapi.bean.track.SdkType;
import com.alibaba.fastjson.JSON;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class UserProfileInfoTest {

    public static void main(String[] args) {

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

        UserProfileInfo userProfileInfo = new UserProfileInfo(2, user_profile_common, user_profile);

        System.out.println(JSON.toJSONString(userProfileInfo));
    }

}