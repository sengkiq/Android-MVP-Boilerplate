package com.brianestrada.boilerplate.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.brianestrada.boilerplate.App;
import com.brianestrada.boilerplate.injection.components.AppComponent;
import com.brianestrada.boilerplate.models.states.BaseState;

public abstract class BaseFragment<P extends BasePresenter<V, S>, S extends BaseState, V> extends Fragment {
    static final String BUNDLE_KEY_STATE = "BUNDLE_KEY_STATE";
    static final String BUNDLE_KEY_FIRST_RUN = "BUNDLE_KEY_FIRST_RUN";

    @Nullable
    protected P presenter;

    protected S state;

    protected boolean firstRun;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        injectDependencies();

        firstRun = savedInstanceState == null;

        if (savedInstanceState != null) {

            if (savedInstanceState.containsKey(BUNDLE_KEY_FIRST_RUN)) {

                savedInstanceState.getBoolean(BUNDLE_KEY_FIRST_RUN);

            }

            if (savedInstanceState.containsKey(BUNDLE_KEY_STATE)) {

                state = savedInstanceState.getParcelable(BUNDLE_KEY_STATE);

                presenter.setState(state);

            }

        }
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

        presenter.onStart(firstRun);

        firstRun = false;
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

        outState.putBoolean(BUNDLE_KEY_FIRST_RUN, firstRun);

        outState.putParcelable(BUNDLE_KEY_STATE, state);

    }

    protected abstract void setupComponent(@NonNull AppComponent appComponent);
}
