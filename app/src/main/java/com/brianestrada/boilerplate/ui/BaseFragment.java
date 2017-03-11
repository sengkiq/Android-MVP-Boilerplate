package com.brianestrada.boilerplate.ui;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.brianestrada.boilerplate.App;
import com.brianestrada.boilerplate.injection.components.AppComponent;
import com.brianestrada.boilerplate.models.BaseState;

public abstract class BaseFragment<P extends BasePresenter<V, S>, S extends BaseState, V> extends Fragment {
    static final String BUNDLE_KEY_STATE = "BUNDLE_KEY_STATE";

    @Nullable
    protected P presenter;

    protected S state;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        injectDependencies();
    }

    private void injectDependencies() {
        setupComponent(((App) getActivity().getApplication()).getAppComponent());
    }

    @Override
    public void onStart() {
        super.onStart();

        doStart();
    }

    @SuppressWarnings("unchecked")
    private void doStart() {
        assert presenter != null;

        presenter.onViewAttached((V) this);

        presenter.onStart();

    }

    @Override
    public void onStop() {
        if (presenter != null) {
            presenter.onStop();

            presenter.onViewDetached();
        }

        super.onStop();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putParcelable(BUNDLE_KEY_STATE, (Parcelable) state);

    }

    protected abstract void setupComponent(@NonNull AppComponent appComponent);
}
