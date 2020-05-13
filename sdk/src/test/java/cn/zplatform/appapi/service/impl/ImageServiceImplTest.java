package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.bean.image.ImageUploadFormDataBody;
import org.junit.jupiter.api.Test;

import java.io.File;

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
                new MediaUploadServiceImpl().uploadImage(body, NotSubmit.app)
        );
    }
}