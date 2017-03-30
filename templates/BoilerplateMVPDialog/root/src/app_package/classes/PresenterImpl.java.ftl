package ${packageName}.ui.${mvpName};

import ${packageName}.data.DataManager;
import ${packageName}.ui.BasePresenterImpl;

import javax.inject.Inject;

public final class ${presenterClass}Impl extends BasePresenterImpl<${viewClass}> implements ${presenterClass}
{
      private DataManager dataManager;

      @Inject
      public ${presenterClass}Impl(DataManager dataManager) {
          super();
          this.dataManager = dataManager;
      }

      @Override
       public void onStart(boolean firstRun) {
           super.onStart(firstRun);
       }

      @Override
      public void onStop() {
          super.onStop();
      }

      @Override
      public void onPresenterDestroyed() {
          super.onPresenterDestroyed();
      }
}
