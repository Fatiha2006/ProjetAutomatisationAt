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

    @When("je clique sur la page Panier")
    public void jeCliqueSurLaPagePanier() {
        WebElement ClickPagePanier = driver.findElement(By.xpath(XpathClickPanier));
        ClickPagePanier.click();

    }

    @And("je suis bien redirigée vers la page Panier")
    public void jeSuisBienRedirigéeVersLaPagePanier() {
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

    @Then("le récapitulatif des articles est bien affiché")
    public void leRécapitulatifDesArticlesEstBienAffiché() {
        WebElement RecapArticlesaffiche = driver.findElement(By.xpath(XpathRecapArticles));
        RecapArticlesaffiche.getText().contains("Basket Totals");


    }

    @And("la quantié est bien affiché")
    public void laQuantiéEstBienAffiché() {
        WebElement affichageQuantite = driver.findElement(By.xpath(XpathAffichageQuantite));
        affichageQuantite.getText().contains("Basket Totals");
    }

    @And("le prix unitaire est bien affiché")
    public void lePrixUnitaireEstBienAffiché() {
        WebElement affichagePrixUnitaire = driver.findElement(By.xpath(XpathAffichagePrixUnitaire));
        affichagePrixUnitaire.getText().contains("Price");
    }

    @And("le prix total est bien affiché")
    public void lePrixTotalEstBienAffiché() {
        WebElement affichagePrixTotal = driver.findElement(By.xpath(XpathAffichagePrixTotal));
        affichagePrixTotal.getText().contains("Price");
    }

    @And("je clique sur le bouton supprimer")
    public void jeCliqueSurLeBoutonSupprimer() {
        WebElement ClickBoutonSupprimer = driver.findElement(By.xpath(XpathBoutonSupprimerPanier));
        ClickBoutonSupprimer.click();

    }

    @Then("l'article est supprimé")
    public void lArticleEstSupprimé() {
        WebElement ArticleSupprime = driver.findElement(By.xpath(XpathArticleSupprime));
        ArticleSupprime.getText().contains("Mastering JavaScript removed. Undo?");
    }

    @And("je saisie un chiffre dans le champs quantité")
    public void jeSaisieUnChiffreDansLeChampsQuantité() {
        WebElement ArticleSupprime = driver.findElement(By.xpath(XpathQuantiteModifiable));
        ArticleSupprime.clear();
        ArticleSupprime.sendKeys("2");
    }

    @Then("la quantité de l'article est modifiée")
    public void laQuantitéDeLArticleEstModifiée() {
        WebElement ArticleSupprime = driver.findElement(By.xpath(XpathQuantiteModifiable));
        String chiffre = ArticleSupprime.getAttribute("value");
        Assert.assertEquals(chiffre,"2");

    }
}
