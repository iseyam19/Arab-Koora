package com.iseyam195.arabkoora.objects;

import java.util.List;

public class League {
    private String id;
    private String logo;
    private int sport;
    private int flags;
    private String title;
    private int year;
    private int year2;
    private String country;
    private boolean isArchived;
    private int grouping;
    private List<String> stageTitles;

    public League(String id, String logo, int sport, int flags, String title, int year, int year2,
                  String country, boolean isArchived, int grouping, List<String> stageTitles) {
        this.id = id;
        this.logo = logo;
        this.sport = sport;
        this.flags = flags;
        this.title = title;
        this.year = year;
        this.year2 = year2;
        this.country = country;
        this.isArchived = isArchived;
        this.grouping = grouping;
        this.stageTitles = stageTitles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getSport() {
        return sport;
    }

    public void setSport(int sport) {
        this.sport = sport;
    }

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear2() {
        return year2;
    }

    public void setYear2(int year2) {
        this.year2 = year2;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isArchived() {
        return isArchived;
    }

    public void setArchived(boolean archived) {
        isArchived = archived;
    }

    public int getGrouping() {
        return grouping;
    }

    public void setGrouping(int grouping) {
        this.grouping = grouping;
    }

    public List<String> getStageTitles() {
        return stageTitles;
    }

    public void setStageTitles(List<String> stageTitles) {
        this.stageTitles = stageTitles;
    }
}
