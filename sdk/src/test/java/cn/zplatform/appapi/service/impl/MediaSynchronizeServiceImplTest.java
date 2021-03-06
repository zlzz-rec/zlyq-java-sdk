package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.bean.media.MediaType;
import cn.zplatform.appapi.bean.media.OsType;
import cn.zplatform.appapi.bean.media.Source;
import cn.zplatform.appapi.bean.media.article.ArticleSynchronize;
import cn.zplatform.appapi.bean.media.article.ArticleSynchronizeRawBody;
import cn.zplatform.appapi.bean.media.article.ArticleUploadRawBody;
import cn.zplatform.appapi.bean.media_statistic.*;
import cn.zplatform.appapi.path.Path;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * Tip: 返回 mediaId不存在 删除第二条测试数据试试
 *
 * @author Lilac
 * 2020-04-15
 */
class MediaSynchronizeServiceImplTest {

    @Test
    void mediaLikeSynchronize() {

        MediaLikeSyncRawBody req = MediaLikeSyncRawBody.builder().mediaLikes(
                new ArrayList<MediaLike>() {{
                    add(MediaLike.builder().mediaId("467366407865606144").userId("457751121931763712").createdAt(1583994134300L).build());
                    add(MediaLike.builder().mediaId("467366407865606134").userId("457751121931763732").createdAt(1583994134200L).build());
                }}
        ).build();
        System.out.println(

                new MediaSynchronizeServiceImpl().mediaLikeSynchronize(req, NotSubmit.app)
        );

    }

    @Test
    void mediaFavoriteSynchronize() {

        MediaFavoriteSyncRawBody req = MediaFavoriteSyncRawBody.builder().mediaFavorites(
                new ArrayList<MediaFavorite>() {{
                    add(MediaFavorite.builder().mediaId("467366407865606144").userId("457751121931763712").createdAt(1583994134300L).build());
                    add(MediaFavorite.builder().mediaId("467366407865606134").userId("457751121931763732").createdAt(1583994134200L).build());
                }}
        ).build();
        System.out.println(

                new MediaSynchronizeServiceImpl().mediaFavoriteSynchronize(req, NotSubmit.app)
        );

    }
    @Test
    void commentSynchronize() {

        CommentSyncRawBody req = CommentSyncRawBody.builder().comments(
                new ArrayList<Comment>() {{
                    add(Comment.builder().mediaId("452229862267457536").userId("12345").createdAt(1583241345076L).content("content1").thirdId("22").build());
                    add(Comment.builder().mediaId("452229862267457536").userId("12345").createdAt(1583241345076L).content("content2").thirdId("22").build());
                }}
        ).build();
        System.out.println(

                new MediaSynchronizeServiceImpl().commentSynchronize(req, NotSubmit.app)
        );

    }
    @Test
    void commentLikeSynchronize() {

        CommentLikeSyncRawBody req = CommentLikeSyncRawBody.builder().commentLikes(
                new ArrayList<CommentLike>() {{
                    add(CommentLike.builder().mediaId("452229862267457536").userId("12345").createdAt(1583241345076L).commentId("452229862267457536").build());
                    add(CommentLike.builder().mediaId("452229862267457536").userId("12345").createdAt(1583241345075L).commentId("452229862267457537").build());
                }}
        ).build();
        System.out.println(

                new MediaSynchronizeServiceImpl().commentLikeSynchronize(req, NotSubmit.app)
        );

    }
    @Test
    void articleSynchronize() {

        ArticleSynchronizeRawBody req = ArticleSynchronizeRawBody.builder().articles(
                new ArrayList<ArticleSynchronize>() {{
                    add(ArticleSynchronize.builder().title("this is title").userId("23456789").content("this is content").h5content("org")
                            .os(OsType.OsIos.ordinal()).deviceId("").ip("192.168.0.0").longitude(122.2).latitude(67.6).source(Source.SourceAdminUpload.ordinal())
                            .thirdId("6789").thirdExtra("thirdExtra").createdAt(1583241345076L).mediaType(MediaType.MediaTypeGallery.ordinal()).build());
                }}
        ).build();

        System.out.println(

                new MediaSynchronizeServiceImpl().articleSynchronize(req, NotSubmit.app)
        );

    }
    @Test
    void videoSynchronize() {
        VideoSyncRawBody body = VideoSyncRawBody.builder().videos(
                new ArrayList<Video>(){{
                    add(Video.builder().userId("23456789").title("this is title")
                            .uploadType(0).orgFileName("ogr").os(0)
                            .deviceId("").ip("192.168.0.0").longitude(122F)
                            .latitude(67F).source(0).thirdId("1234")
                            .thirdExtra("").createdAt(1583241345076L).build());

                }}
        ).build();
        System.out.println(

                new MediaSynchronizeServiceImpl().videoSynchronize(body, NotSubmit.app)
        );

    }



}