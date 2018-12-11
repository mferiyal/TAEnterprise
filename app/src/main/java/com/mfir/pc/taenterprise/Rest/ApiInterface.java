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
    Call<ResultUser> loginRequest(@Field("username")String username);

    @GET("artikel/Artikel")
    Call<ResultArtikel> getArtikel();

    @Multipart
    @POST("artikel/Login")
    Call<ResultUser> postLogin(@Part("username") RequestBody username,
                               @Part("password")RequestBody password);

    @POST("artikel/Register")
    Call<ResultDaftar> daftar(@Field("nama") String nama,
                              @Field("email") String email,
                              @Field("password") String password);

    @POST("artikel/Artikel")
    Call<ResultArtikel> suka(@Field("like") Button like);



//    @Multipart
//    @POST("ruangan/login")
//    Call<ResultUser> postLogin(@Part("username")RequestBody username,
//                               @Part("password")RequestBody password);
}

