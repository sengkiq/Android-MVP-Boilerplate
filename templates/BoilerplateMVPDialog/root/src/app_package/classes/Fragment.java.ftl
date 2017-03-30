package ${packageName}.ui.${mvpName};

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ${packageName}.R;
import ${packageName}.loader.PresenterFactory;
import ${packageName}.injection.components.AppComponent;
import ${packageName}.ui.BaseDialogFragment;
import ${packageName}.ui.${mvpName}.injection.${moduleClass};
import ${packageName}.ui.${mvpName}.injection.Dagger${componentClass};

import javax.inject.Inject;

public final class ${activityClass} extends BaseDialogFragment<${presenterClass}, ${viewClass}> implements ${viewClass}
{
    @Inject
    PresenterFactory<${presenterClass}> mPresenterFactory;

    // Your presenter is available using the mPresenter variable

    public ${activityClass}()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.${layoutName}, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        // Your code here
        // Do not call presenter from here, it will be null! Wait for onStart
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
    protected PresenterFactory<${presenterClass}> getPresenterFactory()
    {
        return mPresenterFactory;
    }
}
