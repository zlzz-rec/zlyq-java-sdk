package cn.zplatform.appapi.bean.profile;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@AllArgsConstructor
@Data
public class UserProfileCommon {
    String distinct_id;
    String user_id ;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    Date time;
    String type;

}
