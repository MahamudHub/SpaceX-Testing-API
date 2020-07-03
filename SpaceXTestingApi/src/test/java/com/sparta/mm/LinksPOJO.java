
package com.sparta.mm;

import com.google.gson.annotations.SerializedName;

public class LinksPOJO {

    @SerializedName("article")
    private String mArticle;
    @SerializedName("flickr")
    private FlickrPOJO mFlickr;
    @SerializedName("patch")
    private PatchPOJO mPatch;
    @SerializedName("presskit")
    private String mPresskit;
    @SerializedName("reddit")
    private RedditPOJO mReddit;
    @SerializedName("webcast")
    private String mWebcast;
    @SerializedName("wikipedia")
    private String mWikipedia;
    @SerializedName("youtube_id")
    private String mYoutubeId;

    public String getArticle() {
        return mArticle;
    }

    public void setArticle(String article) {
        mArticle = article;
    }

    public FlickrPOJO getFlickr() {
        return mFlickr;
    }

    public void setFlickr(FlickrPOJO flickr) {
        mFlickr = flickr;
    }

    public PatchPOJO getPatch() {
        return mPatch;
    }

    public void setPatch(PatchPOJO patch) {
        mPatch = patch;
    }

    public String getPresskit() {
        return mPresskit;
    }

    public void setPresskit(String presskit) {
        mPresskit = presskit;
    }

    public RedditPOJO getReddit() {
        return mReddit;
    }

    public void setReddit(RedditPOJO reddit) {
        mReddit = reddit;
    }

    public String getWebcast() {
        return mWebcast;
    }

    public void setWebcast(String webcast) {
        mWebcast = webcast;
    }

    public String getWikipedia() {
        return mWikipedia;
    }

    public void setWikipedia(String wikipedia) {
        mWikipedia = wikipedia;
    }

    public String getYoutubeId() {
        return mYoutubeId;
    }

    public void setYoutubeId(String youtubeId) {
        mYoutubeId = youtubeId;
    }

}
