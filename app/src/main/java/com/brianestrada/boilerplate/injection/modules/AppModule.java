package com.brianestrada.boilerplate.injection.modules;

import android.content.Context;
import android.support.annotation.NonNull;

import com.brianestrada.boilerplate.App;
import com.brianestrada.boilerplate.injection.scopes.AppScope;

import dagger.Module;
import dagger.Provides;

@Module
public final class AppModule {
    @NonNull
    private final App mApp;

    public AppModule(@NonNull App app) {
        mApp = app;
    }

    @Provides
    @AppScope
    public Context provideAppContext() {
        return mApp;
    }

    @Provides
    @AppScope
    public App provideApp() {
        return mApp;
    }
}
