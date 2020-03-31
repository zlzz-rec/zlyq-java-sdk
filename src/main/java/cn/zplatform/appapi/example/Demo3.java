package cn.zplatform.appapi.example;


import cn.zplatform.appapi.app.AppInfo;
import cn.zplatform.appapi.auth.AppToken;
import cn.zplatform.appapi.auth.Sign;
import cn.zplatform.appapi.http.RequestBody;
import cn.zplatform.appapi.util.RequestTools;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * 使用 httpclient 写一个测试 post 测试发起支付
 *
 * @author Lilac
 * 2020-03-30
 */
@Slf4j
public class Demo3 {

    @Builder
    @AllArgsConstructor
    @Data
    static class PayInfo implements RequestBody {
        @JSONField(name="orderId")
        private String orderId;
        @JSONField(name="body")
        private String body;
        @JSONField(name="totalFee")
        private Integer totalFee;
        @JSONField(name="tradeType")
        private String tradeType;
        @JSONField(name="spbillCreatIp")
        private String spbillCreatIp;
        @JSONField(name="notifyUrl")
        private String notifyUrl;
    }

    private static AppInfo appInfo = new AppInfo() {
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

    public static void main(String[] args) throws IOException {


        String url = "http://testappapi.zplatform.cn/api/v1/transaction/wx/app";
        Map<String, String > requestParams = new HashMap<String, String>(){{
            put("appId", appInfo.getAppId());
            put("time", System.currentTimeMillis() + "");
        }};

        url += RequestTools.handlerParamStr(requestParams);
        HttpPost req = new HttpPost(url);

        // handle auth
        req.addHeader("X-Sign" , new Sign(requestParams, appInfo).getHeaderStr());
        req.addHeader("X-App-Token" , new AppToken(appInfo).getHeaderStr());

        // handle body
        RequestBody payInfo = PayInfo.builder()
                .orderId("1111111123113")
                .body("测试")
                .totalFee(1)
                .tradeType("APP")
                .spbillCreatIp("222.129.106.205")
                .notifyUrl("https://ykapi.hbagao.com/cbc/neibu/paydddCenterPayNotify")
                .build();

        log.debug("payInfo:[{}]", JSON.toJSONString(payInfo));

        // handle body
        if (payInfo != null){
            ByteArrayEntity entity = new ByteArrayEntity(JSON.toJSONString(payInfo).getBytes(StandardCharsets.UTF_8));
            entity.setContentType("application/json");
            req.setEntity(entity);
        }

        RequestTools.execute(req);
    }


}
