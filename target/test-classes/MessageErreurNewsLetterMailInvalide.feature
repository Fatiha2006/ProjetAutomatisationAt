@REQ_POEC3-10
Feature: Souscription Newsletter US10
	#En tant qu'
	#Utilisateur
	#Je souhaite
	#Souscrire à la newsletter
	#Afin de
	#Me tenir informer des dernières nouvelles de la boutique en ligne
	#Règles de gestion :
	#RG1 : Un champ « SUBSCRIBE HERE » permet la saisie d’une adresse. Un bouton "SUBSCRIBE" permet la
	#validation de cette adresse
	#RG2 : L’adresse saisie doit être au format "xxx@yyy.zz" En cas d’erreur à la validation de l’adresse (format) un
	#message "Please provide a valid email address" apparaît
	#RG3 : La fonctionnalité est présente sur les pages "Shop", "My Account" et "Panier"
	#RG4 : A la souscription, un mail de confirmation est reçu dans la boite mail de l’utilisateur

	@TEST_POEC3-25 @TESTSET_POEC3-104 @Cas_de_Test_G3
	Scenario Outline: Inscription à la newsletter avec un mail non conforme
		Given j'ouvre l'application

		    When je suis la page D'acceuil

		    And Je saisis le mail dans le champ subscribe here "<Mail>"

		    And Je clique sur le bouton subscribe

		    Then Un message d'erreur apparait "<Message>"
		    Examples:
		      |Mail    |Message|
		      |gg@gmail|Please provide a valid email address.|
