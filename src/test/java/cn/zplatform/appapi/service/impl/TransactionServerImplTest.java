package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.app.AppInfo;
import cn.zplatform.appapi.bean.transaction.WxAppPostRequest;
import cn.zplatform.appapi.path.Path;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

@Slf4j
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

        appInfo = NotSubmit.appInfo;

        Path.DOMAIN = "http://testappapi.zplatform.cn";
    }

    @Test
    public void wxUnifiedOrder() {
        String response = new TransactionServerImpl().wxUnifiedOrder(payInfo, appInfo);
        log.info(response);
    }

    @Test
    public void wxOrderQuery() {
        String response = new TransactionServerImpl().wxOrderQuery(payInfo, appInfo);
        log.info(response);
    }


}