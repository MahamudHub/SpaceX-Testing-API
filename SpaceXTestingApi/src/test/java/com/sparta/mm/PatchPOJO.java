
package com.sparta.mm;


import com.google.gson.annotations.SerializedName;


public class PatchPOJO {

    @SerializedName("large")
    private Object mLarge;
    @SerializedName("small")
    private Object mSmall;

    public Object getLarge() {
        return mLarge;
    }

    public void setLarge(Object large) {
        mLarge = large;
    }

    public Object getSmall() {
        return mSmall;
    }

    public void setSmall(Object small) {
        mSmall = small;
    }

}
