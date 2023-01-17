package stepsdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStepdefsFicheProduit {
    public static WebDriver driver = Hooks.driver;

    String XpathBoutonAjouterAuPanier = " //*[@id=\"product-182\"]/div[2]/form/button";
    String XpathTexteDeConfirmationAjoutPanier="/html/body/div[1]/div[2]/div/div/div[1]/text()";

    String XpathBoutonAjoutPanier = "//*[@id=\"content\"]/div[1]/a ";

    @And("je clique sur le bouton ajouter au panier")
    public void jeCliqueSurLeBoutonAjouterAuPanier() {
        WebElement BoutonAjoutPanier = driver.findElement(By.xpath(XpathBoutonAjouterAuPanier));
        BoutonAjoutPanier.click();

    }



    @Then("je suis notifié de le ajout de mon article au panier {string}")
    public void jeSuisNotifiéDeLeAjoutDeMonArticleAuPanier(String Notification) {
        WebElement TexteConfirmationAjout = driver.findElement(By.xpath(XpathTexteDeConfirmationAjoutPanier));
        TexteConfirmationAjout.getText().contains(Notification);

    }


    @And("je vérifie la présence du bouton ajouter au panier")
    public void jeVérifieLaPrésenceDuBoutonAjouterAuPanier() {
      Boolean BtnAjoutPanier = driver.findElement(By.xpath(XpathBoutonAjoutPanier)).isDisplayed();



    }
}

