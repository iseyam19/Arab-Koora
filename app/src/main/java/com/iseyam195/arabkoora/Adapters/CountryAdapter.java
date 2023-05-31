package com.iseyam195.arabkoora.Adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.iseyam195.arabkoora.LeaguesAllActivity;
import com.iseyam195.arabkoora.R;
import com.iseyam195.arabkoora.objects.Country;
import com.iseyam195.arabkoora.objects.CountryData;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryHolder> {
    Context context ;
    List<CountryData>countries ;

    public CountryAdapter(Context context, List<CountryData> countries) {
        this.context = context;
        this.countries = countries;
    }

    @NonNull
    @Override
    public CountryAdapter.CountryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view =   LayoutInflater.from(context).inflate(R.layout.country_item,parent,false );

        return new CountryAdapter.CountryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryAdapter.CountryHolder holder, int position) {
    CountryData country  = countries.get(position);
   /* Log.d("ttt","Country" + country.getValue()); ;
    Log.d("ttt","Country" + country.getKey()); ;*/
        holder.countrysss.setText(country.getCountry().getValue());
        String key = country.getCountry().getKey();
        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(context, LeaguesAllActivity.class);
            Log.d("ttt","Lega :"+ country.getCountry().getKey());
            intent.putExtra("key",key);
                context.startActivity(intent);



        });

    }


    @Override
    public int getItemCount() {
        return countries.size();
    }

    public static class CountryHolder extends RecyclerView.ViewHolder {
        TextView countrysss ;
        ConstraintLayout layout  ;

        public CountryHolder(@NonNull View itemView) {
            super(itemView);
            countrysss = itemView.findViewById(R.id.country_tx);
            layout = itemView.findViewById(R.id.countery_item_con );

        }
    }
}
