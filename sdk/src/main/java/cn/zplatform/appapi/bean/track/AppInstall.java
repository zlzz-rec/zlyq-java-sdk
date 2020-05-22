package cn.zplatform.appapi.bean.track;


import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class AppInstall extends Properties {

    public AppInstall(){
        super();
        this.event = "appInstall";
        this.event_time = new Date(System.currentTimeMillis());
    }

}
