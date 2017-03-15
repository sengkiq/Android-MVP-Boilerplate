package ${packageName}.ui.${mvpName};

import android.os.Bundle;
import android.support.annotation.NonNull;

import ${packageName}.R;
import ${packageName}.injection.components.AppComponent;
import ${packageName}.loader.PresenterFactory;
import ${packageName}.ui.BaseActivity;
import ${packageName}.ui.${mvpName}.injection.Dagger${componentClass};
import ${packageName}.ui.${mvpName}.injection.${moduleClass};

import javax.inject.Inject;
import butterknife.ButterKnife;

public final class ${activityClass} extends BaseActivity<${presenterClass},${viewClass}> implements ${viewClass}
{
    @Inject
    PresenterFactory<${presenterClass}> presenterFactory;

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

    @NonNull
    @Override
    protected PresenterFactory<${presenterClass}> getPresenterFactory() {
       return presenterFactory;
    }
}
