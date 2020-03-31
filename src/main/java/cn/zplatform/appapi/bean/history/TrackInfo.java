package cn.zplatform.appapi.bean.history;

import cn.zplatform.appapi.http.RequestBody;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * TrackInfo
 *
 * @author Lilac
 * 2020-04-01
 */
@Data
@Builder
@AllArgsConstructor
public class TrackInfo implements RequestBody {

    private TrackCommon common;
    private List<EventCommon> properties;
}
