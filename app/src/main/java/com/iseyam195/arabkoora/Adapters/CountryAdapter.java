package com.iseyam195.arabkoora.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.iseyam195.arabkoora.R;
import com.iseyam195.arabkoora.objects.Country;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryHolder> {
    Context context ;
    List<Country>countries ;

    public CountryAdapter(Context context, List<Country> countries) {
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
    Country country  = countries.get(position);
    Log.d("ttt","Country" + country.getValue()); ;
    Log.d("ttt","Country" + country.getKey()); ;
        holder.countrysss.setText(country.getValue());
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class CountryHolder extends RecyclerView.ViewHolder {
        TextView countrysss ;
        ConstraintLayout layout  ;

        public CountryHolder(@NonNull View itemView) {
            super(itemView);
            countrysss = itemView.findViewById(R.id.country_tx);
            layout = itemView.findViewById(R.id.countery_item_con );

        }
    }
}
