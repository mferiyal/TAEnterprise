package com.mfir.pc.taenterprise.Rest;

import com.mfir.pc.taenterprise.Model.ResultArtikel;
import com.mfir.pc.taenterprise.Model.ResultUser;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("ruangan/login")
    Call<ResultUser> loginRequest(@Field("username")String username);

    @GET("ruangan/artikel")
    Call<ResultArtikel> getArtikel();

    @Multipart
    @POST("ruangan/login")
    Call<ResultUser> postLogin(@Part("username") RequestBody username,
                               @Part("password")RequestBody password);

//    @Multipart
//    @POST("ruangan/login")
//    Call<ResultUser> postLogin(@Part("username")RequestBody username,
//                               @Part("password")RequestBody password);
}

