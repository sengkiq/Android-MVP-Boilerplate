package com.brianestrada.boilerplate.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.brianestrada.boilerplate.App;
import com.brianestrada.boilerplate.injection.components.AppComponent;
import com.brianestrada.boilerplate.models.BaseState;

import javax.inject.Inject;

import timber.log.Timber;

public abstract class BaseActivity<P extends BasePresenter<V, S>, S extends BaseState, V> extends AppCompatActivity {
    static final String BUNDLE_KEY_STATE = "BUNDLE_KEY_STATE";

    @Inject
    @Nullable
    protected P presenter;

    protected S state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        injectDependencies();

        if (savedInstanceState != null) {

            if (savedInstanceState.containsKey(BUNDLE_KEY_STATE)) {

                state = savedInstanceState.getParcelable(BUNDLE_KEY_STATE);

                presenter.setState(state);

            }

        }

    }

    private void injectDependencies() {
        setupComponent(((App) getApplication()).getAppComponent());
    }

    @Override
    protected void onStart() {
        super.onStart();

        doStart();
    }


    @SuppressWarnings("unchecked")
    private void doStart() {
        if (presenter == null) {
            Timber.d("Null Presenter");
            return;
        }

        presenter.onViewAttached((V) this);

        presenter.onStart();
    }

    @Override
    protected void onStop() {
        if (presenter != null) {
            presenter.onStop();

            presenter.onViewDetached();
        }

        super.onStop();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        state = presenter.getState();

        outState.putParcelable(BUNDLE_KEY_STATE, state);

    }

    protected abstract void setupComponent(@NonNull AppComponent appComponent);
}
