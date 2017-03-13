package ${packageName}.ui.${mvpName};

import android.os.Bundle;
import android.support.annotation.NonNull;

import ${packageName}.R;
import ${packageName}.injection.components.AppComponent;
import ${packageName}.models.states.${stateClass};
import ${packageName}.ui.BaseActivity;
import ${packageName}.ui.${mvpName}.injection.Dagger${componentClass};
import ${packageName}.ui.${mvpName}.injection.${moduleClass};

import javax.inject.Inject;
import butterknife.ButterKnife;

public final class ${activityClass} extends BaseActivity<${presenterClass}, ${stateClass},${viewClass}> implements ${viewClass}
{
    @Inject
    ${presenterClass} presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.${layoutName});
        ButterKnife.bind(this);
    }

    @Override
    protected void setupComponent(@NonNull AppComponent parentComponent)
    {
        Dagger${componentClass}.builder()
            .appComponent(parentComponent)
            .${moduleClass?uncap_first}(new ${moduleClass}())
            .build()
            .inject(this);
    }
}
