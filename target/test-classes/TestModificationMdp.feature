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

	#L’utilisateur peut doit avoir accès depuis son espace personnel, à un pavé Account Details.
	#
	#Depuis cet espace, il doit pouvoir modifier son mot de passe.
	@TEST_POEC3-59 @TESTSET_POEC3-111 @TESTSET_POEC3-101 @Cas_de_Test_G3
	Scenario Outline: Modification du mot de passe depuis la page Account Details
		Given j'ouvre l'application
		When je clique sur la page My Account
		And dans la page login je saisie le mail dans le champ mail "<mail>"
		And dans la page login je saisie le MDP dans le champ MDP "<MDP>"
		And je clique sur le bouton LOGIN
		And je clique sur le lien Account Details
		And je saisis le mot de passe dans le champ mot de passe actuel "<ActualMdpG4>"
		And je saisis le nouveau mot de passe dans le champ nouveau mot de passe "<NewMdpG4>"
		And je saisis le nouveau mot de passe dans le champ de confirmation "<NewMdpConfirm>"
		And je clique sur le bouton confirmer
		Then je vérifie le affichage du message de confirmation "<MessageConfirmation>"
		# Mot de passe à reconfigurer sur le compte après le test C@liforniakid44 - Poecsoft&23
		Examples:
		|mail                  |MDP            |ActualMdpG4     |NewMdpG4       |NewMdpConfirm  |MessageConfirmation                   |
		|testpoec2g3@yopmail.fr|C@liforniakid44|C@liforniakid44|Poecsoft&23    |Poecsoft&23     |Account details changed successfully. |
        #|testpoec2g3@yopmail.fr|Poecsoft&23    |Poecsoft&23    |C@liforniakid44|C@liforniakid44 |Account details changed successfully. |

