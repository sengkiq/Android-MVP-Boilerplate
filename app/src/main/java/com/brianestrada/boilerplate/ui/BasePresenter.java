package com.brianestrada.boilerplate.ui;

import android.support.annotation.NonNull;

public interface BasePresenter<V> {
    void onViewAttached(@NonNull V view);

    void onStart(boolean firstStart);

    void onStop();

    void onViewDetached();

    void onPresenterDestroyed();
}