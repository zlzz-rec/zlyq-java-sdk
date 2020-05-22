package cn.zplatform.appapi.bean.track;

import cn.zplatform.appapi.http.RawBody;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * 埋点数据
 *
 * @author Lilac
 * 2020-05-22
 */

@Builder
@AllArgsConstructor
@Data
public class TrackInfo implements RawBody {
    Integer project_id;
    String debug_mode;
    String type;
    TrackCommon common = null;
    List<Properties> properties  = null;

    public TrackInfo(){
        this.debug_mode = DebugMode.NO_DEBUG_MODE.value();
        this.type = "track";
        this.project_id = 0;
    }

    public TrackInfo(Integer project_id, TrackCommon common, List<Properties> properties) {
        this();
        this.project_id = project_id;
        this.common = common;
        this.properties = properties;
    }


}

