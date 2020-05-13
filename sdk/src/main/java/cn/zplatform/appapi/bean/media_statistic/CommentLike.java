package cn.zplatform.appapi.bean.media_statistic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 同步评论点赞信息
 * 参见 中台API文档 https://wiki.zplatform.cn/pages/server_media_iface.html
 *
 * @author Lilac
 * 2020-04-14
 */
@Builder
@AllArgsConstructor
@Data
public class CommentLike {
    String mediaId;
    String userId;
    Long createdAt;
    String commentId;
}
