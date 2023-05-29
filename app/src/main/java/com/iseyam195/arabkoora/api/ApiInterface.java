package com.iseyam195.arabkoora.api;


import com.iseyam195.arabkoora.objects.Country;
import com.iseyam195.arabkoora.objects.OtherList;
import com.iseyam195.arabkoora.objects.Others;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
//     Call<List<Country>> getOthers();

    @GET("leagues")
    Call<OtherList> getCountries();


/* @GET("leagues")
    Call<List<Others>> getCountriesss();*/


}
