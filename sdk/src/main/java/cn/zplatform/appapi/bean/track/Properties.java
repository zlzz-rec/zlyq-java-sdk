package cn.zplatform.appapi.bean.track;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

/**
 * 属性
 *
 * @author Lilac
 * 2020-05-22
 */


@Data
public class Properties {

    String event;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    Date event_time;
    Integer is_first_day;
    Integer is_first_time;
    Integer is_login;

    public Properties() {
        this.event = "";
        this.event_time = new Date();
        this.is_first_day = 0;
        this.is_first_time = 0;
        this.is_login = 0;
    }
}
