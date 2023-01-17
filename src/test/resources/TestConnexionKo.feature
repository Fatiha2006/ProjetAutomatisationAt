
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

  @TEST_POEC3-93 @Cas_de_Test_G3 @Fatiha_test
  Scenario Outline: Connexion avec mot de passe erroné
    Given j'ouvre l'application
    When je clique sur la page My Account
    And dans la page login je saisie le mail dans le champ mail "<Login>"
    And dans la page login je saisie le MDP dans le champ MDP "<MDP>"
    And je clique sur le bouton LOGIN
    Then Message erreur s'affiche "<MSG>"
    Examples:
      |Login                 |MDP     |MSG
      |fatiha-m_18@hotmail.com |Anir1|Error: the password you entered for the usernameError: the password you entered for the username fatiha-m_18@hotmail.com is incorrect. Lost your password? is incorrect. Lost your password?
