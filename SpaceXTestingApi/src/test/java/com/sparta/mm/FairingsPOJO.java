
package com.sparta.mm;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class FairingsPOJO {

    @SerializedName("recovered")
    private Object mRecovered;
    @SerializedName("recovery_attempt")
    private Boolean mRecoveryAttempt;
    @SerializedName("reused")
    private Object mReused;
    @SerializedName("ships")
    private List<Object> mShips;

    public Object getRecovered() {
        return mRecovered;
    }

    public void setRecovered(Object recovered) {
        mRecovered = recovered;
    }

    public Boolean getRecoveryAttempt() {
        return mRecoveryAttempt;
    }

    public void setRecoveryAttempt(Boolean recoveryAttempt) {
        mRecoveryAttempt = recoveryAttempt;
    }

    public Object getReused() {
        return mReused;
    }

    public void setReused(Object reused) {
        mReused = reused;
    }

    public List<Object> getShips() {
        return mShips;
    }

    public void setShips(List<Object> ships) {
        mShips = ships;
    }

}
