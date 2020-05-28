package cn.zplatform.appapi.service;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.bean.track.TrackInfo;

/**
 * 埋点服务
 *
 * @author Lilac
 * 2020-03-31
 */
public interface TrackService extends AppService {

    /**
     * @param body 请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String track(TrackInfo body, InitConfig initConfig);

}
