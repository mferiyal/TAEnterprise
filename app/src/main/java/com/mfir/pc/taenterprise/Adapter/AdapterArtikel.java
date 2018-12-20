package com.mfir.pc.taenterprise.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.mfir.pc.taenterprise.Detail;
import com.mfir.pc.taenterprise.MainActivity;
import com.mfir.pc.taenterprise.Model.ModelArtikel;
import com.mfir.pc.taenterprise.R;
import com.mfir.pc.taenterprise.Rest.ApiClient;


import java.util.List;

public class AdapterArtikel  extends RecyclerView.Adapter<AdapterArtikel.MyViewHolder> {


    private List<ModelArtikel> mHome ;
    private Context mcon;

    public AdapterArtikel(List<ModelArtikel> mHome,Context mContext) {
        this.mHome = mHome;
        this.mcon = mContext;
    }


    @NonNull
    @Override
    public AdapterArtikel.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_main, parent, false);
        MyViewHolder mViewHolder = new MyViewHolder(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterArtikel.MyViewHolder holder, final int position) {
        ModelArtikel modelHome = mHome.get(position);

        holder.Judul.setText(modelHome.getJudul());
        holder.Tanggal.setText(modelHome.getTanggal());
        holder.Teks.setText(modelHome.getText());
//        holder.Like.setText(modelHome.getLike());

//        Glide.with(holder.itemView.getContext()).load(ApiClient.Base_Upload + mHome.get(position).getFoto()).into(holder.img);

//        Glide.with(mcon).asBitmap().load(modelHome.getFoto()).into(holder.img);
//        if (mHome.get(position).getFoto().length() > 0 ){
//            //Picasso.with(holder.itemView.getContext()).load(ApiClient.BASE_URL+listPembeli.get(position).getPhotoId()).into(holder.mPhotoid);
//            Glide.with(holder.itemView.getContext()).load(ApiClient.Base_Upload + mHome.get(position).getFoto()).into(holder.img);
//        }else{
//            //Picasso.with(holder.itemView.getContext()).load(R.drawable.photoid).into(holder.mPhotoid);
//            Glide.with(holder.itemView.getContext()).load(R.mipmap.ic_launcher).into(holder.img);
//        }

        holder.Teks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ModelArtikel modelArtikel = mHome.get(position);
                Intent i = new Intent(mcon, Detail.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.putExtra("judul",modelArtikel.getJudul());
                i.putExtra("tanggal",modelArtikel.getTanggal());
                i.putExtra("text",modelArtikel.getText());
                i.putExtra("foto",modelArtikel.getFoto());
                i.putExtra("like",modelArtikel.getLike());
                mcon.startActivity(i);
            }
        });

        holder.Like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mcon,"like",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mHome.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView  Judul, Tanggal, Teks, Like;


        public MyViewHolder(View itemView) {
            super(itemView);
//           img = itemView.findViewById(R.id.images_profil);
            Judul = itemView.findViewById(R.id.txtJudul);
            Tanggal = itemView.findViewById(R.id.tanggalpost);
            Teks = itemView.findViewById(R.id.teks);
            Like = itemView.findViewById(R.id.like);
        }
    }
}