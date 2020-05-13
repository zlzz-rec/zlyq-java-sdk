package cn.zplatform.appapi.bean.media;

/**
 * 操作系统
 *
 * @author Lilac
 * 2020-04-15
 */
public enum OsType {
    OsIos(1), // ios
    OsAndroid(2), // Android
    OsUnknown(3) // 未知
    ;

    private final int event;

    OsType(Integer value) {
        this.event = value;
    }
}
