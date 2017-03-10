package com.brianestrada.boilerplate.injection.components;

import android.content.Context;
import android.content.SharedPreferences;

import com.brianestrada.boilerplate.App;
import com.brianestrada.boilerplate.injection.modules.AppModule;
import com.brianestrada.boilerplate.injection.modules.NetworkModule;
import com.brianestrada.boilerplate.injection.modules.SharedPreferencesModule;
import com.brianestrada.boilerplate.injection.scopes.AppScope;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;

@AppScope
@Component(modules = {AppModule.class, NetworkModule.class, SharedPreferencesModule.class})
public interface AppComponent {
    Context getAppContext();

    App getApp();

    SharedPreferences getSharedPreferences();

    OkHttpClient getNetworkClient();
}