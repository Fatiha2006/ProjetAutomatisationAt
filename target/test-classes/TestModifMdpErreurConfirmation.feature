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

	#L’utilisateur doit pouvoir modifier son mot de passe depuis le pavé Account Details. 
	#
	#Pour procéder à la vérification, il doit taper sont mot de passe actuel, son nouveau mot de passe, puis taper son nouveau mot de passe une seconde fois pour le confirmer.
	#
	#Nous vérifions ici qu’il ne peut pas taper un mot de passe différent dans le champ de confirmation
	@TEST_POEC3-60 @TESTSET_POEC3-111 @TESTSET_POEC3-101 @Cas_de_Test_G3
	Scenario Outline: Modification du mot de passe depuis la page Account Details erreur de confirmation
		Given j'ouvre l'application
		When je clique sur la page My Account
		And dans la page login je saisie le mail dans le champ mail "<mail>"
		And dans la page login je saisie le MDP dans le champ MDP "<MDP>"
		And je clique sur le bouton LOGIN
		And je clique sur le lien Account Details
		And je saisis le mot de passe dans le champ mot de passe actuel "<ActualMdpG4>"
		And je saisis le nouveau mot de passe dans le champ nouveau mot de passe "<NewMdpG4>"
		And je saisis un mauvais mot de passe dans le champ de confirmation "<WrongMdpConfirm>"
		And je clique sur le bouton confirmer
		Then je vérifie le affichage du message d erreur mdp non identique "<ErrorMessagePassDoNoMatch>"
		
		Examples:
		|mail                        |MDP             |ActualMdpG4     |NewMdpG4    |WrongMdpConfirm   |ErrorMessagePassDoNoMatch  |
		|pmpiquet@aol.com            |C@liforniakid44 |C@liforniakid44 |Poecsoft24& |Poecsoft23&       |New passwords do not match.|
