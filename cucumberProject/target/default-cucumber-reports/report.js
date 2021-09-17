$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/homePage.feature");
formatter.feature({
  "name": "HomePage testing Sliders and Arrivals",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User this on the main homePage",
  "keyword": "Given "
});
formatter.match({
  "location": "homePageStepDefinitions.user_this_on_the_main_homePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Shop Menu",
  "keyword": "When "
});
formatter.match({
  "location": "homePageStepDefinitions.click_on_Shop_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Home menu button",
  "keyword": "Then "
});
formatter.match({
  "location": "homePageStepDefinitions.click_on_Home_menu_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Review should be regarding the book user clicked on",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "name": "Click on Reviews tab there should be a review regarding the book user clicked on",
  "keyword": "And "
});
formatter.match({
  "location": "homePageStepDefinitions.click_on_Reviews_tab_there_should_be_a_review_regarding_the_book_user_clicked_on()"
});
formatter.result({
  "error_message": "org.openqa.selenium.JavascriptException: javascript error: BookPage is not defined\n  (Session info: chrome\u003d93.0.4577.82)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Syeds-MBP-2.fios-router.home\u0027, ip: \u0027fe80:0:0:0:cf8:8ed2:cebc:d1c9%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 93.0.4577.82, chrome: {chromedriverVersion: 93.0.4577.63 (ff5c0da2ec0ad..., userDataDir: /var/folders/sh/4qc4d05s1nn...}, goog:chromeOptions: {debuggerAddress: localhost:52724}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: b87f669aba1db69ae51c5161673434ea\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:489)\n\tat com.step_definitions.homePageStepDefinitions.click_on_Reviews_tab_there_should_be_a_review_regarding_the_book_user_clicked_on(homePageStepDefinitions.java:115)\n\tat ✽.Click on Reviews tab there should be a review regarding the book user clicked on(src/test/resources/features/homePage.feature:29)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});