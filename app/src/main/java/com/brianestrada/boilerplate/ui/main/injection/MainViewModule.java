package com.brianestrada.boilerplate.ui.main.injection;

import com.brianestrada.boilerplate.data.DataManager;
import com.brianestrada.boilerplate.loader.PresenterFactory;
import com.brianestrada.boilerplate.ui.main.MainPresenter;
import com.brianestrada.boilerplate.ui.main.MainPresenterImpl;

import dagger.Module;
import dagger.Provides;

@Module
public final class MainViewModule {
    @Provides
    public PresenterFactory<MainPresenter> providePresenterFactory(DataManager dataManager) {
        return () -> new MainPresenterImpl(dataManager);
    }
}
