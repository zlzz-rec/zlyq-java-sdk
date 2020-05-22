package cn.zplatform.appapi.bean.track;

/**
 * 网络模式
 *
 * @author Lilac
 * 2020-05-22
 */
public enum Carrier {

    CHINE_TELECOM("中国电信"),
    CHINA_MOBILE("中国移动"),
    CHINA_UNICOM("中国联通");

    private final String carrier;

    Carrier(String value) {
        this.carrier = value;
    }
    public String value(){
        return this.carrier;
    }
}
