package com.iseyam195.arabkoora.api;


import com.iseyam195.arabkoora.objects.OtherList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
//     Call<List<Country>> getOthers();

    @GET("leagues")
    Call<OtherList> getCountries();

    @GET("leagues")
    Call<List<OtherList>> getLegs(@Query("Key")String key);


/* @GET("leagues")
    Call<List<Others>> getCountriesss();*/


}
