package com.iseyam195.arabkoora.objects;

import java.util.List;

public class OtherList {

     List<CountryData> Others;
    public List<League> leagues;
     public List<CountryData> getOthers() {
        return Others;
    }

    public List<League> getLeagues() {
        return leagues;
    }

    public void setLeagues(List<League> leagues) {
        this.leagues = leagues;
    }

    void setOthers(List<CountryData> others) {
        this.Others = others;
    }
}
