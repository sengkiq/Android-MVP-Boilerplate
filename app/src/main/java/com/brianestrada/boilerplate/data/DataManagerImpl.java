package com.brianestrada.boilerplate.data;


import android.content.SharedPreferences;

public class DataManagerImpl implements DataManager {
    SharedPreferences sharedPreferences;

    public DataManagerImpl(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }
}
