package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.bean.media_statistic.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * Tip: 返回 mediaId不存在 删除第二条测试数据试试
 *
 * @author Lilac
 * 2020-04-15
 */
class MediaServiceImplTest {

    @Test
    void mediaLikeSynchronize() {

        MediaLikeSyncRequest req = MediaLikeSyncRequest.builder().mediaLikes(
                new ArrayList<MediaLike>() {{
                    add(MediaLike.builder().mediaId("467366407865606144").userId("457751121931763712").createdAt(1583994134300L).build());
                    add(MediaLike.builder().mediaId("467366407865606134").userId("457751121931763732").createdAt(1583994134200L).build());
                }}
        ).build();
        System.out.println(

                new MediaServiceImpl().mediaLikeSynchronize(req, NotSubmit.app)
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

                new MediaServiceImpl().mediaFavoriteSynchronize(req, NotSubmit.app)
        );

    }
    @Test
    void commentSynchronize() {

        CommentSyncRequest req = CommentSyncRequest.builder().comments(
                new ArrayList<Comment>() {{
                    add(Comment.builder().mediaId("452229862267457536").userId("12345").createdAt(1583241345076L).content("content1").thirdId("22").build());
                    add(Comment.builder().mediaId("452229862267457536").userId("12345").createdAt(1583241345076L).content("content2").thirdId("22").build());
                }}
        ).build();
        System.out.println(

                new MediaServiceImpl().commentSynchronize(req, NotSubmit.app)
        );

    }
    @Test
    void commentLikeSynchronize() {

        CommentLikeSyncRequest req = CommentLikeSyncRequest.builder().commentLikes(
                new ArrayList<CommentLike>() {{
                    add(CommentLike.builder().mediaId("452229862267457536").userId("12345").createdAt(1583241345076L).commentId("452229862267457536").build());
                    add(CommentLike.builder().mediaId("452229862267457536").userId("12345").createdAt(1583241345075L).commentId("452229862267457537").build());
                }}
        ).build();
        System.out.println(

                new MediaServiceImpl().commentLikeSynchronize(req, NotSubmit.app)
        );

    }


}