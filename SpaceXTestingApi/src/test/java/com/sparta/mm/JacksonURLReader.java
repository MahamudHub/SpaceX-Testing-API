package com.sparta.mm;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class JacksonURLReader {
    ObjectMapper objectMapper = getDefaultObjectMapper();

    public ObjectMapper getDefaultObjectMapper(){
        ObjectMapper defaultObjectMapper = new ObjectMapper();
        return defaultObjectMapper;
    }

    public SpaceXPOJO readURLAsJSON (String path){
        SpaceXPOJO spaceXPOJO = new SpaceXPOJO();
        try {
            objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            spaceXPOJO = objectMapper.readValue(new URL(path),SpaceXPOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return spaceXPOJO;
    }
}
