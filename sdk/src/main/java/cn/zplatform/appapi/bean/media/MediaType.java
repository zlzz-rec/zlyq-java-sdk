package cn.zplatform.appapi.bean.media;

/**
 * 媒资类型
 *
 * @author Lilac
 * 2020-04-15
 */
public enum MediaType {
    MediaTypeVideo(1), // 视频
    MediaTypeGallery(2), // 图集
    MediaTypeArticle(3), // 图文
    MediaTypeLink(4), // 外链
    MediaTypeImage(10) // 图片
    ;
    
    private final int event;

    MediaType(Integer value) {
        this.event = value;
    }
}
