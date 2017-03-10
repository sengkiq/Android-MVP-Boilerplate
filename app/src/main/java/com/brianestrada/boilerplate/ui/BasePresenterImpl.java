package com.brianestrada.boilerplate.ui;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public abstract class BasePresenterImpl<V> implements BasePresenter<V> {

    @Nullable
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
        view = null;
    }

    @Override
    public void onPresenterDestroyed() {

    }
}
