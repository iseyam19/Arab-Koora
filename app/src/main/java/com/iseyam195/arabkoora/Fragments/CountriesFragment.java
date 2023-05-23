package com.iseyam195.arabkoora.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iseyam195.arabkoora.Adapters.CountryAdapter;
import com.iseyam195.arabkoora.R;
import com.iseyam195.arabkoora.api.ApiInterface;
import com.iseyam195.arabkoora.api.RetrofitClient;
import com.iseyam195.arabkoora.objects.Country;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class CountriesFragment extends Fragment {
    RecyclerView recyclerView ;
    CountryAdapter adapter ;
    List<Country>countries;
    ApiInterface apiInterface ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_countries, container, false);
        recyclerView = view.findViewById(R.id.country_rec);
        Log.d("ttt","Country Fragments ");
//        recyclerView.setLayoutManager(new LinearLayoutManager(L));
        apiInterface = RetrofitClient.getRetrofitInstance().create(ApiInterface.class);
        recyclerView = view.findViewById(R.id.country_rec);
        countries= new ArrayList<>();

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new CountryAdapter(getContext(), countries);

        recyclerView.setAdapter(adapter);
        Call<Country> call = apiInterface.getCountries();
        call.enqueue(new Callback<Country>() {
            @Override
            public void onResponse(Call<Country> call, Response<Country> response) {
                if (response.isSuccessful()) {
                    Country data = response.body();
                    Log.d("ttt", " Data " + countries.size());
                    assert data != null;
                    countries.addAll(data.getData()); /// Add retrieved data to the list
                    adapter.notifyDataSetChanged();
                } else {
                    // Handle error response
                }
            }

            @Override
            public void onFailure(Call<Country> call, Throwable t) {
                Log.d("ttt","Error "+ t.getMessage());

            }
        });
        return view;
    }
}