package stepsdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStepdefsFicheProduit {
    public static WebDriver driver = Hooks.driver;

    String XpathBoutonAjouterAuPanier = " //*[@id=\"product-182\"]/div[2]/form/button";
    String XpathTexteDeConfirmationAjoutPanier= "//*[@id=\"content\"]/div[1]";

    String XpathBoutonAjoutPanier = "//*[@id=\"content\"]/div[1]/a";
    String XpathSpanPageDetail = "//span[@class=\"posted_in\"]";

    @And("je clique sur le bouton ajouter au panier")
    public void jeCliqueSurLeBoutonAjouterAuPanier() {
        WebElement BoutonAjoutPanier = driver.findElement(By.xpath(XpathBoutonAjouterAuPanier));
        BoutonAjoutPanier.click();

    }

    @And("je vérifie la présence du bouton ajouter au panier")
    public void jeVérifieLaPrésenceDuBoutonAjouterAuPanier() {
        WebElement BoutonAjoutPanier = driver.findElement(By.xpath(XpathBoutonAjoutPanier));
        BoutonAjoutPanier.isDisplayed();
    }

    @Then("je suis notifié de le ajout de mon article au panier")
    public void jeSuisNotifiéDeLeAjoutDeMonArticleAuPanier() {
        WebElement TexteConfirmationAjout = driver.findElement(By.xpath(XpathTexteDeConfirmationAjoutPanier));
        TexteConfirmationAjout.getText().contains("HTML5 WebApp Develpment");

    }


    @Then("je suis bien redirigé vers la page détail de l'article")
    public void jeSuisBienRedirigéVersLaPageDétailDeLArticle() {
        WebElement SpanPageDetail = driver.findElement(By.xpath(XpathSpanPageDetail));
        SpanPageDetail.getText().contains("Category: ");
    }
}

