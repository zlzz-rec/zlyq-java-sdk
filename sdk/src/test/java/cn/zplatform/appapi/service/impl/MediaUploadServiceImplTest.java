package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.bean.image.ImageUploadFormDataBody;
import cn.zplatform.appapi.bean.media.MediaType;
import cn.zplatform.appapi.bean.media.OsType;
import cn.zplatform.appapi.bean.media.Source;
import cn.zplatform.appapi.bean.media.article.ArticleUploadRawBody;
import cn.zplatform.appapi.bean.video.VideoFormDataBody;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MediaUploadServiceImplTest {

    @Test
    void uploadImage() {

        ImageUploadFormDataBody body = ImageUploadFormDataBody.builder()
                .image(new File("/Users/lilac/Downloads/ef03de0563df8e573cb6b5f9ada4ff54_1440w.jpg"))
                .description("description")
                .userId("464509908264796160")
                .source(0)
                .thirdId("")
                .thirdExtra("").build();

        System.out.println(
                new MediaUploadServiceImpl().uploadImage(body, NotSubmit.app)
        );
    }

    @Test
    void uploadArticle() {

        ArticleUploadRawBody req = ArticleUploadRawBody.builder().coverIds(new ArrayList<>())
                .galleryIds(new ArrayList<String>(){{add("455522923617492992");}}).
                        title("title").content("this is content")
                .os(OsType.OsIos.ordinal())
                .source(Source.SourceAdminUpload.ordinal())
                .mediaType(MediaType.MediaTypeArticle.ordinal())
                .userId("457751121931763712")
                .h5content("").thirdId("").thirdExtra("thirdExtra").build();


        System.out.println(
                new MediaUploadServiceImpl().uploadArticle(req, NotSubmit.app)
        );

    }
    @Test
    void uploadVideo() {
        VideoFormDataBody body = VideoFormDataBody.builder()
        .image(new File("/Users/lilac/Downloads/满江红 临摹 来源 网络.jpg"))
        .video(new File("/Users/lilac/Downloads/4390863633446239.mp4"))
                .title("title")
                .content("content")
                .userId("457381777649831936")
                .orgFileName("")
                .os(0)
                .source(0)
                .thirdId("")
                .thirdExtra("").build();
        System.out.println(
                new MediaUploadServiceImpl().uploadVideo(body, NotSubmit.app)
        );
    }
}