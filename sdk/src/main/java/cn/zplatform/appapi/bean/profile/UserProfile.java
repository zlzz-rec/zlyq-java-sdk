package cn.zplatform.appapi.bean.profile;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;


@Builder
@AllArgsConstructor
@Data
public class UserProfile {
    String user_id;
    String distinct_id;
    String udid;
    String birthday;
    String name;
    String gender;
    String browser;
    String browser_version;
    String first_visit_time;
    String utm_source;
    String utm_media;
    String utm_campaign;
    String utm_content;
    String utm_term;
    String os;
    String os_version;
    String sdk_type;
    String sdk_version;
    String app_version;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    Date update_time;
}
