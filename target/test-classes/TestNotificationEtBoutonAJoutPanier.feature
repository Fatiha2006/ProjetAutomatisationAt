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

	#Depuis la fiche descriptive d’un article, l’utilisateur doit être notifié de l’ajout de l’article au panier, et se voir afficher un bouton permettant l’accès au panier
  @Cas_de_Test_G3
  Scenario Outline: Notification de l'utilisateur de l'ajout d'un article au panier et affichage du bouton de redirection vers le panier
    Given j'ouvre l'application
    When je clique la page shop
    And je clique sur un article
    And je clique sur le bouton ajouter au panier
    Then je suis notifié de le ajout de mon article au panier "<Notification>"
    And je vérifie la présence du bouton ajouter au panier

    Examples: |Notification                                  |
    |“HTML5 WebApp Develpment” has been added to your basket.|