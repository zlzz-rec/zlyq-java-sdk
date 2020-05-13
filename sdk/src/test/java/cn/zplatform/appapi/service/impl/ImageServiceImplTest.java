package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.bean.image.ImageUploadFormDataBody;
import cn.zplatform.appapi.bean.media_statistic.MediaLike;
import cn.zplatform.appapi.bean.media_statistic.MediaLikeSyncRawBody;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ImageServiceImplTest {

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
                new ImageServiceImpl().uploadImage(body, NotSubmit.app)
        );
    }
}