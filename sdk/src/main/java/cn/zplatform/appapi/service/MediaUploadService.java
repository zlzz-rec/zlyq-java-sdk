package cn.zplatform.appapi.service;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.bean.image.ImageUploadFormDataBody;
import cn.zplatform.appapi.bean.media.article.ArticleUploadRawBody;

/**
 * 图片数据同步
 *
 * @author Lilac
 * 2020-04-14
 */
public interface MediaUploadService extends AppService {

    /**
     *  上传图片
     * @param body 请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String uploadImage(ImageUploadFormDataBody body, InitConfig initConfig);


    /**
     *  上传图文
     * @param body 请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String uploadArticle(ArticleUploadRawBody body, InitConfig initConfig);

}
