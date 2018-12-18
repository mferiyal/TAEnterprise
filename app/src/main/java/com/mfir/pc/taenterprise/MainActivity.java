package com.mfir.pc.taenterprise;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mfir.pc.taenterprise.Adapter.AdapterArtikel;
import com.mfir.pc.taenterprise.Model.ModelArtikel;
import com.mfir.pc.taenterprise.Model.ResultArtikel;
import com.mfir.pc.taenterprise.Rest.ApiClient;
import com.mfir.pc.taenterprise.Rest.ApiInterface;
import com.mfir.pc.taenterprise.listener.ClickListener;
import com.mfir.pc.taenterprise.listener.RecyclerTouchListener;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.media.CamcorderProfile.get;

public class MainActivity extends AppCompatActivity {

    RecyclerView mArtikelview;
    RecyclerView.LayoutManager mlayoutm;
    AdapterArtikel mAdapter;
    Context mContext;
    ApiInterface mApiInterface;
    Button like;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        like = findViewById(R.id.btnlike);
        mContext = getApplicationContext();
        mArtikelview = (RecyclerView) findViewById(R.id.recyler_home);
        mArtikelview.setHasFixedSize(true);
        mlayoutm = new LinearLayoutManager(mContext);
        mArtikelview.setLayoutManager(mlayoutm);
        initRecyclerArtikel();

//        like.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this,"like",Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    private void initRecyclerArtikel () {
            mApiInterface = ApiClient.getClient().create(ApiInterface.class);
            Call<ResultArtikel> mArtikelView = mApiInterface.getArtikel();
            mArtikelView.enqueue(new Callback<ResultArtikel>() {
                @Override
                public void onResponse(Call<ResultArtikel> call, Response<ResultArtikel> response) {
                    Log.d("Get Artikel", response.body().getStatus());
                    final List<ModelArtikel> mHome = response.body().getResult();
                    mAdapter = new AdapterArtikel(mHome,mContext);
                    mArtikelview.setAdapter(mAdapter);
                    mArtikelview.addOnItemTouchListener(new RecyclerTouchListener(mContext, mArtikelview, new ClickListener() {
                        @Override
                        public void onClick(View view, int position) {
                            ModelArtikel modelArtikel = mHome.get(position);
                            Intent i = new Intent(mContext, Detail.class);
                            i.putExtra("judul",modelArtikel.getJudul());
                            i.putExtra("tanggal",modelArtikel.getTanggal());
                            i.putExtra("text",modelArtikel.getText());
                            i.putExtra("foto",modelArtikel.getFoto());
                            i.putExtra("like",modelArtikel.getLike());
                            startActivity(i);
                        }
                        @Override
                        public void onLongClick(View view, int posi) {

                        }
                    }));
                }

                @Override
                public void onFailure(Call<ResultArtikel> call, Throwable t) {
                    Log.d("Get Artikel", t.getMessage());
                }
            });
    }
}
