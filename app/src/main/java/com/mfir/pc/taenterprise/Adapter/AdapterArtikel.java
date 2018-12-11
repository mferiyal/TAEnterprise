package com.mfir.pc.taenterprise.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mfir.pc.taenterprise.Model.ModelArtikel;
import com.mfir.pc.taenterprise.R;


import java.util.List;

public class AdapterArtikel  extends RecyclerView.Adapter<AdapterArtikel.MyViewHolder> {


    private List<ModelArtikel> mHome ;
    private Context mcon;

    public AdapterArtikel(List<ModelArtikel> mHome) {
    }


    @NonNull
    @Override
    public AdapterArtikel.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_main, parent, false);
        MyViewHolder mViewHolder = new MyViewHolder(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterArtikel.MyViewHolder holder, int position) {
        ModelArtikel modelHome = mHome.get(position);

        holder.Judul.setText(modelHome.getJudul());
        holder.Tanggal.setText(modelHome.getJudul());
        holder.Teks.setText(modelHome.getJudul());
        holder.Like.setText(modelHome.getLike());
        Glide.with(mcon).asBitmap().load(modelHome.getFoto()).into(holder.img);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView  Judul, Tanggal, Teks, Like;


        public MyViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.images_profil);
            Judul = itemView.findViewById(R.id.txtJudul);
            Tanggal = itemView.findViewById(R.id.tanggalpost);
            Teks = itemView.findViewById(R.id.teks);
            Like = itemView.findViewById(R.id.txtjumlahlike);

        }
    }
}