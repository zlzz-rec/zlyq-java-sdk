package cn.zplatform.appapi.bean.track;


import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class AppStart extends Properties {

    public AppStart(){
        super();
        this.event = "appStart";
        this.event_time = new Date(System.currentTimeMillis());
    }
}
