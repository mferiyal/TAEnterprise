package com.mfir.pc.taenterprise.Rest;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {
    //    Login
    @FormUrlEncoded
    @POST("Login")
    Call<> getLogin(@Field("nohp") String nohp,
                                       @Field("password") String password);

    //    Kendaraan
    @GET("Kendaraan")
    Call<GetKendaraan> getKendaraan();

    @FormUrlEncoded
    @POST("Kendaraan")
    Call<PostPutDellKendaraan> postKendaraan(@Field("nama") String nama,
                                             @Field("harga") String harga,
                                             @Field("img") String img);
    @FormUrlEncoded
    @PUT("Kendaraan")
    Call<PostPutDellKendaraan> putKendaraan(@Field("id") String id,
                                            @Field("nama") String nama,
                                            @Field("harga") String harga,
                                            @Field("img") String img);
}

