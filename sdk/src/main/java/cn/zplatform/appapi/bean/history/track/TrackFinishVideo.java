package cn.zplatform.appapi.bean.history.track;

import cn.zplatform.appapi.bean.history.Event;
import cn.zplatform.appapi.bean.history.EventCommon;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 观看视频
 *
 * @author Lilac
 * 2020-04-01
 */
@Builder
@AllArgsConstructor
@Data
public class TrackFinishVideo extends EventCommon {

    private String contentId;
    private int contentType;

    public TrackFinishVideo(Event event, long contentId, int contentType ){
        super(event);
        this.contentId = contentId + "";
        this.contentType = contentType;
    }
}
