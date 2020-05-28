package cn.zplatform.appapi.bean.track;


import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class AppEnd extends Properties {

    public AppEnd(){
        super();
        this.event = "AppEnd";
        this.event_time = new Date(System.currentTimeMillis());
    }
}
