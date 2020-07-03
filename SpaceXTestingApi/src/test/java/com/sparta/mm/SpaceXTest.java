package com.sparta.mm;


import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpaceXTest {
    Logger logger = LogManager.getLogger(SpaceXTest.class);

    SpaceXDTO spaceXDTO = new SpaceXDTO("https://api.spacexdata.com/v4/launches/latest");
    HeaderDTO headerDTO = new HeaderDTO();

    @Test
    void statusTest(){
        logger.info(headerDTO.getHeaderContentType());
        assertEquals("200",spaceXDTO.getStatus());
    }
}
