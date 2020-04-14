package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.bean.media_statistic.CommentSyncRequest;
import cn.zplatform.appapi.bean.media_statistic.MediaFavoriteSyncRequest;
import cn.zplatform.appapi.bean.media_statistic.MediaLikeSyncRequest;
import cn.zplatform.appapi.path.Path;
import cn.zplatform.appapi.service.MediaStatisticService;

/**
 * 用户埋点数据实现
 *
 * @author Lilac
 * 2020-03-31
 */
public class MediaStatisticServiceImpl extends AbstractAppServiceImpl implements MediaStatisticService {

    @Override
    public String mediaLikeSynchronize(MediaLikeSyncRequest body, InitConfig initConfig) {
        return post(Path.MEDIA_LIKE_SYNCHRONIZE, null, body, initConfig);
    }

    @Override
    public String mediaFavoriteSynchronize(MediaFavoriteSyncRequest body, InitConfig initConfig) {
        return post(Path.MEDIA_FAVORITE_SYNCHRONIZE, null, body, initConfig);
    }

    @Override
    public String commentSynchronize(CommentSyncRequest body, InitConfig initConfig) {
        return post(Path.COMMENT_SYNCHRONIZE, null, body, initConfig);
    }
}
