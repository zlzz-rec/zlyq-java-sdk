package cn.zplatform.appapi.bean.history;

import lombok.Getter;

/**
 * Event 埋点事件
 *
 * @author Lilac
 * 2020-04-01
 */
@Getter
public enum Event {
    EventRegister("register"),
    EventLogin("login"),
    EventFinishVideo("finishVideo"),
    EventLike("like"),
    EventDislike("dislike"),
    EventComment("comment"),
    EventLikeComment("likeComment"),
    EventDislikeComment("dislikeComment"),
    EventFollow("follow"),
    EventShare("share"),
    ;

    private final String event;

    Event(String value) {
        this.event = value;
    }


}
