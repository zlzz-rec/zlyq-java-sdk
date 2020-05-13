package cn.zplatform.appapi.bean.history;

import cn.zplatform.appapi.http.RawBody;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * TrackInfo
 * 参见 中台API文档 https://wiki.zplatform.cn/pages/server_history_iface.html
 * @author Lilac
 * 2020-04-01
 */
@Data
@Builder
@AllArgsConstructor
public class TrackInfo implements RawBody {

    private TrackCommon common;
    private List<EventCommon> properties;
}
