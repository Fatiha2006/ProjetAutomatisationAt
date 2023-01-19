@REQ_POEC3-6
Feature: Déconnexion US6
	#En tant qu'
	#Utilisateur
	#Je souhaite
	#Me déconnecter
	#Afin de
	#Ne plus pouvoir accèder à mon espace client
	#Règles de gestion :
	#RG1 : Dans l'espace "My Account" un lien "Logout" permet la déconnexion, la page Account affiche les pavé de
	#"Login" et de "Register"

	#En tant que utilisateur je souhaite  me déconnecter avec un compte qui existe déjà .
  @TEST_POEC3-21 @Cas_de_Test_G3 @NWW
  Scenario Outline: Le lien LOGOUT est fonctionnel
    Given j'ouvre l'application
    When  je clique sur la page My Account
     And dans la page login je saisie le mail dans le champ mail "<Login>"
    And dans la page login je saisie le MDP dans le champ MDP "<MDP>"
    And je clique sur le bouton LOGIN
    And je vérifie que l'écran Dashboard est affiché
    And je clique sur le lien lougout
    Then le pavé de login est affiché
    Examples:
      |Login                    |MDP|
      |fatiha-m_18@hotmail.com |Anir1234&|

