package com.iseyam195.arabkoora.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AllLigasAdapter extends RecyclerView.Adapter<AllLigasAdapter.AllLigasHolder> {

    Context context ;
//    List<>
    @NonNull
    @Override
    public AllLigasHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AllLigasHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class AllLigasHolder extends RecyclerView.ViewHolder {
        public AllLigasHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
