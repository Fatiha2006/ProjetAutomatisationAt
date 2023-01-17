$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:TestConnexionKo.feature");
formatter.feature({
  "name": "Connexion US2",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@REQ_POEC3-2"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Connexion avec mot de passe erroné",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TEST_POEC3-93"
    },
    {
      "name": "@Cas_de_Test_G3"
    },
    {
      "name": "@Fatiha_test"
    }
  ]
});
formatter.step({
  "name": "j\u0027ouvre l\u0027application",
  "keyword": "Given "
});
formatter.step({
  "name": "je clique sur la page My Account",
  "keyword": "When "
});
formatter.step({
  "name": "dans la page login je saisie le mail dans le champ mail \"\u003cLogin\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "dans la page login je saisie le MDP dans le champ MDP \"\u003cMDP\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "je clique sur le bouton LOGIN",
  "keyword": "And "
});
formatter.step({
  "name": "Message erreur s\u0027affiche \"\u003cMSG\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Login",
        "MDP"
      ]
    },
    {
      "cells": [
        "fatiha-m_18@hotmail.com",
        "Anir1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Connexion avec mot de passe erroné",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@REQ_POEC3-2"
    },
    {
      "name": "@TEST_POEC3-93"
    },
    {
      "name": "@Cas_de_Test_G3"
    },
    {
      "name": "@Fatiha_test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "j\u0027ouvre l\u0027application",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefsAcceuil.jOuvreLApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur la page My Account",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefsAcceuil.jeCliqueSurLaPageMyAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "dans la page login je saisie le mail dans le champ mail \"fatiha-m_18@hotmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsMyAccount.dansLaPageLoginJeSaisieLeMailDansLeChampMail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "dans la page login je saisie le MDP dans le champ MDP \"Anir1\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsMyAccount.dansLaPageLoginJeSaisieLeMDPDansLeChampMDP(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur le bouton LOGIN",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsMyAccount.jeCliqueSurLeBoutonLOGIN()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message erreur s\u0027affiche \"\u003cMSG\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefsMyAccount.messageErreurSAffiche(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("classpath:TestConnexionOK.feature");
formatter.feature({
  "name": "Connexion US2",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@REQ_POEC3-2"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Connexion OK",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TEST_POEC3-22"
    },
    {
      "name": "@Fatiha_test"
    }
  ]
});
formatter.step({
  "name": "j\u0027ouvre l\u0027application",
  "keyword": "Given "
});
formatter.step({
  "name": "je clique sur la page My Account",
  "keyword": "When "
});
formatter.step({
  "name": "dans la page login je saisie le mail dans le champ mail \"\u003cLogin\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "dans la page login je saisie le MDP dans le champ MDP \"\u003cMDP\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "je clique sur le bouton LOGIN",
  "keyword": "And "
});
formatter.step({
  "name": "je vérifie que l\u0027écran Dashboard est affiché",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Login",
        "MDP"
      ]
    },
    {
      "cells": [
        "fatiha-m_18@hotmail.com",
        "Anir1234\u0026"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Connexion OK",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@REQ_POEC3-2"
    },
    {
      "name": "@TEST_POEC3-22"
    },
    {
      "name": "@Fatiha_test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "j\u0027ouvre l\u0027application",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefsAcceuil.jOuvreLApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur la page My Account",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefsAcceuil.jeCliqueSurLaPageMyAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "dans la page login je saisie le mail dans le champ mail \"fatiha-m_18@hotmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsMyAccount.dansLaPageLoginJeSaisieLeMailDansLeChampMail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "dans la page login je saisie le MDP dans le champ MDP \"Anir1234\u0026\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsMyAccount.dansLaPageLoginJeSaisieLeMDPDansLeChampMDP(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur le bouton LOGIN",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsMyAccount.jeCliqueSurLeBoutonLOGIN()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je vérifie que l\u0027écran Dashboard est affiché",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefsMyAccount.jeVérifieQueLÉcranDashboardEstAffiché()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("classpath:TestVerificationLinksMyAccount.feature");
formatter.feature({
  "name": "Connexion US2",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@REQ_POEC3-2"
    }
  ]
});
formatter.scenario({
  "name": "vérification la présence des liens sur la page My Account après la connexion",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@REQ_POEC3-2"
    },
    {
      "name": "@TEST_POEC3-53"
    },
    {
      "name": "@Cas_de_Test_G3"
    },
    {
      "name": "@Fatiha_test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "j\u0027ouvre l\u0027application",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefsAcceuil.jOuvreLApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur la page My Account",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefsAcceuil.jeCliqueSurLaPageMyAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je me connect",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsMyAccount.jeMeConnect()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"username\"]\"}\n  (Session info: chrome\u003d108.0.5359.125)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027FRP03384\u0027, ip: \u0027192.168.3.40\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.17\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.125, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: C:\\Users\\FORMAT~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:2573}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: c496c305b5f2ba29b38ef2d20232e0b8\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"username\"]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepsdefs.MyStepdefsMyAccount.jeMeConnect(MyStepdefsMyAccount.java:64)\r\n\tat ✽.je me connect(classpath:TestVerificationLinksMyAccount.feature:22)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "je vérifie la présence de lien Orders",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefsMyAccount.jeVérifieLaPrésenceDeLienOrders()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "je vérifie la présence de lien Download",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsMyAccount.jeVérifieLaPrésenceDeLienDownload()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "je vérifie la présence de lien Adresses",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsMyAccount.jeVérifieLaPrésenceDeLienAdresses()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "je vérifie la présence de lien Account Details",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsMyAccount.jeVérifieLaPrésenceDeLienAccountDetails()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "je vérifie la présence de lien Logout",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsMyAccount.jeVérifieLaPrésenceDeLienLogout()"
});
formatter.result({
  "status": "skipped"
});
});