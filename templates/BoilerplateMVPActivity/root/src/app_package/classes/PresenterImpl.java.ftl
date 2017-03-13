package ${packageName}.ui.${mvpName};

import ${packageName}.data.DataManager;
import ${packageName}.models.states.${stateClass};
import ${packageName}.ui.BasePresenterImpl;

import javax.inject.Inject;

public final class ${presenterClass}Impl extends BasePresenterImpl<${viewClass},${stateClass}> implements ${presenterClass}
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

      @Override
      public ${stateClass} getState() {
      return new ${stateClass}();
      }

      @Override
      public void setState(${stateClass} state) {

      }
}
