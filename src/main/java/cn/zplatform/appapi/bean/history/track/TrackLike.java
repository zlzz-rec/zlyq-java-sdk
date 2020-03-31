package cn.zplatform.appapi.bean.history.track;

import cn.zplatform.appapi.bean.history.Event;
import cn.zplatform.appapi.bean.history.EventCommon;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 点赞/收藏
 *
 * @author Lilac
 * 2020-04-01
 */
@Builder
@AllArgsConstructor
@Data
public class TrackLike extends EventCommon {

    private String contentId;
    private int contentType;
    private int videoTime;
    private int duration;
    private int isFinish;

    public TrackLike(Event event, long contentId, int contentType ){
        super(event);
        this.contentId = contentId + "";
        this.contentType = contentType;
        this.videoTime = 0;
        this.duration = 0;
        this.isFinish = 0;
    }

}
