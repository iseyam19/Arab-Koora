package com.iseyam195.arabkoora.objects;

public class Team {
    private int id;
    private String logo;
    private String name;
    private Sport sport;
    private Country country;
    private int teamClass;
    private boolean isTempTeam;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getTeamClass() {
        return teamClass;
    }

    public void setTeamClass(int teamClass) {
        this.teamClass = teamClass;
    }

    public boolean isTempTeam() {
        return isTempTeam;
    }

    public void setTempTeam(boolean tempTeam) {
        isTempTeam = tempTeam;
    }
}
