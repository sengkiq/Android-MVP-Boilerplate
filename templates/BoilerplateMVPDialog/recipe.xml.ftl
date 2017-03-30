<?xml version="1.0"?>
<recipe>
    <#include "fragment_layout_recipe.xml.ftl" />

    <instantiate from="src/app_package/classes/Fragment.java.ftl"
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

</recipe>
