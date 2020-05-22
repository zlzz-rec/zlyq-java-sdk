package cn.zplatform.appapi.bean.track;

/**
 * 网络 类型
 *
 * @author Lilac
 * 2020-05-22
 */
public enum Network {
    N_3G("3G"),
    N_4G("4G"),
    N_5G("5G"),
    N_WIFI("wifi");

    private final String network;

    Network(String value) {
        this.network = value;
    }

    public String value(){
        return this.network;
    }
}
