
package com.sparta.mm;

import com.google.gson.annotations.SerializedName;

public class RedditPOJO {

    @SerializedName("campaign")
    private String mCampaign;
    @SerializedName("launch")
    private String mLaunch;
    @SerializedName("media")
    private String mMedia;
    @SerializedName("recovery")
    private String mRecovery;

    public String getCampaign() {
        return mCampaign;
    }

    public void setCampaign(String campaign) {
        mCampaign = campaign;
    }

    public String getLaunch() {
        return mLaunch;
    }

    public void setLaunch(String launch) {
        mLaunch = launch;
    }

    public String getMedia() {
        return mMedia;
    }

    public void setMedia(String media) {
        mMedia = media;
    }

    public String getRecovery() {
        return mRecovery;
    }

    public void setRecovery(String recovery) {
        mRecovery = recovery;
    }

}
