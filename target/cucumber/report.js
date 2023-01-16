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
  "name": "j\u0027ouvre l\u0027application",
  "keyword": "Given "
});
formatter.step({
  "name": "je clique sur la page My Account",
  "keyword": "When "
});
formatter.step({
  "name": "dans la page login je saisie le mail dans le champ mail  \"\u003cLogin\u003e\"",
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
  "name": "dans la page login je saisie le mail dans le champ mail  \"fatiha-m_18@hotmail.com\"",
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
});