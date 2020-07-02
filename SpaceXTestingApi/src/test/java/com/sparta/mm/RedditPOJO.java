
package com.sparta.mm;

import com.google.gson.annotations.SerializedName;

public class RedditPOJO {

    @SerializedName("campaign")
    private String mCampaign;
    @SerializedName("launch")
    private String mLaunch;
    @SerializedName("media")
    private Object mMedia;
    @SerializedName("recovery")
    private Object mRecovery;

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

    public Object getMedia() {
        return mMedia;
    }

    public void setMedia(Object media) {
        mMedia = media;
    }

    public Object getRecovery() {
        return mRecovery;
    }

    public void setRecovery(Object recovery) {
        mRecovery = recovery;
    }

}
