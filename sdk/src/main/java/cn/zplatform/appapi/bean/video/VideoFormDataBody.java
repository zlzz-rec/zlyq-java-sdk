package cn.zplatform.appapi.bean.video;

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
public class VideoFormDataBody implements FormDataBody {

    File video;
    File image;
    String title;
    String content;
    String orgFileName;
    Integer os;
    Integer source;
    String userId;
    String thirdId;
    String thirdExtra;

}