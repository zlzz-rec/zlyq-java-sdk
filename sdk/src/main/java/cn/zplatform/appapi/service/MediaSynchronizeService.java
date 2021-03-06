package cn.zplatform.appapi.service;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.bean.media.article.ArticleSynchronizeRawBody;
import cn.zplatform.appapi.bean.media_statistic.*;

/**
 * 媒资数据同步
 *
 * @author Lilac
 * 2020-04-14
 */
public interface MediaSynchronizeService extends AppService {

    /**
     *  同步点赞信息
     * @param body 请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String mediaLikeSynchronize(MediaLikeSyncRawBody body, InitConfig initConfig);

    /**
     *  同步收藏信息
     * @param body 请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String mediaFavoriteSynchronize(MediaFavoriteSyncRawBody body, InitConfig initConfig);

    /**
     *  同步评论信息
     * @param body 请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String commentSynchronize(CommentSyncRawBody body, InitConfig initConfig);
    /**
     *  同步评论点赞信息
     * @param body 请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String commentLikeSynchronize(CommentLikeSyncRawBody body, InitConfig initConfig);

    /**
     *  同步图文信息
     * @param body 请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String articleSynchronize(ArticleSynchronizeRawBody body, InitConfig initConfig);

    /**
     *  同步视频信息
     * @param body 请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String videoSynchronize(VideoSyncRawBody body, InitConfig initConfig);

}
