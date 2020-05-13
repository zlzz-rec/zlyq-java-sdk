package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.bean.transaction.WxAppPostRawBody;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

@Slf4j
class TransactionServiceImplTest {
    private static WxAppPostRawBody payInfo = null;


    @BeforeAll
    public static void init() {
        payInfo = WxAppPostRawBody.builder()
                .orderId("1111111123113")
                .body("测试")
                .totalFee(1)
                .tradeType("APP")
                .spbillCreatIp("222.129.106.205")
                .notifyUrl("https://ykapi.hbagao.com/cb3c/n2eibu/payddd3CenterPayNotify")
                .build();
    }

    @Test
    public void wxUnifiedOrder() {
        String response = new TransactionServiceImpl().wxUnifiedOrder(payInfo, NotSubmit.app);
        log.info(response);
    }

    @Test
    public void wxOrderQuery() {
        String response = new TransactionServiceImpl().wxOrderQuery(payInfo, NotSubmit.app);
        log.info(response);
    }


}