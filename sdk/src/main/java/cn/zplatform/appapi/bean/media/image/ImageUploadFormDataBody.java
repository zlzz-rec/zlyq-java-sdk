package cn.zplatform.appapi.bean.media.image;

import cn.zplatform.appapi.http.FormDataBody;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.File;

/**
 * 上传图片
 *
 * @author Lilac
 * 2020-04-15
 */
@Builder
@AllArgsConstructor
@Data
public class ImageUploadFormDataBody implements FormDataBody {

    String description;
    File image;
    String userId;
    Integer source;
    String thirdId;
    String thirdExtra;
}
