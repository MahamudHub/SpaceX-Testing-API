
package com.sparta.mm;

import java.util.List;
import com.google.gson.annotations.SerializedName;



public class FlickrPOJO {

    @SerializedName("original")
    private List<Object> mOriginal;
    @SerializedName("small")
    private List<Object> mSmall;

    public List<Object> getOriginal() {
        return mOriginal;
    }

    public void setOriginal(List<Object> original) {
        mOriginal = original;
    }

    public List<Object> getSmall() {
        return mSmall;
    }

    public void setSmall(List<Object> small) {
        mSmall = small;
    }

}
