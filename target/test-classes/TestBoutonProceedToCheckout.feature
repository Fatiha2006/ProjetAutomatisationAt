@REQ_POEC3-9
Feature: Consulter Panier et finaliser les achats US9
	#En tant qu'
	#Utilisateur
	#Je souhaite
	#Consulter mon panier
	#Afin de
	#Finaliser mes achats
	#Règles de gestion :
	#RG1 : La page panier affiche un récapitulatif des articles ajoutés spécifiant la quantité, le prix unitaire et le prix
	#total
	#RG2 : Chaque article peut être supprimé par un bouton, la quantité de chaque article peut être modifié par le
	#champ quantité
	#RG3 : Au-dessous du récapitulatif des articles, un champ "Coupon code" et un bouton "APPLY COUPON"
	#permettant d’apppliquer un code promotionnel sur la commande
	#RG3 : Un pavé récapitulatif "Basket Totals" spécifie le prix total et la taxe associée
	#RG4 : Un bouton "Proceed to Checkout" permet de valider la commande et de passer au paiement"

	#Ce test permet de vérifier si le bouton  « Proceed to Checkout » est fonctionnel et permet de passer au paiement.
  @TEST_POEC3-43 @TESTSET_POEC3-102 @Cas_de_Test_G3
  Scenario: Le Bouton « Proceed to Checkout » est fonctionnel
    Given j'ouvre l'application
    When je clique la page shop
    And je clique sur le bouton add to basket
    And je clique sur le bouton VIEW BASKET
    And je clique sur le bouton Proceed to Checkout
    Then le pavé Billing Details est affiché
