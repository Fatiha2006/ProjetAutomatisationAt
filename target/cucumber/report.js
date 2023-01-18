$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:TestLogoPanier.feature");
formatter.feature({
  "name": "Vérifier logo US3",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@REQ_POEC3-3"
    }
  ]
});
formatter.scenario({
  "name": "Depuis la page Panier le logo contient un lien vers la page d’accueil",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@REQ_POEC3-3"
    },
    {
      "name": "@TEST_POEC3-97"
    },
    {
      "name": "@Cas_de_Test_G3"
    },
    {
      "name": "@NWW"
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
  "name": "je clique sur la page Panier",
  "keyword": "When "
});
formatter.match({
  "location": "MuStepdefsPanier.jeCliqueSurLaPagePanier()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je suis bien redirigée vers la page Panier",
  "keyword": "And "
});
formatter.match({
  "location": "MuStepdefsPanier.jeSuisBienRedirigéeVersLaPagePanier()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur le logo AT",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsShop.jeCliqueSurLeLogoAT()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je suis bien redirigé vers la page d’accueil",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefsShop.jeSuisBienRedirigéVersLaPageDAccueil()"
});
formatter.result({
  "status": "passed"
});
});