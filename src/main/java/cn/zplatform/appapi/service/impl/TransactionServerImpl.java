package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.app.AppInfo;
import cn.zplatform.appapi.bean.transaction.WxAppPostRequest;
import cn.zplatform.appapi.path.Path;
import cn.zplatform.appapi.service.TransactionServer;

/**
 * placeholder
 *
 * @author Lilac
 * 2020-03-31
 */
public class TransactionServerImpl extends AbstractAppServerImpl implements TransactionServer {
    @Override
    public String wxUnifiedOrder(WxAppPostRequest body, AppInfo appInfo) {
        return post(Path.DOMAIN + Path.WX_APP_TRANSACTION, null, body, appInfo);
    }

    @Override
    public String wxOrderQuery(WxAppPostRequest body, AppInfo appInfo) {
        return get(Path.DOMAIN + Path.WX_APP_TRANSACTION, null, body, appInfo);
    }

}
