$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:ReinitialisationMotDePasse.feature");
formatter.feature({
  "name": "Réinitialiser MDP US4",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@REQ_POEC3-4"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Réinitialisation du mot de passe Ok",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TEST_POEC3-41"
    },
    {
      "name": "@Cas_de_Test_G3"
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
  "name": "je clique sur le lien Lost your password je suis redirigé vers une page contenant un champ login",
  "keyword": "And "
});
formatter.step({
  "name": "je saisis mon login et je clique sur valider \"\u003cLoginReinit\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Je vérifie l\u0027affichage du message de confirmation",
  "keyword": "And "
});
formatter.step({
  "name": "un mail de réinitialisation est envoyé",
  "keyword": "And "
});
formatter.step({
  "name": "je ouvre ma boite mail et je vérifie la presence de un nouveau mail",
  "keyword": "And "
});
formatter.step({
  "name": "je ouvre le mail de réinitialisation du mot de passe.",
  "keyword": "And "
});
formatter.step({
  "name": "je clique sur le lien de réinitialisation du mot de passe et je suis dirigé vers la page de réinitialisation du mot de passe",
  "keyword": "And "
});
formatter.step({
  "name": "je saisis mon nouveau mot de passe dans le premier champ \"\u003cMdpNew\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "je saisis mon nouveau mot de passe dans le champ de confirmation \"\u003cMdpNewConfirm\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "je clique sur valider",
  "keyword": "And "
});
formatter.step({
  "name": "je vérifie le affichage du message de confirmation",
  "keyword": "And "
});
formatter.step({
  "name": "je clique sur le lien My Account",
  "keyword": "And "
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
        "LoginReinit",
        "MdpNew",
        "MdpNewConfirm",
        "Login",
        "MDP"
      ]
    },
    {
      "cells": [
        "passwordreinit@yopmail.com",
        "Pmp1989d\u0026",
        "Pmp1989d\u0026",
        "passwordreinit@yopmail.com",
        "Pmp1989d\u0026"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Réinitialisation du mot de passe Ok",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@REQ_POEC3-4"
    },
    {
      "name": "@TEST_POEC3-41"
    },
    {
      "name": "@Cas_de_Test_G3"
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
  "name": "je clique sur le lien Lost your password je suis redirigé vers une page contenant un champ login",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsMyAccount.jeCliqueSurLeLienLostYourPasswordJeSuisRedirigéVersUnePageContenantUnChampLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis mon login et je clique sur valider \"passwordreinit@yopmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsLostPassword.jeSaisisMonLoginEtJeCliqueSurValider(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Je vérifie l\u0027affichage du message de confirmation",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsLostPassword.jeVérifieLAffichageDuMessageDeConfirmation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "un mail de réinitialisation est envoyé",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "je ouvre ma boite mail et je vérifie la presence de un nouveau mail",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "je ouvre le mail de réinitialisation du mot de passe.",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "je clique sur le lien de réinitialisation du mot de passe et je suis dirigé vers la page de réinitialisation du mot de passe",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "je saisis mon nouveau mot de passe dans le premier champ \"Pmp1989d\u0026\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "je saisis mon nouveau mot de passe dans le champ de confirmation \"Pmp1989d\u0026\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "je clique sur valider",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "je vérifie le affichage du message de confirmation",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "je clique sur le lien My Account",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "dans la page login je saisie le mail dans le champ mail \"passwordreinit@yopmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsMyAccount.dansLaPageLoginJeSaisieLeMailDansLeChampMail(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "dans la page login je saisie le MDP dans le champ MDP \"Pmp1989d\u0026\"",
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