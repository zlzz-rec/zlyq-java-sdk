package cn.zplatform.appapi.service;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.bean.transaction.WxAppPostRequest;

/**
 * 支付中心相关服务处理
 *
 * @author Lilac
 * 2020-03-31
 */
public interface TransactionService extends AppService {

    /**
     * 微信app下单请求
     * @param body 请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String wxUnifiedOrder(WxAppPostRequest body, InitConfig initConfig);

    /**
     * 查询微信下单结果请求
     * @param body 请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String wxOrderQuery(WxAppPostRequest body, InitConfig initConfig);
}
