package cn.zplatform.appapi.bean.track;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * event埋点预置属性
 *
 * @author Lilac
 * 2020-05-22
 */

@Builder
@AllArgsConstructor
@Data
public class TrackCommon {

    String udid;
    String user_id;
    String distinct_id;
    Integer app_id;
    String platform;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    Date time;
    String sdk_type;
    String sdk_version;
    Float screen_height;
    Float screen_width;
    String manufacturer;
    String model;
    String network;
    String os;
    String os_version;
    String carrier;
    String app_version;

}
