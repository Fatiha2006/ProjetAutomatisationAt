package stepsdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MuStepdefsPanier {
    public static WebDriver driver = Hooks.driver;
    String XpathClickPanier = "//*[@id=\"wpmenucartli\"]/a/span[1]";
    String XpathPagePanier = "//*[@id=\"content\"]/nav";

    String XpathAddBasket = "//*[@id=\"content\"]/ul/li[4]/a[2]";
    String XpathBoutonViewBasket = "//*[@id=\"content\"]/ul/li[4]/a[3]";

    String XpathRecapArticles = "//*[@id=\"page-34\"]/div/div[1]/div/div/h2";

    String XpathAffichageQuantite = "//*[@id=\"page-34\"]/div/div[1]/form/table/thead/tr/th[5]";

    String XpathAffichagePrixUnitaire = "//*[@id=\"page-34\"]/div/div[1]/form/table/thead/tr/th[4]";
    String XpathAffichagePrixTotal = "//*[@id=\"page-34\"]/div/div[1]/form/table/thead/tr/th[6]";
    String XpathBoutonSupprimerPanier = "//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[1]/a";
    String XpathArticleSupprime = "//*[@id=\"page-34\"]/div/div[1]";
    String XpathQuantiteModifiable = "//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input";
    String XpathBoutonProceedToCheckout = "//*[@id=\"page-34\"]/div/div[1]/div/div/div/a";
    String XpathBillingDetails = "//*[@id=\"customer_details\"]/div[1]/div/h3";


    @When("je clique sur la page Panier")
    public void jeCliqueSurLaPagePanier() {
        WebElement ClickPagePanier = driver.findElement(By.xpath(XpathClickPanier));
        ClickPagePanier.click();

    }

    @And("je suis bien redirig√©e vers la page Panier")
    public void jeSuisBienRedirig√©eVersLaPagePanier() {
        WebElement RedirectionPagePanier = driver.findElement(By.xpath(XpathPagePanier));
       RedirectionPagePanier.getText().contains("Shop");

    }

    @And("je clique sur le bouton add to basket")
    public void jeCliqueSurLeBoutonAddToBasket() {
        WebElement ClickBoutonAddBasket = driver.findElement(By.xpath(XpathAddBasket));
        ClickBoutonAddBasket.click();
    }

    @And("je clique sur le bouton VIEW BASKET")
    public void jeCliqueSurLeBoutonVIEWBASKET() {
        WebElement ClickBoutonViewBasket = driver.findElement(By.xpath(XpathBoutonViewBasket));
        ClickBoutonViewBasket.click();
    }

    @Then("le r√©capitulatif des articles est bien affich√©")
    public void leR√©capitulatifDesArticlesEstBienAffich√©() {
        WebElement RecapArticlesaffiche = driver.findElement(By.xpath(XpathRecapArticles));
        RecapArticlesaffiche.getText().contains("Basket Totals");


    }

    @And("la quanti√© est bien affich√©")
    public void laQuanti√©EstBienAffich√©() {
        WebElement affichageQuantite = driver.findElement(By.xpath(XpathAffichageQuantite));
        affichageQuantite.getText().contains("Basket Totals");
    }

    @And("le prix unitaire est bien affich√©")
    public void lePrixUnitaireEstBienAffich√©() {
        WebElement affichagePrixUnitaire = driver.findElement(By.xpath(XpathAffichagePrixUnitaire));
        affichagePrixUnitaire.getText().contains("Price");
    }

    @And("le prix total est bien affich√©")
    public void lePrixTotalEstBienAffich√©() {
        WebElement affichagePrixTotal = driver.findElement(By.xpath(XpathAffichagePrixTotal));
        affichagePrixTotal.getText().contains("Price");
    }

    @And("je clique sur le bouton supprimer")
    public void jeCliqueSurLeBoutonSupprimer() {
        WebElement ClickBoutonSupprimer = driver.findElement(By.xpath(XpathBoutonSupprimerPanier));
        ClickBoutonSupprimer.click();

    }

    @Then("l'article est supprim√©")
    public void lArticleEstSupprim√©() {
        WebElement ArticleSupprime = driver.findElement(By.xpath(XpathArticleSupprime));
        ArticleSupprime.getText().contains("Mastering JavaScript removed. Undo?");
    }

    @And("je saisie un chiffre dans le champs quantit√©")
    public void jeSaisieUnChiffreDansLeChampsQuantit√©() {
        WebElement ArticleSupprime = driver.findElement(By.xpath(XpathQuantiteModifiable));
        ArticleSupprime.clear();
        ArticleSupprime.sendKeys("2");
    }

    @Then("la quantit√© de l'article est modifi√©e")
    public void laQuantit√©DeLArticleEstModifi√©e() {
        WebElement ArticleSupprime = driver.findElement(By.xpath(XpathQuantiteModifiable));
        String chiffre = ArticleSupprime.getAttribute("value");
        Assert.assertEquals(chiffre,"2");

    }

    @Then("Un pav√© basket totals s'affiche avec le prix total et le prix associc√©")
    public void unPav√©BasketTotalsSAfficheAvecLePrixTotalEtLePrixAssocic√©() {
        WebElement AffichageBasketTotals = driver.findElement(By.xpath(XpathRecapArticles));
      AffichageBasketTotals.getText().contains("Basket Totals");
    }

    @And("je clique sur le bouton Proceed to Checkout")
    public void jeCliqueSurLeBoutonProceedToCheckout() {
        WebElement ClickBoutonProceedChekout = driver.findElement(By.xpath(XpathBoutonProceedToCheckout));
      ClickBoutonProceedChekout.click();
    }

    @Then("le pav√© Billing Details est affich√©")
    public void lePav√©BillingDetailsEstAffich√©() {
        WebElement BillingDetailEstAffich√©= driver.findElement(By.xpath(XpathBillingDetails));
        BillingDetailEstAffich√©.getText().contains("Billing Details");
    }
}
