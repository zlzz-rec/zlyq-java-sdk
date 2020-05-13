package cn.zplatform.appapi.bean.media_statistic;

import cn.zplatform.appapi.http.RawBody;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

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
public class CommentSyncRawBody implements RawBody {
    List<Comment> comments;
}
