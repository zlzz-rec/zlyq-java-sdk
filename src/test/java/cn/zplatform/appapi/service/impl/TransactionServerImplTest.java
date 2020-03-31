package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.app.AppInfo;
import cn.zplatform.appapi.app.DefaultAppInfo;
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
                .notifyUrl("https://ykapi.hbagao.com/cb3c/n2eibu/payddd3CenterPayNotify")
                .build();

        appInfo = DefaultAppInfo.builder()
                .appId("455906851436167168")
                .appKey( "a4182367d0f523ef5e6f3a9a931522f1")
                .appSecret("5eaeb9748a6895c66193f16fb4934fae")
                .build();

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