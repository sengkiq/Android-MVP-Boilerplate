package com.brianestrada.boilerplate.ui.main.injection;

import com.brianestrada.boilerplate.injection.components.AppComponent;
import com.brianestrada.boilerplate.injection.scopes.ActivityScope;
import com.brianestrada.boilerplate.ui.main.MainActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = MainViewModule.class)
public interface MainViewComponent {
    void inject(MainActivity activity);
}
