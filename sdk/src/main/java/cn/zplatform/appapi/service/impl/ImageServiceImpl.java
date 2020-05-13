package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.bean.image.ImageUploadFormDataBody;
import cn.zplatform.appapi.path.Path;
import cn.zplatform.appapi.service.ImageService;

/**
 * 图片数据同步实现
 *
 * @author Lilac
 * 2020-03-31
 */
public class ImageServiceImpl extends AbstractAppServiceImpl implements ImageService {

    @Override
    public String uploadImage(ImageUploadFormDataBody body, InitConfig initConfig) {
        return post(Path.IMAGE_UPLOAD_SYNCHRONIZE, null, body, initConfig);
    }
}
