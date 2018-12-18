package com.mfir.pc.taenterprise.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ResultUser {
    @SerializedName("status")
    private String status;
    @SerializedName("result")
    private ModelUser user;
    @SerializedName("message")
    private String message;


    public ResultUser(String status , ModelUser user) {
        this.status = status;
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ModelUser getUser() {
        return user;
    }

    public void setUser(ModelUser user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
