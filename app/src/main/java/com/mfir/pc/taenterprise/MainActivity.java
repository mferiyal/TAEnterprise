package com.mfir.pc.taenterprise;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.mfir.pc.taenterprise.Adapter.AdapterArtikel;
import com.mfir.pc.taenterprise.Model.ModelArtikel;
import com.mfir.pc.taenterprise.Model.ResultArtikel;
import com.mfir.pc.taenterprise.Rest.ApiClient;
import com.mfir.pc.taenterprise.Rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView mArtikelview;
    RecyclerView.LayoutManager mlayoutm;
    RecyclerView.Adapter mAdapter;
    Context mContext;
    ApiInterface mApiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerArtikel();
    }

    private void initRecyclerArtikel(){
        mContext = getApplicationContext();
        mArtikelview = (RecyclerView) findViewById(R.id.recyler_home);
        mlayoutm = new LinearLayoutManager(mContext);
        mArtikelview.setLayoutManager(mlayoutm);
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<ResultArtikel> mArtikelView = mApiInterface.getArtikel();
        mArtikelView.enqueue(new Callback<ResultArtikel>() {
            @Override
            public void onResponse(Call<ResultArtikel> call, Response<ResultArtikel> response) {
                Log.d("Get Artikel", response.body().getStatus());
                List<ModelArtikel> listArtikelView = response.body().getResult();
                mAdapter = new AdapterArtikel(listArtikelView);
                mArtikelview.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<ResultArtikel> call, Throwable t) {
                Log.d("Get Artikel",t.getMessage());
            }
        });
    }
    }
}
