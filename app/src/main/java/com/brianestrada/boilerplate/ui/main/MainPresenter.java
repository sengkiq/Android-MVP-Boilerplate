package com.brianestrada.boilerplate.ui.main;

import com.brianestrada.boilerplate.ui.BasePresenter;

public interface MainPresenter extends BasePresenter<MainView> {
    void loadUsers();

    void saveUser();

    void passUsersToView();

    void ping();
}
