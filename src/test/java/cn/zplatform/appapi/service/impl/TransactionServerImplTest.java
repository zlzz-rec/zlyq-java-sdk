package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.app.AppInfo;
import cn.zplatform.appapi.bean.transaction.WxAppPostRequest;
import cn.zplatform.appapi.path.Path;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TransactionServerImplTest {
    private static WxAppPostRequest payInfo = null;
    private static AppInfo appInfo = null;

    @BeforeAll
    public static void init() {
        payInfo = WxAppPostRequest.builder()
                .orderId("1111111123113")
                .body("测试")
                .totalFee(1)
                .tradeType("APP")
                .spbillCreatIp("222.129.106.205")
                .notifyUrl("https://ykapi.hbagao.com/cbc/neibu/paydddCenterPayNotify")
                .build();
        appInfo = new AppInfo() {
            @Override
            public String getAppId() {
                return "455906851436167168";
            }

            @Override
            public String getAppSecret() {
                return "5eaeb9748a6895c66193f16fb4934fae";
            }

            @Override
            public String getAppKey() {
                return "a4182367d0f523ef5e6f3a9a931522f1";
            }

            @Override
            public boolean isEmpty() {
                return false;
            }
        };

        Path.DOMAIN = "http://testappapi.zplatform.cn";
    }

    @Test

    public void wxUnifiedOrder() {
        new TransactionServerImpl().wxUnifiedOrder(payInfo, appInfo);
    }

    @Test
    public void wxOrderQuery() {
        new TransactionServerImpl().wxOrderQuery(payInfo, appInfo);
    }


}