package com.iseyam195.arabkoora.objects;

import java.util.Collection;
import java.util.List;

public class Country {
    private String Key;
    private String Value;
    List<Country>data;
    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        this.Key = key;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        this.Value = value;
    }

    public Collection<? extends Country> getData() {
        return  data();

    }

    private Collection<? extends Country> data() {
        return data;
    }
}
