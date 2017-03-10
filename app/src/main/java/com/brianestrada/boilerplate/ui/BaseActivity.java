package com.brianestrada.boilerplate.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.brianestrada.boilerplate.App;
import com.brianestrada.boilerplate.injection.components.AppComponent;

public abstract class BaseActivity<P extends BasePresenter<V>, V> extends AppCompatActivity {
    static final String BUNDLE_KEY_FIRST_RUN = "BUNDLE_KEY_FIRST_RUN";

    @Nullable
    protected P presenter;

    private boolean firstRun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        injectDependencies();
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
        assert presenter != null;

        presenter.onViewAttached((V) this);

        presenter.onStart(firstRun);

        firstRun = false;
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

        outState.putBoolean(BUNDLE_KEY_FIRST_RUN, firstRun);

    }

    protected abstract void setupComponent(@NonNull AppComponent appComponent);
}
