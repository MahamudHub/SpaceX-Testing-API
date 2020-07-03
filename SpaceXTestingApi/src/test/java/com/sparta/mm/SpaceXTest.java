package com.sparta.mm;

import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpaceXTest {
    Logger logger = LogManager.getLogger(SpaceXTest.class);
    String urlLink = "https://api.spacexdata.com/v4/launches/latest";

    SpaceXDTO spaceXDTO = new SpaceXDTO(urlLink);
    HeaderDTO headerDTO = new HeaderDTO();

    @Test
    void statusTest(){
        logger.info(spaceXDTO.getStatus());
        assertEquals("200",spaceXDTO.getStatus());
    }
    @Test
    void headerSizeTest(){
        logger.info(headerDTO.getHeaderSize());
        assertEquals(26, headerDTO.getHeaderSize());
    }

    @Test
    void redditTest(){
        logger.info(spaceXDTO.getCampaignLink());
        assertEquals("https://www.reddit.com/r/spacex/comments/gzeshn/gps_iii_sv03_launch_campaign_thread/",spaceXDTO.getCampaignLink());
        spaceXDTO.openLink(spaceXDTO.getCampaignLink());
    }

}