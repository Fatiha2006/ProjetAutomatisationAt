@REQ_POEC3-2
Feature: Connexion US2
	#En tant qu'
	#Utilisateur
	#Je souhaite
	#Me connecter à mon compte
	#Afin de
	#Gérer mes commandes et mes informations personnelles
	#Règles de gestion :
	#RG1 : Dans l'espace ""My Account"" un pavé ""Login"" permet de saisir son login et son mot de passe et de
	#valider avec un bouton ""LOGIN""
	#RG2 : En se connectant à son compte l'écran ""Dashboard"" doit s'afficher, et des liens renvoyant aux pages
	#suivantes sont présentes : Dashboard, Orders, Download, Adresses, Account Details, Logout
	#RG3 : En cas de connexion avec un mot de passe erroné, un message ""ERROR: The password you entered for the
	#username ""Email"" incorrect s'affiche
	#RG4 : Une case à cocher ""Remember me"" permet de garder son login pré-rempli à la prochaine connexion

	#Je me connecte avec un compte qui existe.
  @TEST_POEC3-22 @Fatiha_test
  Scenario Outline: Connexion OK
    Given j'ouvre l'application
    When je clique sur la page My Account
    And dans la page login je saisie le mail dans le champ mail "<Login>"
    And dans la page login je saisie le MDP dans le champ MDP "<MDP>"
    And je clique sur le bouton LOGIN
    Then je vérifie que l'écran Dashboard est affiché
    Examples:
      |Login                  |MDP|
      |fatiha-m_18@hotmail.com|Anir1234&|



