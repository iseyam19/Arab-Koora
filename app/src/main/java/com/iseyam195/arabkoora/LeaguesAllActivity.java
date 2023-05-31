package com.iseyam195.arabkoora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.iseyam195.arabkoora.Adapters.AllLigasAdapter;
import com.iseyam195.arabkoora.Adapters.CountryAdapter;
import com.iseyam195.arabkoora.api.ApiInterface;
import com.iseyam195.arabkoora.api.RetrofitClient;
import com.iseyam195.arabkoora.objects.CountryData;
import com.iseyam195.arabkoora.objects.League;
import com.iseyam195.arabkoora.objects.OtherList;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LeaguesAllActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ApiInterface apiInterface;
    AllLigasAdapter allLigasAdapter;
    List<League> leagueList;
    String key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leagues_all);
        Intent intent = getIntent();

        recyclerView = findViewById(R.id.leagues_rec);

        leagueList = new ArrayList<>();

        Log.d("ttt", "Country Fragments ");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        apiInterface = RetrofitClient.getRetrofitInstance().create(ApiInterface.class);
//        recyclerView = view.findViewById(R.id.country_rec);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        allLigasAdapter = new AllLigasAdapter(leagueList, this);

        recyclerView.setAdapter(allLigasAdapter);
        if (intent.hasExtra("key")) {
            key = intent.getStringExtra("key");
            Log.d("ttt", "Key : " + key);

            apiInterface = RetrofitClient.getRetrofitInstance().create(ApiInterface.class);
            Call<List<OtherList>> call = apiInterface.getLegs(key);
            call.enqueue(new Callback<List<OtherList>>() {
                @Override
                public void onResponse(Call<List<OtherList>> call, Response<List<OtherList>> response) {
                    Log.d("ttt", "Body " + response.body());

//                    Log.d("ttt", "Data   :" + response.body().get(0).leagues.get(0).getTitle());
                    List<OtherList> league = response.body();
//                    leagueList.addAll(league.get)
                    assert league != null;
                    Log.d("ttt", "Data   :" + league.get(0).getLeagues().get(0).getTitle());


//                    OtherList league = response.body();
//
//                  /
//                        Log.d("ttt", "league title " +leagueList.get(0).getTitle());
////                          Log.d("ttt", "league  id " + le.getId());
////                        Log.d("ttt", "league year 1 " + le.getYear());
////                        Log.d("ttt", "league year 2 " + le.getYear2());
//
//                    }
//                    allLigasAdapter.notifyItemRangeInserted(0, leagueList.size());
                }

                @Override
                public void onFailure(Call<List<OtherList>> call, Throwable t) {
                    Log.d("ttt", "Error :" + t.getMessage());
                }
            });

        }


    }
}