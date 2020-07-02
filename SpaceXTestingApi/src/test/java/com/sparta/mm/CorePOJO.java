
package com.sparta.mm;


import com.google.gson.annotations.SerializedName;

public class CorePOJO {

    @SerializedName("core")
    private String mCore;
    @SerializedName("flight")
    private Long mFlight;
    @SerializedName("gridfins")
    private Boolean mGridfins;
    @SerializedName("landing_attempt")
    private Boolean mLandingAttempt;
    @SerializedName("landing_success")
    private Boolean mLandingSuccess;
    @SerializedName("landing_type")
    private String mLandingType;
    @SerializedName("landpad")
    private String mLandpad;
    @SerializedName("legs")
    private Boolean mLegs;
    @SerializedName("reused")
    private Boolean mReused;

    public String getCore() {
        return mCore;
    }

    public void setCore(String core) {
        mCore = core;
    }

    public Long getFlight() {
        return mFlight;
    }

    public void setFlight(Long flight) {
        mFlight = flight;
    }

    public Boolean getGridfins() {
        return mGridfins;
    }

    public void setGridfins(Boolean gridfins) {
        mGridfins = gridfins;
    }

    public Boolean getLandingAttempt() {
        return mLandingAttempt;
    }

    public void setLandingAttempt(Boolean landingAttempt) {
        mLandingAttempt = landingAttempt;
    }

    public Boolean getLandingSuccess() {
        return mLandingSuccess;
    }

    public void setLandingSuccess(Boolean landingSuccess) {
        mLandingSuccess = landingSuccess;
    }

    public String getLandingType() {
        return mLandingType;
    }

    public void setLandingType(String landingType) {
        mLandingType = landingType;
    }

    public String getLandpad() {
        return mLandpad;
    }

    public void setLandpad(String landpad) {
        mLandpad = landpad;
    }

    public Boolean getLegs() {
        return mLegs;
    }

    public void setLegs(Boolean legs) {
        mLegs = legs;
    }

    public Boolean getReused() {
        return mReused;
    }

    public void setReused(Boolean reused) {
        mReused = reused;
    }

}
