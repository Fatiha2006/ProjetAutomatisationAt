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

	#L’utilisateur doit depuis la page descriptive d’un article ajouter des articles au panier, et inscrire le nombre d’articles souhaité dans le champs prévu à cet effet.
	#
	# Le panier doit contenir l’article sélectionné, et la quantité choisie.
	@TEST_POEC3-67 @Cas_de_Test_G3 @Pm_Test
	Scenario Outline: Vérification du bouton Ajout au panier et vérification du champ de sélection du nombre d'articles à ajouter au panier
		Given j'ouvre l'application
		When je clique la page shop
		And je clique sur un article
		And je tape le nombre de articles souhaités dans le champ de selection du nombre de article "<NbrArticles>"
		And je clique sur le bouton ajouter au panier
		And je suis notifié du libelle et du nombre de articles ajoutés à mon panier "<NotifNbrArticles>"
		And je clique sur le bouton voir mon panier et je suis redirigé vers le panier
		And je vérifie le libelle de mon article "<Libelle>"
		Then Je vérifie que le bon nombre de articles a été ajouté au panier "<NbrArticlesPanier>"
		Examples:
		|NbrArticles|NbrArticlesPanier   |Libelle                 |NotifNbrArticles                                             |
		|5          |5                   |HTML5 WebApp Develpment |5 × “HTML5 WebApp Develpment” have been added to your basket.|
