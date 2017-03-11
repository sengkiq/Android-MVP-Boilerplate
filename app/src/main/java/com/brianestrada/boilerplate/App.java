package com.brianestrada.boilerplate;

import android.app.Application;
import android.support.annotation.NonNull;

import com.brianestrada.boilerplate.injection.components.AppComponent;
import com.brianestrada.boilerplate.injection.components.DaggerAppComponent;
import com.brianestrada.boilerplate.injection.modules.AppModule;
import com.brianestrada.boilerplate.injection.modules.NetworkModule;
import com.brianestrada.boilerplate.injection.modules.SharedPreferencesModule;

import timber.log.Timber;

public final class App extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();


        Timber.plant(new Timber.DebugTree());


        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .sharedPreferencesModule(new SharedPreferencesModule())
                .networkModule(new NetworkModule())
                .build();
    }

    @NonNull
    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}