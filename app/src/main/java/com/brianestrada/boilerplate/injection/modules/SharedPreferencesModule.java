package com.brianestrada.boilerplate.injection.modules;


import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.brianestrada.boilerplate.injection.scopes.AppScope;

import dagger.Module;
import dagger.Provides;

@Module(includes = AppModule.class)
public final class SharedPreferencesModule {
    @Provides
    @AppScope
    SharedPreferences provideSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
}
