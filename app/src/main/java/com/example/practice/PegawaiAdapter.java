package com.example.practice;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practice.R;
import com.example.practice.MainActivity;
import com.example.practice.Pegawai;

import java.util.ArrayList;

public class PegawaiAdapter extends RecyclerView.Adapter<PegawaiAdapter.PegawaiViewHolder> {

    private ArrayList<Pegawai> dataList;

    public PegawaiAdapter(ArrayList<Pegawai> dataList) {
        this.dataList = dataList;
    }

    @Override
    public PegawaiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view, parent, false);
        return new PegawaiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PegawaiAdapter.PegawaiViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtAlamat.setText(dataList.get(position).getAlamat());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class PegawaiViewHolder extends RecyclerView.ViewHolder {

        private TextView txtNama, txtAlamat;

        public PegawaiViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_pegawai);
            txtAlamat = (TextView) itemView.findViewById(R.id.txt_alamat_pegawai);
        }
    }
}
