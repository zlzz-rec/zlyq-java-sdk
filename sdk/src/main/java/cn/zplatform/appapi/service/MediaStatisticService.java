package cn.zplatform.appapi.service;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.bean.media_statistic.MediaFavoriteSyncRequest;
import cn.zplatform.appapi.bean.media_statistic.MediaLikeSyncRequest;

/**
 * 媒资数据同步
 *
 * @author Lilac
 * 2020-04-14
 */
public interface MediaStatisticService extends AppService {

    /**
     *  同步点赞信息
     * @param body 请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String mediaLikeSynchronize(MediaLikeSyncRequest body, InitConfig initConfig);

    /**
     *  同步收藏信息
     * @param body 请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String mediaFavoriteSynchronize(MediaFavoriteSyncRequest body, InitConfig initConfig);

}