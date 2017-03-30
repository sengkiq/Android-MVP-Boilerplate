package ${packageName}.ui.${mvpName}.injection;

import ${packageName}.injection.components.AppComponent;
import ${packageName}.injection.scopes.FragmentScope;
import ${packageName}.ui.${mvpName}.${activityClass};

import dagger.Component;

@FragmentScope
@Component(dependencies = AppComponent.class, modules = ${moduleClass}.class)
public interface ${componentClass}
{
    void inject(${activityClass} fragment);
}
