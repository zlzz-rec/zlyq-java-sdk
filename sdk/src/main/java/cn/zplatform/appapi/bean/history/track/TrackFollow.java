package cn.zplatform.appapi.bean.history.track;

import cn.zplatform.appapi.bean.history.EventCommon;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 关注
 *
 * @author Lilac
 * 2020-04-01
 */
@Builder
@AllArgsConstructor
@Data
public class TrackFollow extends EventCommon {

    private String contentId;
    private int contentType;
    private String AuthorId;


}
