@REQ_POEC3-8
Feature: Accès fiche Produit US8
	#En tant qu'
	#Utilisateur
	#Je souhaite
	#Accéder aux détails des articles
	#Afin d'
	#Obtenir des informations sur les articles en vente
	#Règles de gestion :
	#RG1 : Les articles sont présentés par une photographie, un détail descriptif, son prix et le nombre d'exemplaires
	#encore disponible
	#RG2 : Un bouton "ADD TO BASKET" permettant d'ajouter l'article au panier. Un champ permet d'indiquer le
	#nombre d'exemplaire voulu
	#RG3 : A chaque ajout, un message “'libellé' has been added to your basket." et un bouton "VIEW BASKET"
	#permettant de se rediriger dans l'espace panier, apparaissent au-dessus l'article

	#La fiche produit doit fournir à l’utilisateur des informations sur l’artiche sélectionné: 
	#
	#* une photographie
	#
	#* un détail descriptif
	#*  son prix 
	#* le nombre d'exemplaires encore disponible
	@TEST_POEC3-72 @Cas_de_Test_G3 @Pm_Test
	Scenario Outline: Vérification de la présence des informations liées à un article sur sa fiche produit
		Given j'ouvre l'application
		When je clique la page shop
		And je clique sur un article 
		And la photo de le article est affiché
		And le détail descriptif est affiché "<Description>"
		And le prix est affiché "<Price>"
		Then le nombre de articles restants est affiché "<NbrsLeft>"
		
		Examples:
		|Description|Price   |NbrsLeft  |
		|           |        |          |
