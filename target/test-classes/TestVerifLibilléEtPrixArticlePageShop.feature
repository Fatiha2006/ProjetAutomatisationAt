@REQ_POEC3-7
Feature: Processus d’achat US7
	#En tant qu'
	#Utilisateur
	#Je souhaite
	#Depuis la page ""Shop"", ajouter des articles dans mon panier
	#Afin de
	#Pouvoir passer des commandes
	#Règles de gestion :
	#RG1 : La page "Shop" contient les articles en vente
	#RG2 : Chaque article possède un bouton "ADD TO BASKET" permettant d'ajouter l'article au panier. A chaque
	#ajout, un lien ""VIEW BASKET"" apparaît au-dessous l'article, si l'article n'est pas en stock, un bouton "READ
	#MORE" apparaît à la place du bouton "ADD TO BASKET"
	#RG3 : Le lien ""View Basket"" redirige vers le panier. Le panier peut être consulté depuis toutes les pages avec un
	#lien contenu dans une icône en entête
	#RG4 : Un filtre permet d'affiner la vue des articles par prix
	#RG5 : Un filtre permet d'affiner la vue des articles par thème
	#RG6 : Chaque article contient une photo descriptive, un libellé et le prix affiché au-dessous. Un lien actif sur ces 3
	#éléments redirige vers le détail de l'article

  @TEST_POEC3-49 @Cas_de_Test_G3 @Fatiha_test
  Scenario: Vérification de libellé et le prix d'article dans la page shop
    Given j'ouvre l'application
    When  je clique sur la page shop
    Then je vérifie que l'article cotient un prix
    And je vérifie que l'article contient un libille
