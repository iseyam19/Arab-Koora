package com.iseyam195.arabkoora.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.iseyam195.arabkoora.R;
import com.iseyam195.arabkoora.objects.League;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AllLigasAdapter extends RecyclerView.Adapter<AllLigasAdapter.AllLigasHolder> {
    List<League>leagues ;
    Context context ;

    public AllLigasAdapter(List<League> leagues, Context context) {
        this.leagues = leagues;
        this.context = context;
    }

    //    List<>
    @NonNull
    @Override
    public AllLigasHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(context).inflate(R.layout.leagues_all_layout_design,parent ,false);

        return new AllLigasAdapter.AllLigasHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllLigasAdapter.AllLigasHolder holder, int position) {
    League league = leagues.get(position);
    Picasso.get().load(league.getLogo()).fit().into(holder.lega_img);
    holder.legaName_tx.setText(league.getTitle());
    holder.year1_tx.setText(league.getYear());
    holder.year2_tx.setText(league.getYear2());

        Log.d("ttt","Name :"+league.getTitle());
        Log.d("ttt","Name :"+league.getYear());
        Log.d("ttt","Name :"+league.getYear2());
        Log.d("ttt","Name :"+league.getLogo());
    }

    @Override
    public int getItemCount() {
        return leagues.size();
    }

    public class AllLigasHolder extends RecyclerView.ViewHolder {
        TextView legaName_tx,year1_tx,year2_tx;
        ImageView lega_img;
        public AllLigasHolder(@NonNull View itemView) {
            super(itemView);
            legaName_tx = itemView.findViewById(R.id.leaga_name);
            year1_tx = itemView.findViewById(R.id.year);
            year2_tx = itemView.findViewById(R.id.year2);
            lega_img = itemView.findViewById(R.id.leaga_img);
        }

    }
}
