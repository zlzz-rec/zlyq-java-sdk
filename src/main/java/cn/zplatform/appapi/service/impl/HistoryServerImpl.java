package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.app.AppInfo;
import cn.zplatform.appapi.bean.history.TrackInfo;
import cn.zplatform.appapi.bean.user.UserFollowRequest;
import cn.zplatform.appapi.bean.user.UserInfoSynchronizeRequest;
import cn.zplatform.appapi.path.Path;
import cn.zplatform.appapi.service.HistoryServer;
import cn.zplatform.appapi.service.UserServer;

/**
 * 用户埋点数据实现
 *
 * @author Lilac
 * 2020-03-31
 */
public class HistoryServerImpl extends AbstractAppServerImpl implements HistoryServer {

    @Override
    public String historySynchronize(TrackInfo body, AppInfo appInfo) {
        return post(Path.DOMAIN + Path.HISTORY_SYNCHRONIZE, null, body, appInfo);
    }
}
