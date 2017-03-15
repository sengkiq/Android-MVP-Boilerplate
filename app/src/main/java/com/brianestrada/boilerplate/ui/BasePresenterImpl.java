package com.brianestrada.boilerplate.ui;

import android.support.annotation.NonNull;

public abstract class BasePresenterImpl<V> implements BasePresenter<V> {

    protected V view;

    @Override
    public void onViewAttached(@NonNull V view) {
        this.view = view;
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
