@REQ_POEC3-4
Feature: Réinitialiser MDP US4
	#En tant qu'
	#Utilisateur
	#Je souhaite
	#Ré-initialiser mon mot de passe oublié
	#Règles de gestion :
	#RG1 : Un lien "Lost your password?" doit rediriger vers une page permettant de saisir son login et de valider la
	#demande de ré-initialisation
	#RG2 : La demande validée génére l'envoi automatique d'un lien de réinitialisation dans la boite mail de
	#l'utilisateur
	#RG3: Le lien reçu dans le mail renvoi vers une page de l'application permettant de saisir un nouveau mot de
	#passe. L'utilisateur doit re-confirmer son mot de passe

	#En cas d’oubli de son mot de passe , l’utilisateur peut cliquer sur le lien Lost Password.
	#
	#Après avoir renseigné son login, il  recevoir un mail de réinitialisation du mot de passe et pouvoir réinitialiser son mot de passe.
	@TEST_POEC3-41 @Cas_de_Test_G3
	Scenario Outline: Réinitialisation du mot de passe Ok
		Given j'ouvre l'application
		When je clique sur la page My Account
		And je clique sur le lien Lost your password je suis redirigé vers une page contenant un champ login
		And je saisis mon login et je clique sur valider "<LoginReinit>"
		And Je vérifie l'affichage du message de confirmation
		And un mail de réinitialisation est envoyé
		And je ouvre ma boite mail et je vérifie la presence de un nouveau mail
		And je ouvre le mail de réinitialisation du mot de passe.
		And je clique sur le lien de réinitialisation du mot de passe et je suis dirigé vers la page de réinitialisation du mot de passe
		And je saisis mon nouveau mot de passe dans le premier champ "<MdpNew>"
		And je saisis mon nouveau mot de passe dans le champ de confirmation "<MdpNewConfirm>"
		And je clique sur valider
		And je vérifie le affichage du message de confirmation
		And je clique sur le lien My Account
		And dans la page login je saisie le mail dans le champ mail "<Login>"
		And dans la page login je saisie le MDP dans le champ MDP "<MDP>"
		And je clique sur le bouton LOGIN
		Then je vérifie que l'écran Dashboard est affiché
		Examples:
			|LoginReinit                 | MdpNew  |MdpNewConfirm|Login                     |MDP      |
			|passwordreinit@yopmail.com  |Pmp1989d&|Pmp1989d&    |passwordreinit@yopmail.com|Pmp1989d&|
