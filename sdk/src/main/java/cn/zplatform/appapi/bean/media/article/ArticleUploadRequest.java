package cn.zplatform.appapi.bean.media.article;

import cn.zplatform.appapi.http.RequestBody;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * 上传图文请求包
 * 参见 中台API文档 https://wiki.zplatform.cn/pages/server_media_iface.html
 *
 * @author Lilac
 * 2020-04-14
 */

@Builder
@AllArgsConstructor
@Data
public class ArticleUploadRequest implements RequestBody {

    List<String > coverIds;
    List<String > galleryIds;
    String title;
    String content;
    int os;
    int source;
    int mediaType;
    String h5content;
    String thirdId;
    String thirdExtra;
    String userId;

}
