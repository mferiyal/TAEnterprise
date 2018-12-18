package com.mfir.pc.taenterprise.Rest;

import android.widget.Button;

import com.mfir.pc.taenterprise.Model.ResultArtikel;
import com.mfir.pc.taenterprise.Model.ResultDaftar;
import com.mfir.pc.taenterprise.Model.ResultUser;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("artikel/Login")
    Call<ResultUser> loginRequest(@Field("username")String username,
                                  @Field("password") String password);


    @GET("artikel")
    Call<ResultArtikel> getArtikel();


    @FormUrlEncoded
    @POST("artikel/Register")
    Call<ResultDaftar> daftar(@Field("nama") String nama,
                              @Field("email") String email,
                              @Field("password") String password);

    @Multipart
    @POST("artikel/Artikel")
    Call<ResultArtikel> artikel (@Field("judul") String judul,
                                     @Field("tanggal") String tanggal,
                                     @Field("text") String text,
                                     @Field("foto") String foto,
                                     @Field("like") Integer like);


    Call<ResultArtikel> suka(Button like);

}