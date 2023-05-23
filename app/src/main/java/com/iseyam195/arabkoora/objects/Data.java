package com.iseyam195.arabkoora.objects;

import java.util.List;

public class Data {
    private List<Team> data;
    private int pages;

    public List<Team> getData() {
        return data;
    }

    public void setData(List<Team> data) {
        this.data = data;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
