package cn.zplatform.appapi.bean.history;

import lombok.Data;

/**
 * TrackCommon 预置属性
 *
 * @author Lilac
 * 2020-04-01
 */
@Data
public class TrackCommon {

    private String udid;
    private String userId;
    private long distinctId;
    private String appId;
    private int platform;
    private long time;
    private String iosSdkVersions;
    private String androidSdkVersions;
    private int screenHeight;
    private int screenWidth;
    private String manufacturer;
    private int network;
    private int os;
    private String osVersion;
    private String ip;
    private String country;
    private String province;
    private String city;
    private String carrier;
    private String utmSource;
    private String utmMedia;
    private String utmCampaign;
    private String utmContent;
    private String utmTerm;
    private String appVersion;

    public TrackCommon (String udid, long userId, long distinctId, long appId ){
        this();
        this.udid = udid;
        this.userId = userId + "";
        this.distinctId = distinctId;
        this.appId = appId + "";

    }
    public TrackCommon(){
        this.udid = "";
        this.userId = "";
        this.distinctId = 0;
        this.appId = "";
        this.platform = 0;
        this.time = 0;
        this.iosSdkVersions = "";
        this.androidSdkVersions = "";
        this.screenHeight = 0;
        this.screenWidth = 0;
        this.manufacturer = "";
        this.network = 0;
        this.os = 0;
        this.osVersion = "";
        this.ip = "";
        this.country = "";
        this.province = "";
        this.city = "";
        this.carrier = "";
        this.utmSource = "";
        this.utmMedia = "";
        this.utmCampaign = "";
        this.utmContent = "";
        this.utmTerm = "";
        this.appVersion = "";
    }
}
