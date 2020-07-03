package com.sparta.mm;


import java.awt.*;
import java.net.URL;
import java.util.List;

public class SpaceXDTO {
    private SpaceXPOJO fullSpaceX;
    private JacksonURLReader urlReader;

    public SpaceXDTO(String url) {
        urlReader = new JacksonURLReader();
        fullSpaceX = urlReader.readURLAsJSON(url);
    }

    public String getStatus() {
        return (String) urlReader.getStatus("https://api.spacexdata.com/v4/launches/latest");
    }

    public Boolean getReuse() {
        return (Boolean) fullSpaceX.getFairings().getReused();
    }

    public Boolean getRecovered() {
        return (Boolean) fullSpaceX.getFairings().getRecovered();
    }

    public Boolean getRecoveryAttempt() {
        return (Boolean) fullSpaceX.getFairings().getRecoveryAttempt();
    }

    public List getShips() {
        return (List) fullSpaceX.getFairings().getShips();
    }

    public String getArticleLink() {
        return (String) fullSpaceX.getLinks().getArticle();
    }

    public String getPatchSmall() {
        return (String) fullSpaceX.getLinks().getPatch().getmSmall();
    }

    public String getPatchLarge() {
        return (String) fullSpaceX.getLinks().getPatch().getmLarge();
    }

    public String getCampaignLink() {
        return (String) fullSpaceX.getLinks().getReddit().getCampaign();
    }

    public String getLaunchLink() {
        return (String) fullSpaceX.getLinks().getReddit().getLaunch();
    }

    public String getMediaLink() {
        return (String) fullSpaceX.getLinks().getReddit().getMedia();
    }

    public String getRecoveryLink() {
        return (String) fullSpaceX.getLinks().getReddit().getRecovery();
    }

    public List getFlickrLinkSmall() {
        return (List) fullSpaceX.getLinks().getFlickr().getSmall();
    }

    public List getFlickrLinkOriginal() {
        return (List) fullSpaceX.getLinks().getFlickr().getOriginal();
    }

    public String getPressKitLink() {
        return (String) fullSpaceX.getLinks().getPresskit();
    }

    public String getWebcastLink() {
        return (String) fullSpaceX.getLinks().getWebcast();
    }

    public String getYoutubeId() {
        return (String) fullSpaceX.getLinks().getYoutubeId();
    }

    public String getWikiLink() {
        return (String) fullSpaceX.getLinks().getWikipedia();
    }

    public String getFireDateUnix() {
        return (String) fullSpaceX.getStaticFireDateUnix();
    }

    public String getStaticFireDateUtc() {
        return (String) fullSpaceX.getStaticFireDateUtc();
    }

    public Boolean getTbd() {
        return (Boolean) fullSpaceX.getTbd();
    }

    public Boolean getNet() {
        return (Boolean) fullSpaceX.getNet();
    }

    public String getWindow() {
        return (String) fullSpaceX.getWindow();
    }

    public String getRocket() {
        return (String) fullSpaceX.getRocket();
    }

    public Boolean getSuccess() {
        return (Boolean) fullSpaceX.getSuccess();
    }

    public List getFailures() {
        return (List) fullSpaceX.getFailures();
    }

    public String getDetails() {
        return (String) fullSpaceX.getDetails();
    }

    public List getCrew() {
        return (List) fullSpaceX.getCrew();
    }

    public List getShip() {
        return (List) fullSpaceX.getShips();
    }

    public List getCapsules() {
        return (List) fullSpaceX.getCapsules();
    }

    public List getPayloads() {
        return (List) fullSpaceX.getPayloads();
    }

    public String getLaunchpad() {
        return (String) fullSpaceX.getLaunchpad();
    }

    public Boolean getAutoUpdate() {
        return (Boolean) fullSpaceX.getAutoUpdate();
    }

    public Long getFlightNumber() {
        return (Long) fullSpaceX.getFlightNumber();
    }

    public String getName() {
        return (String) fullSpaceX.getName();
    }

    public String getDateUtc() {
        return (String) fullSpaceX.getDateUtc();
    }

    public Long getDateUnix() {
        return (Long) fullSpaceX.getDateUnix();
    }

    public String getDateLocal() {
        return (String) fullSpaceX.getDateLocal();
    }

    public String getDatePrecision() {
        return (String) fullSpaceX.getDatePrecision();
    }

    public Boolean getUpcoming() {
        return (Boolean) fullSpaceX.getUpcoming();
    }

    public void getCore() {
        /*
        return (List<CorePOJO>) fullSpaceX.getCores().get(9).getCore();
    }

    public Integer geFlight() {
        return (Integer) fullSpaceX.getCores().get(9).getFlight();
    }

    public List<CorePOJO> getCoreGridfins() {
        return (List<CorePOJO>) fullSpaceX.getCores().get(9).getGridfins();
    }

    public List<CorePOJO> getCoreLegs() {
        return (List<CorePOJO>) fullSpaceX.getCores().get(9).getLegs();
    }

    public List<CorePOJO> getCoreReuse() {
        return (List<CorePOJO>) fullSpaceX.getCores().get(9).getReused();
    }

    public List<CorePOJO> getCoreLandingAttempt() {
        return (List<CorePOJO>) fullSpaceX.getCores().get(9).getLandingAttempt();
    }

    public List<CorePOJO> getCoreLandingSuccess() {
        return (List<CorePOJO>) fullSpaceX.getCores().get(9).getLandingSuccess();
    }

    public List<CorePOJO> getCoreLandingType() {
        return (List<CorePOJO>) fullSpaceX.getCores().get(9).getLandingType();
    }

    public List<CorePOJO> getCoreLandpad() {
        return (List<CorePOJO>) fullSpaceX.getCores().get(9).getLandpad();
    */
    }

    public String getId() {
        return (String) fullSpaceX.getId();
    }

    public void openLink(String link) {
        try {
            Desktop.getDesktop().browse(new URL(link).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
