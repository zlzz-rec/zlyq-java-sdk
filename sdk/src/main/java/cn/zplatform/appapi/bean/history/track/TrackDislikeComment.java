package cn.zplatform.appapi.bean.history.track;

import cn.zplatform.appapi.bean.history.EventCommon;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 取消评论点赞
 *
 * @author Lilac
 * 2020-04-01
 */
@Builder
@AllArgsConstructor
@Data
public class TrackDislikeComment extends EventCommon {

    private String contentId;
    private int contentType;
    private String CommentId;

}
