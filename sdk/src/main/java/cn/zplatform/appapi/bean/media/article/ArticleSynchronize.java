package cn.zplatform.appapi.bean.media.article;

import cn.zplatform.appapi.bean.media.MediaType;
import cn.zplatform.appapi.bean.media.OsType;
import cn.zplatform.appapi.bean.media.Source;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 同步评论信息
 * 参见 中台API文档 https://wiki.zplatform.cn/pages/server_media_iface.html
 *
 * @author Lilac
 * 2020-04-14
 */
@Builder
@AllArgsConstructor
@Data
public class ArticleSynchronize {
    String title;
    String userId;
    String content;
    String h5content;
    int os;
    String deviceId;
    String ip;
    double longitude;
    double latitude;
    int source;
    String thirdId;
    String thirdExtra;
    Long createdAt;
    int mediaType;

}
