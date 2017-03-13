package com.brianestrada.boilerplate.ui;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.brianestrada.boilerplate.models.states.BaseState;

import timber.log.Timber;

public abstract class BasePresenterImpl<V, S extends BaseState> implements BasePresenter<V, S> {

    @Nullable
    protected V view;

    @Override
    public void onViewAttached(@NonNull V view) {
        Timber.d("Attaching View");
        this.view = view;
    }

    @Override
    public void onStart(boolean firstRun) {

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
