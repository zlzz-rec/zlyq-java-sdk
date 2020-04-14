package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.bean.media_statistic.MediaFavorite;
import cn.zplatform.appapi.bean.media_statistic.MediaFavoriteSyncRequest;
import cn.zplatform.appapi.bean.media_statistic.MediaLike;
import cn.zplatform.appapi.bean.media_statistic.MediaLikeSyncRequest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * Tip: 返回 mediaId不存在 删除第二条测试数据试试
 *
 * @author Lilac
 * 2020-04-15
 */
class MediaStatisticServiceImplTest {

    @Test
    void mediaLikeSynchronize() {

        MediaLikeSyncRequest req = MediaLikeSyncRequest.builder().mediaLikes(
                new ArrayList<MediaLike>() {{
                    add(MediaLike.builder().mediaId("467366407865606144").userId("457751121931763712").createdAt(1583994134300L).build());
                    add(MediaLike.builder().mediaId("467366407865606134").userId("457751121931763732").createdAt(1583994134200L).build());
                }}
        ).build();
        System.out.println(

                new MediaStatisticServiceImpl().mediaLikeSynchronize(req, NotSubmit.app)
        );

    }

    @Test
    void mediaFavoriteSynchronize() {

        MediaFavoriteSyncRequest req = MediaFavoriteSyncRequest.builder().mediaFavorites(
                new ArrayList<MediaFavorite>() {{
                    add(MediaFavorite.builder().mediaId("467366407865606144").userId("457751121931763712").createdAt(1583994134300L).build());
                    add(MediaFavorite.builder().mediaId("467366407865606134").userId("457751121931763732").createdAt(1583994134200L).build());
                }}
        ).build();
        System.out.println(

                new MediaStatisticServiceImpl().mediaFavoriteSynchronize(req, NotSubmit.app)
        );

    }

}