package com.iseyam195.arabkoora.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.iseyam195.arabkoora.Adapters.CountryAdapter;
import com.iseyam195.arabkoora.R;
import com.iseyam195.arabkoora.api.ApiInterface;
import com.iseyam195.arabkoora.api.RetrofitClient;
import com.iseyam195.arabkoora.objects.Country;
import com.iseyam195.arabkoora.objects.CountryData;
import com.iseyam195.arabkoora.objects.OtherList;
import com.iseyam195.arabkoora.objects.Others;


import org.json.JSONArray;
import org.json.JSONException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class CountriesFragment extends Fragment {
    RecyclerView recyclerView ;
    CountryAdapter adapter ;
    List<CountryData> countries;
    ApiInterface apiInterface ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_countries, container, false);

        recyclerView = view.findViewById(R.id.country_rec);

        countries = new ArrayList<>();

        Log.d("ttt","Country Fragments ");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        apiInterface = RetrofitClient.getRetrofitInstance().create(ApiInterface.class);
//        recyclerView = view.findViewById(R.id.country_rec);

        countries= new ArrayList<>();

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter = new CountryAdapter(getContext(), countries);

        recyclerView.setAdapter(adapter);


        Call<OtherList> call = apiInterface.getCountries();
        call.enqueue(new Callback<OtherList>() {
            @Override
            public void onResponse(Call<OtherList> call, Response<OtherList> response) {
                Log.d("ttt",response.toString());
                OtherList others = response.body();

                countries.addAll(others.getOthers());
                for(CountryData countryData:countries){
                    Log.d("ttt","league " + countryData.getLeagues().get(0).getCountry());
                }
                adapter.notifyItemRangeInserted(0,countries.size());
            }

            @Override
            public void onFailure(Call<OtherList> call, Throwable t) {
                Log.d("ttt","Error : " +t.getMessage()) ;

            }
        });


        return view;

 /*       Call<List<Country>> call = apiInterface.getCountries();
        call.enqueue(new Callback<List<Country>>() {
            @Override
            public void onResponse(Call<List<Country>> call, Response<List<Country>> response) {

            }

            @Override
            public void onFailure(Call<List<Country>> call, Throwable t) {

            }
        });*/



/*        call.enqueue(new Callback<List<Others>>() {
            @Override
            public void onResponse(Call<List<Others>> call, Response<List<Others>> response) {
               List<Others>otherss =  response.body();
                String key = otherss.get(response.body()).getCountry().getKey();

            }

            @Override
            public void onFailure(Call<List<Others>> call, Throwable t) {

            }
        });*/
//        call.enqueue(new Callback<List<Country>>() {
//            @Override
//            public void onResponse(Call<List<Country>> call, Response<List<Country>> response) {
//
//                Log.d("ttt","Country Keddddy: " + response.body());
//
//
//                List<Country> others = response.body();
//                for (Country other : others) {
//                    String country = other.getKey();
//
//
//
//                    // Process the data as needed
//                    Log.d("ttt","Country Key: " + country);
//
//                }
//
//
//                JSONArray jsonArray = new JSONArray();
//
//                String[] strArr = new String[jsonArray.length()];
//
//                for (int i = 0; i < jsonArray.length(); i++) {
//                    try {
//                        strArr[i] = jsonArray.getString(i);
//
////                        Log.d("ttt","Country Keddddy: " + response.body());
//
//                    } catch (JSONException e) {
//                        throw new RuntimeException(e);
//                    }
//
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Country>> call, Throwable t) {
//                Log.d("ttt","Error  :     " +t.getMessage()) ;
//
//            }
//        });
        
//        Call<List<Country>> call = apiInterface.getCountries();
//        call.enqueue(new Callback<List<Country>>() {
//            @Override
//            public void onResponse(Call<List<Country>> call, Response<List<Country>> response) {
//                Country country = new Country();
////                countries = response.body().addAll(country.getKey());
//                Log.d("ttt","Data :     " + country.getKey()) ;
//
//            }
//
//            @Override
//            public void onFailure(Call<List<Country>> call, Throwable t) {
//                Log.d("ttt","Error  :     " +t.getMessage()) ;
//
//            }
//        });


    }
}