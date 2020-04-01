package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.bean.transaction.WxAppPostRequest;
import cn.zplatform.appapi.path.Path;
import cn.zplatform.appapi.service.TransactionService;

/**
 * 支付中心调用实现类
 *
 * @author Lilac
 * 2020-03-31
 */
public class TransactionServiceImpl extends AbstractAppServiceImpl implements TransactionService {
    @Override
    public String wxUnifiedOrder(WxAppPostRequest body, InitConfig initConfig) {
        return post(Path.WX_APP_TRANSACTION, null, body, initConfig);
    }

    @Override
    public String wxOrderQuery(WxAppPostRequest body, InitConfig initConfig) {
        return get(Path.WX_APP_TRANSACTION, null, body, initConfig);
    }

}
