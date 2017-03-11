package com.brianestrada.boilerplate.ui;

import android.support.annotation.NonNull;

import com.brianestrada.boilerplate.models.BaseState;


public interface BasePresenter<V, S extends BaseState> {

    void onViewAttached(@NonNull V view);

    void onStart();

    void onStop();

    void onViewDetached();

    void onPresenterDestroyed();

    S getState();

    void setState(S state);
}