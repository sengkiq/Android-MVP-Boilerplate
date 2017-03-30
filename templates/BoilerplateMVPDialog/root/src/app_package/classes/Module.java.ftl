package ${packageName}.ui.${mvpName}.injection;

import ${packageName}.data.DataManager;
import ${packageName}.loader.PresenterFactory;
import ${packageName}.ui.${mvpName}.${presenterClass};
import ${packageName}.ui.${mvpName}.${presenterClass}Impl;

import dagger.Module;
import dagger.Provides;

@Module
public final class ${moduleClass}
{
		@Provides
		public PresenterFactory<${presenterClass}> providePresenterFactory(DataManager dataManager) {
		     return () -> new ${presenterClass}Impl(dataManager);
		}
}
