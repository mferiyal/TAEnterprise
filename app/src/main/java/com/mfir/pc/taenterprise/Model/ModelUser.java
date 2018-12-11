package com.mfir.pc.taenterprise.Model;

import com.google.gson.annotations.SerializedName;

public class ModelUser {
    @SerializedName("id_user")
    String id_user;
    @SerializedName("nama")
    String nama;
    @SerializedName("email")
    String email;
    @SerializedName("password")
    String password;

    public ModelUser(String id_user, String nama, String email, String password) {
        this.id_user = id_user;
        this.nama = nama;
        this.email = email;
        this.password = password;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
