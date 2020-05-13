package cn.zplatform.appapi.bean.media_statistic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 上传视频请求包
 * 参见 中台API文档 https://wiki.zplatform.cn/pages/server_media_iface.html
 *
 * @author Lilac
 * 2020-04-14
 */
@Builder
@AllArgsConstructor
@Data
public class Video {
    String title;
    String userId;
    String content;
    Integer uploadType;
    String orgFileName;
    Integer os;
    String deviceId;
    String ip;
    Float longitude;
    Float latitude;
    Long audioId;
    Integer source;
    String thirdId;
    String thirdExtra;
    Long createdAt;
}
