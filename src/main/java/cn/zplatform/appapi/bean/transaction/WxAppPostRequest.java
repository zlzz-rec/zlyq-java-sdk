package cn.zplatform.appapi.bean.transaction;

import cn.zplatform.appapi.http.RequestBody;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 微信下单请求Body封装
 * 参见 中台API文档 /pages/viewpage.action?pageId=1442858
 *
 * @author Lilac
 * 2020-03-31
 */
@Builder
@AllArgsConstructor
@Data
public class WxAppPostRequest implements RequestBody{
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