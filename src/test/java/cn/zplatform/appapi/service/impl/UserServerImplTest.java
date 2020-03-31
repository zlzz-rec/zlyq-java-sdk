package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.bean.user.UserInfoSynchronizeRequest;
import cn.zplatform.appapi.path.Path;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

@Slf4j
class UserServerImplTest {
    private static UserInfoSynchronizeRequest userInfo = null;

    @BeforeAll
    public static void init() {
        userInfo = UserInfoSynchronizeRequest.builder()
                .thirdId("51982")
                .nickname("test name")
                .gender(1)
                .udid("ABC")
                .build();
        Path.DOMAIN = "http://testappapi.zplatform.cn";

    }

    @Test
    void userInfoSynchronize() {
        String response = new UserServerImpl().userInfoSynchronize(userInfo, NotSubmit.appInfo);
        log.info(response);
    }
}