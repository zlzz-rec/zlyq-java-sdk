package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.bean.image.ImageUploadFormDataBody;
import cn.zplatform.appapi.bean.media.article.ArticleUploadRawBody;
import cn.zplatform.appapi.bean.video.VideoFormDataBody;
import cn.zplatform.appapi.path.Path;
import cn.zplatform.appapi.service.MediaUploadService;

/**
 * 图片数据同步实现
 *
 * @author Lilac
 * 2020-03-31
 */
public class MediaUploadServiceImpl extends AbstractAppServiceImpl implements MediaUploadService {

    @Override
    public String uploadImage(ImageUploadFormDataBody body, InitConfig initConfig) {
        return post(Path.IMAGE_UPLOAD_SYNCHRONIZE, null, body, initConfig);
    }

    @Override
    public String uploadArticle(ArticleUploadRawBody body, InitConfig initConfig) {
        return post(Path.ARTICLE_UPLOAD_SYNCHRONIZE, null, body, initConfig);
    }

    @Override
    public String uploadVideo(VideoFormDataBody body, InitConfig initConfig) {
        return post(Path.VIDEO_UPLOAD_SYNCHRONIZE, null, body, initConfig);
    }

}
