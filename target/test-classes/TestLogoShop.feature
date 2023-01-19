@REQ_POEC3-3
Feature: Vérifier logo US3
    #En tant qu'
    #Utilisateur
    #Je souhaite
    #Voir le logo du Site "AT"
    #Règles de gestion :
    #RG1 : Le logo contient un lien qui doit rediriger le site sur la page accueil
    #RG2 : Le logo doit être présent sur toutes les pages du site

  @TEST_POEC3-18 @NWW
  Scenario: Depuis la page shop le logo contient un lien vers la page d’accueil
    Given j'ouvre l'application
    When je clique sur la page shop
    And je suis bien redirigée vers la page shop
    And je clique sur le logo AT
    Then je suis bien redirigé vers la page d’accueil