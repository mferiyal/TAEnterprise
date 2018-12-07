package com.mfir.pc.taenterprise.Model;

import com.google.gson.annotations.SerializedName;

public class ModelHome {

    @SerializedName("no")
    private String no;
    @SerializedName("judul")
    private String judul;
    @SerializedName("tanggal")
    private String tanggal;
    @SerializedName("teks")
    private String teks;
    @SerializedName("foto")
    private String foto;
    @SerializedName("like")
    private String like;



    public ModelHome() { }
    public ModelHome(String no, String judul, String tanggal, String teks, String foto,  String like) {
        this.no = no;
        this.judul = judul;
        this.tanggal = tanggal;
        this.teks = teks;
        this.foto = foto;
        this.like = like;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getTeks() {
        return teks;
    }

    public void setTeks(String teks) {
        this.teks = teks;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
