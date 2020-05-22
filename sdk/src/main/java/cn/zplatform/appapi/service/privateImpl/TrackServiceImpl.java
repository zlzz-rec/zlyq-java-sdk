package cn.zplatform.appapi.service.privateImpl;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.bean.track.TrackInfo;
import cn.zplatform.appapi.path.Path;
import cn.zplatform.appapi.service.TrackService;

/**
 * 埋点数据实现
 *
 * @author Lilac
 * 2020-03-31
 */
public class TrackServiceImpl extends AbstractAppServiceImpl implements TrackService {

    @Override
    public String track(TrackInfo body, InitConfig initConfig) {
        return post(Path.KEPLER_TRACK + "/" + body.getProject_id(), null, body, initConfig);
    }
}
