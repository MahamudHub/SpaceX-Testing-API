
package com.sparta.mm;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class SpaceXPOJO {

    @SerializedName("auto_update")
    private Boolean mAutoUpdate;
    @SerializedName("capsules")
    private List<Object> mCapsules;
    @SerializedName("cores")
    private List<CorePOJO> mCores;
    @SerializedName("crew")
    private List<Object> mCrew;
    @SerializedName("date_local")
    private String mDateLocal;
    @SerializedName("date_precision")
    private String mDatePrecision;
    @SerializedName("date_unix")
    private Long mDateUnix;
    @SerializedName("date_utc")
    private String mDateUtc;
    @SerializedName("details")
    private String mDetails;
    @SerializedName("failures")
    private List<Object> mFailures;
    @SerializedName("fairings")
    private FairingsPOJO mFairings;
    @SerializedName("flight_number")
    private Long mFlightNumber;
    @SerializedName("id")
    private String mId;
    @SerializedName("launchpad")
    private String mLaunchpad;
    @SerializedName("links")
    private LinksPOJO mLinks;
    @SerializedName("name")
    private String mName;
    @SerializedName("net")
    private Boolean mNet;
    @SerializedName("payloads")
    private List<String> mPayloads;
    @SerializedName("rocket")
    private String mRocket;
    @SerializedName("ships")
    private List<Object> mShips;
    @SerializedName("static_fire_date_unix")
    private Object mStaticFireDateUnix;
    @SerializedName("static_fire_date_utc")
    private Object mStaticFireDateUtc;
    @SerializedName("success")
    private Boolean mSuccess;
    @SerializedName("tbd")
    private Boolean mTbd;
    @SerializedName("upcoming")
    private Boolean mUpcoming;
    @SerializedName("window")
    private Object mWindow;

    public Boolean getAutoUpdate() {
        return mAutoUpdate;
    }

    public void setAutoUpdate(Boolean autoUpdate) {
        mAutoUpdate = autoUpdate;
    }

    public List<Object> getCapsules() {
        return mCapsules;
    }

    public void setCapsules(List<Object> capsules) {
        mCapsules = capsules;
    }

    public List<CorePOJO> getCores() {
        return mCores;
    }

    public void setCores(List<CorePOJO> cores) {
        mCores = cores;
    }

    public List<Object> getCrew() {
        return mCrew;
    }

    public void setCrew(List<Object> crew) {
        mCrew = crew;
    }

    public String getDateLocal() {
        return mDateLocal;
    }

    public void setDateLocal(String dateLocal) {
        mDateLocal = dateLocal;
    }

    public String getDatePrecision() {
        return mDatePrecision;
    }

    public void setDatePrecision(String datePrecision) {
        mDatePrecision = datePrecision;
    }

    public Long getDateUnix() {
        return mDateUnix;
    }

    public void setDateUnix(Long dateUnix) {
        mDateUnix = dateUnix;
    }

    public String getDateUtc() {
        return mDateUtc;
    }

    public void setDateUtc(String dateUtc) {
        mDateUtc = dateUtc;
    }

    public String getDetails() {
        return mDetails;
    }

    public void setDetails(String details) {
        mDetails = details;
    }

    public List<Object> getFailures() {
        return mFailures;
    }

    public void setFailures(List<Object> failures) {
        mFailures = failures;
    }

    public FairingsPOJO getFairings() {
        return mFairings;
    }

    public void setFairings(FairingsPOJO fairings) {
        mFairings = fairings;
    }

    public Long getFlightNumber() {
        return mFlightNumber;
    }

    public void setFlightNumber(Long flightNumber) {
        mFlightNumber = flightNumber;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getLaunchpad() {
        return mLaunchpad;
    }

    public void setLaunchpad(String launchpad) {
        mLaunchpad = launchpad;
    }

    public LinksPOJO getLinks() {
        return mLinks;
    }

    public void setLinks(LinksPOJO links) {
        mLinks = links;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Boolean getNet() {
        return mNet;
    }

    public void setNet(Boolean net) {
        mNet = net;
    }

    public List<String> getPayloads() {
        return mPayloads;
    }

    public void setPayloads(List<String> payloads) {
        mPayloads = payloads;
    }

    public String getRocket() {
        return mRocket;
    }

    public void setRocket(String rocket) {
        mRocket = rocket;
    }

    public List<Object> getShips() {
        return mShips;
    }

    public void setShips(List<Object> ships) {
        mShips = ships;
    }

    public Object getStaticFireDateUnix() {
        return mStaticFireDateUnix;
    }

    public void setStaticFireDateUnix(Object staticFireDateUnix) {
        mStaticFireDateUnix = staticFireDateUnix;
    }

    public Object getStaticFireDateUtc() {
        return mStaticFireDateUtc;
    }

    public void setStaticFireDateUtc(Object staticFireDateUtc) {
        mStaticFireDateUtc = staticFireDateUtc;
    }

    public Boolean getSuccess() {
        return mSuccess;
    }

    public void setSuccess(Boolean success) {
        mSuccess = success;
    }

    public Boolean getTbd() {
        return mTbd;
    }

    public void setTbd(Boolean tbd) {
        mTbd = tbd;
    }

    public Boolean getUpcoming() {
        return mUpcoming;
    }

    public void setUpcoming(Boolean upcoming) {
        mUpcoming = upcoming;
    }

    public Object getWindow() {
        return mWindow;
    }

    public void setWindow(Object window) {
        mWindow = window;
    }

}
