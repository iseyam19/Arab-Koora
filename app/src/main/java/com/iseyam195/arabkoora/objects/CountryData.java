package com.iseyam195.arabkoora.objects;

import java.util.List;

public class CountryData {
    private Country Country;
    private List<League> Leagues;
    private Object SportLeagues;

    public Country getCountry() {
        return Country;
    }

    public void setCountry(Country country) {
        this.Country = country;
    }

    public List<League> getLeagues() {
        return Leagues;
    }

    public void setLeagues(List<League> leagues) {
        this.Leagues = leagues;
    }

    public Object getSportLeagues() {
        return SportLeagues;
    }

    public void setSportLeagues(Object sportLeagues) {
        this.SportLeagues = sportLeagues;
    }
}
