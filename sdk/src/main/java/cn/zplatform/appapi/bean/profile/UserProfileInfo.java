package cn.zplatform.appapi.bean.profile;

import cn.zplatform.appapi.bean.track.DebugMode;
import cn.zplatform.appapi.http.RawBody;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Builder
@AllArgsConstructor
@Data
public class UserProfileInfo implements RawBody {
    Integer project_id;
    String debug_mode;
    String type;
    UserProfileCommon common;
    UserProfile property;

    public UserProfileInfo(){
        this.project_id = 0;
        this.debug_mode = DebugMode.NO_DEBUG_MODE.value();
        this.type = "user_profile";
    }

    public UserProfileInfo(Integer project_id, UserProfileCommon common, UserProfile property) {
        this();
        this.project_id = project_id;
        this.common = common;
        this.property = property;
    }

}
