$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:TestConnexionOK.feature");
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
  "name": "je clique sur la page My Account",
  "keyword": "Given "
});
formatter.step({
  "name": "dans la page login je saisie le mail dans le champ mail  \"\u003cLogin\u003e\"",
  "keyword": "When "
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
        "bb.fatiha@hotmail.com",
        "Nazim18\u0026"
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
formatter.step({
  "name": "je clique sur la page My Account",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefsAcceuil.jeCliqueSurLaPageMyAccount()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat stepsdefs.MyStepdefsAcceuil.jeCliqueSurLaPageMyAccount(MyStepdefsAcceuil.java:14)\r\n\tat ✽.je clique sur la page My Account(classpath:TestConnexionOK.feature:21)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "dans la page login je saisie le mail dans le champ mail  \"bb.fatiha@hotmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefsMyAccount.dansLaPageLoginJeSaisieLeMailDansLeChampMail(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "dans la page login je saisie le MDP dans le champ MDP \"Nazim18\u0026\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsMyAccount.dansLaPageLoginJeSaisieLeMDPDansLeChampMDP(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "je clique sur le bouton LOGIN",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsMyAccount.jeCliqueSurLeBoutonLOGIN()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "je vérifie que l\u0027écran Dashboard est affiché",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefsMyAccount.jeVérifieQueLÉcranDashboardEstAffiché()"
});
formatter.result({
  "status": "skipped"
});
});