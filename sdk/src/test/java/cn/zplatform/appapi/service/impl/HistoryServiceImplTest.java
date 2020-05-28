package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.bean.history.*;
import cn.zplatform.appapi.bean.history.track.TrackFinishVideo;
import cn.zplatform.appapi.bean.history.track.TrackLike;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
class HistoryServiceImplTest {

    private static TrackInfo trackInfo ;

    @BeforeAll
    public static void init() {
        TrackCommon common = new TrackCommon("JKAFJ-LAKJS-JAKSJ-IWNSK",
                450007472627785728L,
                450007472627785728L,
                450007472627785728L );

        List<EventCommon> properties = new ArrayList<EventCommon>(){{
            add(new TrackLike(Event.EventLike,
                    1291872937198273L,
                    ContentType.ContentTypeVideo.getContentType()));
            add(new TrackFinishVideo(Event.EventFinishVideo,
                    1291872937198273L,
                    ContentType.ContentTypeVideo.getContentType()));
        }};

        trackInfo = TrackInfo.builder()
                .common(common)
                .properties(properties)
                .build();
    }

    @Test
    void historySynchronize() {
        String response = new HistoryServiceImpl().historySynchronize(trackInfo, NotSubmit.track);
        log.info(response);
    }
}