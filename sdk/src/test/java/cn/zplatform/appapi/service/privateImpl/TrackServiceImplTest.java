package cn.zplatform.appapi.service.privateImpl;

import cn.zplatform.appapi.bean.track.*;
import cn.zplatform.appapi.service.impl.HistoryServiceImpl;
import cn.zplatform.appapi.service.impl.NotSubmit;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrackServiceImplTest {

    @Test
    void track() {
        TrackCommon track_common = TrackCommon.builder()
                .udid("abcd")
                .user_id("1234")
                .distinct_id("6039281029182710291")
                .platform ( Platform.IOS.value())
                .sdk_type ( SdkType.IOS.value())
                .sdk_version ( "1.0.1")
                .screen_height ( 650.0F)
                .screen_width ( 350.0F)
                .manufacturer ( "huawei")
                .model ( "huawei P40")
                .network ( Network.N_4G.value())
                .os ( Os.IOS.value())
                .os_version ( "12.1.1")
                .carrier ( Carrier.CHINA_UNICOM.value())
                .app_id(2)
                .time(new Date(System.currentTimeMillis()))
                .app_version ( "1.0.1").build();


        List<Properties> properties = new ArrayList<Properties>(){{
            add(new AppInstall());
        }};

        TrackInfo trackInfo = new TrackInfo(2, track_common, properties );
        System.out.println(JSON.toJSONString(trackInfo));

        new TrackServiceImpl().track(trackInfo, NotSubmit.track);

    }
}