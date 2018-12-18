package com.mfir.pc.taenterprise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mfir.pc.taenterprise.Rest.ApiClient;

public class Detail extends AppCompatActivity {

    TextView juduldetail, namadetail, tanggaldetail, likedetail, teksdetail;
    ImageView fotodetail2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        juduldetail = findViewById(R.id.textViewJudul);
        namadetail = findViewById(R.id.txtJudul);
        tanggaldetail = findViewById(R.id.txtTanggal);
        likedetail = findViewById(R.id.txtLiked);
        teksdetail = findViewById(R.id.textViewTextdetail);
//        fotodetail = findViewById(R.id.imageProfilee);
        fotodetail2 = findViewById(R.id.imageView4);
        Intent i = getIntent();
        String judul = i.getStringExtra("judul");
        String tanggal = i.getStringExtra("tanggal");
        String teks = i.getStringExtra("text");
        String foto = i.getStringExtra("foto");
        String like = i.getStringExtra("like");
        juduldetail.setText(judul);
        tanggaldetail.setText(tanggal);
        teksdetail.setText(teks);
        likedetail.setText(like);
//        Glide.with(getApplicationContext()).load(ApiClient.Base_Upload + foto).into(fotodetail);
        Glide.with(getApplicationContext()).load(ApiClient.Base_Upload + foto).into(fotodetail2);


    }
}
