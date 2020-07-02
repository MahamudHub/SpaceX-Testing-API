package com.sparta.mm;



public class SpaceXDTO {

    private Object fullResponse;
    private Object headerResponse;
    private JacksonURLReader urlReader;

    public SpaceXDTO(String url) {
        urlReader = new JacksonURLReader();
        fullResponse = urlReader.readURLAsJSON(url);
       // headerResponse = fullResponse.
    }

    public String getStatus() {
        return (String) urlReader.getStatus("https://api.spacexdata.com/v4/launches/latest");
    }

//    public Long getTimestamp() {
//        return (Long) fullResponse.get("timestamp");
//    }
//
//    public String getStringJSONFile(String key) {
//        return (String) fullResponse.get(key);
//    }
//
//    public Integer getAllRates() {
//        return (Integer) fullResponse.size();
//    }
//
//    public Double getRate(String key) {
//        return (Double) fullResponse.get(key);
//    }
}
