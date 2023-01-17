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

	@TEST_POEC3-53 @Cas_de_Test_G3 @Fatiha_test
	Scenario Outline: vérification la présence des liens sur la page My Account après la connexion
		Given j'ouvre l'application
		When je clique sur la page My Account
		And dans la page login je saisie le mail dans le champ mail "<Login>"
		And dans la page login je saisie le MDP dans le champ MDP "<MDP>"
		And je clique sur le bouton LOGIN
		Then je vérifie la présence de lien Orders
		And je vérifie la présence de lien Download
		And je vérifie la présence de lien Adresses
		And je vérifie la présence de lien Account Details
		And je vérifie la présence de lien Logout
		Examples:
			|Login                 |MDP|
			|fatiha-m_18@hotmail.com |Anir1234&|
