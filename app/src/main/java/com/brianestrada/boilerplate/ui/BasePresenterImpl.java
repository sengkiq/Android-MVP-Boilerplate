package com.brianestrada.boilerplate.ui;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import timber.log.Timber;

public abstract class BasePresenterImpl<V> implements BasePresenter<V> {

    protected V mView;

    @Override
    public void onViewAttached(@NonNull V view) {
        mView = view;
    }


    @Override
    public void onStart(boolean firstStart) {
    }

    @Override
    public void onStop() {
    }


    @Override
    public void onViewDetached() {
    }

    @Override
    public void onPresenterDestroyed() {
    }
}
