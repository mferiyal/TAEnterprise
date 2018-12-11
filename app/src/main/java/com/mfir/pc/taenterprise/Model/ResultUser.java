package com.mfir.pc.taenterprise.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ResultUser {
    @SerializedName("status")
    private String status;
    @SerializedName("result")
    private List<ModelUser> result = new ArrayList<>();
    @SerializedName("message")
    private String message;
    @SerializedName("result_user")
    private ModelUser user;


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

    public List<ModelUser> getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public ModelUser getUser() {
        return user;
    }

    public void setUser(ModelUser user) {
        this.user = user;
    }
}
