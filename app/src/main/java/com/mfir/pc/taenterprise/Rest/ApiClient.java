package com.mfir.pc.taenterprise.Rest;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class ApiClient {


    public static final String BASE_URL = "http://192.168.1.17:8282/artikel/index.php/";
    public static final String Base_Upload = "http://192.168.1.17:8282/artikel/upload/";


    private static Retrofit retrofit = null;
    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
