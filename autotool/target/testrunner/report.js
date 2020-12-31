$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/MyTest.feature");
formatter.feature({
  "name": "As a user, i want to login into the Mektoube",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login successfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test01"
    }
  ]
});
formatter.step({
  "name": "Go to \u0027https://mektoube.fr/login\u0027 url",
  "keyword": "Given "
});
formatter.match({
  "location": "DefinitionSteps.goToUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Insert \u0027yassine_yes\u0027 into the Email field",
  "keyword": "When "
});
formatter.match({
  "location": "DefinitionSteps.insertAIntoTheEmailField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Insert \u0027Mektoubi2017\u0027 into the Password field",
  "keyword": "When "
});
formatter.match({
  "location": "DefinitionSteps.insertAIntoThePasswordField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login button",
  "keyword": "When "
});
formatter.match({
  "location": "DefinitionSteps.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User login successfully into \u0027https://mektoube.fr/main/discoveries\u0027 front site",
  "keyword": "Then "
});
formatter.match({
  "location": "DefinitionSteps.userLoginSuccessfullyIntoHttpsMektoubeFrMainDiscoveriesFrontSite(String)"
});
formatter.result({
  "error_message": "java.lang.IllegalMonitorStateException: current thread is not owner\n\tat java.base/java.lang.Object.wait(Native Method)\n\tat autoframework.pages.DictionaryPage.loginSuccess(DictionaryPage.java:65)\n\tat autoframework.steps.serenity.EndUserSteps.login_successfully(EndUserSteps.java:39)\n\tat autoframework.steps.serenity.EndUserSteps$$EnhancerByCGLIB$$409e1070.CGLIB$login_successfully$6(\u003cgenerated\u003e)\n\tat autoframework.steps.serenity.EndUserSteps$$EnhancerByCGLIB$$409e1070$$FastClassByCGLIB$$324deb22.invoke(\u003cgenerated\u003e)\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\n\tat net.thucydides.core.steps.BaseMethodRunner.invokeMethod(BaseMethodRunner.java:10)\n\tat net.thucydides.core.steps.NormalMethodRunner.invokeMethodAndNotifyFailures(NormalMethodRunner.java:20)\n\tat net.thucydides.core.steps.StepInterceptor.runNormalMethod(StepInterceptor.java:338)\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:127)\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:63)\n\tat autoframework.steps.serenity.EndUserSteps$$EnhancerByCGLIB$$409e1070.login_successfully(\u003cgenerated\u003e)\n\tat autoframework.steps.DefinitionSteps.userLoginSuccessfullyIntoHttpsMektoubeFrMainDiscoveriesFrontSite(DefinitionSteps.java:63)\n\tat ✽.User login successfully into \u0027https://mektoube.fr/main/discoveries\u0027 front site(src/test/resources/features/MyTest.feature:9)\n",
  "status": "failed"
});
});