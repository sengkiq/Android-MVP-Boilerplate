package com.brianestrada.boilerplate.loader;

import android.support.annotation.NonNull;

import com.brianestrada.boilerplate.ui.BasePresenter;

public interface PresenterFactory<T extends BasePresenter> {
    @NonNull
    T create();
}
