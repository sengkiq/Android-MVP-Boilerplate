<?xml version="1.0"?>
<recipe>
    <#include "../common/recipe_manifest.xml.ftl" />

    <#include "activity_layout_recipe.xml.ftl" />

    <instantiate from="src/app_package/classes/Activity.java.ftl"
      to="${escapeXmlAttribute(srcOut)}/ui/${mvpName}/${activityClass}.java" />

    <instantiate from="src/app_package/classes/View.java.ftl"
      to="${escapeXmlAttribute(srcOut)}/ui/${mvpName}/${viewClass}.java" />

    <instantiate from="src/app_package/classes/Component.java.ftl"
      to="${escapeXmlAttribute(srcOut)}/ui/${mvpName}/injection/${componentClass}.java" />

    <instantiate from="src/app_package/classes/Module.java.ftl"
      to="${escapeXmlAttribute(srcOut)}/ui/${mvpName}/injection/${moduleClass}.java" />

    <instantiate from="src/app_package/classes/PresenterImpl.java.ftl"
      to="${escapeXmlAttribute(srcOut)}/ui/${mvpName}/${presenterClass}Impl.java" />

    <instantiate from="src/app_package/classes/Presenter.java.ftl"
      to="${escapeXmlAttribute(srcOut)}/ui/${mvpName}/${presenterClass}.java" />

      <instantiate from="src/app_package/classes/State.java.ftl"
        to="${escapeXmlAttribute(srcOut)}/models/states/${stateClass}.java" />

</recipe>
