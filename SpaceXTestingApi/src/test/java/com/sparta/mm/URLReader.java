package com.sparta.mm;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class URLReader {
    ObjectMapper objectMapper = getDefaultObjectMapper();

    private ObjectMapper getDefaultObjectMapper() {
        ObjectMapper defaultObjectMapper = new ObjectMapper();
        return defaultObjectMapper;
    }

    public SpaceXPOJO readURLAsJSON(String path) {
        SpaceXPOJO spaceXPOJO = new SpaceXPOJO();
        try {
            objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            spaceXPOJO = objectMapper.readValue(new URL(path), SpaceXPOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return spaceXPOJO;
    }

    public Map getHeader(String path) {
        String response = "";
        URLConnection urlConnection = null;
        try {
            URL url = new URL(path);
            urlConnection = url.openConnection();
             urlConnection.getHeaderFields();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return urlConnection.getHeaderFields();

    }

    public String getHeaderSingleField(String path , String field) {
        String response = "";
        URLConnection urlConnection = null;
        try {
            URL url = new URL(path);
            urlConnection = url.openConnection();
            urlConnection.getHeaderFields();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return urlConnection.getHeaderField(field);

    }

    public String getStatus(String path) {
        String response = "";
        try {
            URL url = new URL(path);
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            response = String.valueOf(httpURLConnection.getResponseCode());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
