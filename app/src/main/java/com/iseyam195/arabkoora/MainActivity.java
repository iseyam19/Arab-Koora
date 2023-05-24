package com.iseyam195.arabkoora;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import com.iseyam195.arabkoora.Fragments.CountriesFragment;
import com.iseyam195.arabkoora.Fragments.MatchesNowFragment;
import com.iseyam195.arabkoora.Fragments.MatchesTodayFragment;
import com.iseyam195.arabkoora.Fragments.NewsFragment;

public  class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);










        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.news);
//        bottomNavigationView.getOrCreateBadge()


        System.out.println();


    }

    NewsFragment newsFragment = new NewsFragment();

    MatchesNowFragment matchesNowFragment = new MatchesNowFragment();

    MatchesTodayFragment matchesTodayFragment = new MatchesTodayFragment();

    CountriesFragment countriesFragment = new CountriesFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.news:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, newsFragment)
                        .commit();
                return true;

            case R.id.matches_now:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, matchesNowFragment)
                        .commit();
                return true;

            case R.id.matches_today:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, matchesTodayFragment)
                        .commit();
                return true;

            case R.id.countries:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, countriesFragment)
                        .commit();
                Log.d("ttt","aldlk dsak'k SA ;K;'K ; DSSA;L ;LD S");
                return true;
        }
        return false;
    }
}