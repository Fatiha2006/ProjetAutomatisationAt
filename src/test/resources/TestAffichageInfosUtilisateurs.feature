@REQ_POEC3-5
Feature: Modification mot de passe US5
	#En tant qu'
	#Utilisateur
	#Je souhaite
	#Depuis la page "My Account" visualiser mes informations de compte
	#Afin de
	#Pouvoir gérer mon compte
	#Règles de gestion :
	#RG1 : Dans la page "My Account", un lien "Account Details" redirige vers les informations de comptes (nom
	#prénom, mail)
	#RG2 : Un espace permet de changer son mot de passe, l'utilisateur doit saisir son mot de passe actuel, saisir un
	#nouveau mot de passe et le confirmer. En cas de succés un message "Account details changed successfully."
	#s'affiche, sinon un message d'erreur s'affiche suivant la nature du problème ("Your current password is
	#incorrect.", "New passwords do not match.")

	#L’utilisateur doit pouvoir regarder les informations liées à son compte depuis la page Account Details
	@TEST_POEC3-57 @TESTSET_POEC3-111 @TESTSET_POEC3-101 @Cas_de_Test_G3
	Scenario Outline: Affichage des informations de l'utilisateur
		Given j'ouvre l'application
		When je clique sur la page My Account
		And dans la page login je saisie le mail dans le champ mail "<mail>"
		And dans la page login je saisie le MDP dans le champ MDP "<MDP>"
		And je clique sur le bouton LOGIN
		And je clique sur le lien Account Details
		Then je vérifie que le bon nom est affiché
		And je vérifie que le bon prénom est affiché
		And je vérifie que le bon email est affiché
		Examples:
		      |mail                             |MDP            |
		      |testpoec2g3@yopmail.fr           |Poecsoft&22    |
