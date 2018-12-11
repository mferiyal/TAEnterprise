package com.mfir.pc.taenterprise.Model;


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ResultDaftar {
    @SerializedName("status")
    private String status;
    @SerializedName("result")
    private List<ModelArtikel> result = new ArrayList<>();
    @SerializedName("message")
    private String message;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ModelArtikel> getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
