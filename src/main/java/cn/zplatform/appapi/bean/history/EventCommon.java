package cn.zplatform.appapi.bean.history;


import lombok.Data;

/**
 * EventCommon 预置属性
 *
 * @author Lilac
 * 2020-03-31
 */

@Data
public abstract class EventCommon {

    private String event;
    private long eventTime;
    private String feedConfigId;
    private String requestId;
    private String abtestIds;

    public EventCommon(Event event){
        this();
        this.event = event.getEvent();
    }

    public EventCommon(){
        this.event = "";
        this.eventTime = System.currentTimeMillis();
        this.feedConfigId = "";
        this.requestId = "";
        this.abtestIds = "";
    }


}
