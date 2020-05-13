package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.bean.media.article.ArticleSynchronizeRawBody;
import cn.zplatform.appapi.bean.media_statistic.*;
import cn.zplatform.appapi.bean.media_statistic.CommentLikeSyncRawBody;
import cn.zplatform.appapi.bean.media_statistic.CommentSyncRawBody;
import cn.zplatform.appapi.path.Path;
import cn.zplatform.appapi.service.MediaSynchronizeService;

/**
 * 用户埋点数据实现
 *
 * @author Lilac
 * 2020-03-31
 */
public class MediaSynchronizeServiceImpl extends AbstractAppServiceImpl implements MediaSynchronizeService {

    @Override
    public String mediaLikeSynchronize(MediaLikeSyncRawBody body, InitConfig initConfig) {
        return post(Path.MEDIA_LIKE_SYNCHRONIZE, null, body, initConfig);
    }

    @Override
    public String mediaFavoriteSynchronize(MediaFavoriteSyncRawBody body, InitConfig initConfig) {
        return post(Path.MEDIA_FAVORITE_SYNCHRONIZE, null, body, initConfig);
    }

    @Override
    public String commentSynchronize(CommentSyncRawBody body, InitConfig initConfig) {
        return post(Path.COMMENT_SYNCHRONIZE, null, body, initConfig);
    }

    @Override
    public String commentLikeSynchronize(CommentLikeSyncRawBody body, InitConfig initConfig) {
        return post(Path.COMMENT_LIKE_SYNCHRONIZE, null, body, initConfig);
    }

    @Override
    public String articleSynchronize(ArticleSynchronizeRawBody body, InitConfig initConfig) {
        return post(Path.ARTICLE_SYNCHRONIZE, null, body, initConfig);
    }

    @Override
    public String videoSynchronize(VideoSyncRawBody body, InitConfig initConfig) {
        return post(Path.VIDEO_SYNCHRONIZE, null, body, initConfig);
    }

}
