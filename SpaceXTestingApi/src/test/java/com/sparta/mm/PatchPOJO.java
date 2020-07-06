package com.sparta.mm;

import com.google.gson.annotations.SerializedName;

public class PatchPOJO {

    @SerializedName("large")
    private String mLarge;
    @SerializedName("small")
    private String mSmall;

    public String getmLarge() {
        return mLarge;
    }
    public void setmLarge(String mLarge) {
        this.mLarge = mLarge;
    }
    public String getmSmall() {
        return mSmall;
    }
    public void setmSmall(String mSmall) {
        this.mSmall = mSmall;
    }
}
