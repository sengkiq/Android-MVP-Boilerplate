package ${packageName}.ui.${mvpName}.injection;

import ${packageName}.injection.components.AppComponent;
import ${packageName}.injection.scopes.ActivityScope;
import ${packageName}.ui.${mvpName}.${activityClass};

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ${moduleClass}.class)
public interface ${componentClass}
{
    void inject(${activityClass} activity);
}
