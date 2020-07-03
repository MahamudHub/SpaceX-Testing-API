
package com.sparta.mm;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class FairingsPOJO {

    @SerializedName("recovered")
    private Boolean mRecovered;
    @SerializedName("recovery_attempt")
    private Boolean mRecoveryAttempt;
    @SerializedName("reused")
    private Boolean mReused;
    @SerializedName("ships")
    private List<Object> mShips;

    public Boolean getRecovered() {
        return mRecovered;
    }

    public void setRecovered(Boolean recovered) {
        mRecovered = recovered;
    }

    public Boolean getRecoveryAttempt() {
        return mRecoveryAttempt;
    }

    public void setRecoveryAttempt(Boolean recoveryAttempt) {
        mRecoveryAttempt = recoveryAttempt;
    }

    public Boolean getReused() {
        return mReused;
    }

    public void setReused(Boolean reused) {
        mReused = reused;
    }

    public List<Object> getShips() {
        return mShips;
    }

    public void setShips(List<Object> ships) {
        mShips = ships;
    }

}
