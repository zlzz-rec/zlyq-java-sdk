package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.bean.history.TrackInfo;
import cn.zplatform.appapi.path.Path;
import cn.zplatform.appapi.service.HistoryService;

/**
 * 用户埋点数据实现
 *
 * @author Lilac
 * 2020-03-31
 */
public class HistoryServiceImpl extends AbstractAppServiceImpl implements HistoryService {

    @Override
    public String trackSynchronize(TrackInfo body, InitConfig initConfig) {
        return post(Path.TRACK_SYNCHRONIZE, null, body, initConfig);
    }
}
