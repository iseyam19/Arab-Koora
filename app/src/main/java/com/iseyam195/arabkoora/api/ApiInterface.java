package com.iseyam195.arabkoora.api;


import com.iseyam195.arabkoora.objects.Country;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("leagues")
    Call<Country> getCountries();


}
