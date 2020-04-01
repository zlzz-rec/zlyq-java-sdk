package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.bean.user.UserFollowRequest;
import cn.zplatform.appapi.bean.user.UserInfoSynchronizeRequest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

@Slf4j
class UserServiceImplTest {
    private static UserInfoSynchronizeRequest userInfo = null;
    private static UserFollowRequest userFollowInfo = null;


    @BeforeAll
    public static void init() {
        userInfo = UserInfoSynchronizeRequest.builder()
                .thirdId("51982")
                .nickname("test name")
                .gender(1)
                .udid("ABC")
                .build();


        userFollowInfo = UserFollowRequest.builder()
                .userId("453394023459028992")
                .followMap(new HashMap<String, Long>(){{
                    put("453394023459028994", 1550000000000L);
                    put("432567854324567865", 1552323456222L);
                }})
                .build();


    }

    @Test
    void userInfoSynchronize() {
        String response = new UserServiceImpl().userInfoSynchronize(userInfo, NotSubmit.app);
        log.info(response);
    }

    @Test
    void userFollowSynchronize() {
        String response = new UserServiceImpl().userFollowSynchronize(userFollowInfo, NotSubmit.app);
        log.info(response);
    }
}