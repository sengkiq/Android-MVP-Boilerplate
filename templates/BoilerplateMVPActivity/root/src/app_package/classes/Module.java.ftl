package ${packageName}.ui.${mvpName}.injection;

import ${packageName}.data.DataManager;
import ${packageName}.ui.${mvpName}.${presenterClass};
import ${packageName}.ui.${mvpName}.${presenterClass}Impl;

import dagger.Module;
import dagger.Provides;

@Module
public final class ${moduleClass}
{
	@Provides
	public ${presenterClass} providePresenter(DataManager datamanager)
	{
			return new ${presenterClass}Impl(datamanager);
	}
}
