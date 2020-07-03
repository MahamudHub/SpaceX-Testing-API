package com.sparta.mm;

import java.util.Map;

public class HeaderDTO {
    URLReader urlReader = new URLReader();
    String link = "https://api.spacexdata.com/v4/launches/latest";

    public Map getAllHeader() {
        return urlReader.getHeader(link);
    }

    public String getHeaderField(String field) {
        return urlReader.getHeaderSingleField(link, field);
    }

    public Boolean getHeaderIsEmpty() {
        return getAllHeader().isEmpty();
    }

    public int getHeaderSize() {
        return getAllHeader().size();
    }

    public Boolean getHeaderContainsKey(String key) {
        return getAllHeader().containsKey(key);
    }

    public Boolean getHeaderContainsValue(String value) {
        return getAllHeader().containsValue(value);
    }

    public String getHeaderDate() {
        return getHeaderField("Date");
    }

    public String getHeaderContentType() {
        return getHeaderField("Content-Type");
    }

    public String getHeaderTransferEncoding() {
        return getHeaderField("Transfer-Encoding");
    }

    public String getHeaderConnection() {
        return getHeaderField("Connection");
    }

    public String getHeaderAllowOrigin() {
        return getHeaderField("Access-Control-Allow-Origin");
    }

    public String getHeaderCacheControl() {
        return getHeaderField("Cache-Control");
    }

    public String getHeaderSpaceXApiCache() {
        return getHeaderField("Spacex-Api-Cache");
    }

    public String getHeaderExposeHeaders() {
        return getHeaderField("Access-Control-Expose-Headers");
    }

    public String getHeaderCacheOnline() {
        return getHeaderField("Spacex-Api-Cache-Online");
    }

    public String getHeaderResponseTimers() {
        return getHeaderField("Spacex-Api-Response-Time");
    }

    public String getHeaderServer() {
        return getHeaderField("Server");
    }

    public String getHeaderXFrameOptions() {
        return getHeaderField("X-Frame-Options");
    }

    public String getHeaderVary() {
        return getHeaderField("Vary");
    }
}
