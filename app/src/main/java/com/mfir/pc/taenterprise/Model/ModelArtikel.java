package com.mfir.pc.taenterprise.Model;

import com.google.gson.annotations.SerializedName;

public class ModelArtikel {

    @SerializedName("no")
    String no;
    @SerializedName("judul")
    String judul;
    @SerializedName("tanggal")
    String tanggal;
    @SerializedName("text")
    String text;
    @SerializedName("foto")
    String foto;
    @SerializedName("like")
    String like;

    public ModelArtikel(String no, String judul, String tanggal, String text, String foto, String like) {
        this.no = no;
        this.judul = judul;
        this.tanggal = tanggal;
        this.text = text;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
