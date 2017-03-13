package com.brianestrada.boilerplate.injection.modules;


import android.content.SharedPreferences;

import com.brianestrada.boilerplate.data.DataManager;
import com.brianestrada.boilerplate.data.DataManagerImpl;
import com.brianestrada.boilerplate.injection.scopes.AppScope;

import dagger.Module;
import dagger.Provides;

@Module(includes = {SharedPreferencesModule.class})
public final class DataManagerModule {

    @Provides
    @AppScope
    DataManager provideDataManager(SharedPreferences sharedPreferences) {
        return new DataManagerImpl(sharedPreferences);
    }
}
