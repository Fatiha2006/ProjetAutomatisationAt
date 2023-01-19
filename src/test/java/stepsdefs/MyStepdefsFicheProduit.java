package stepsdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MyStepdefsFicheProduit {
    public static WebDriver driver = Hooks.driver;

    String XpathBoutonAjouterAuPanier = " //*[@id=\"product-182\"]/div[2]/form/button";
    String XpathTexteDeConfirmationAjoutPanier= "//*[@id=\"content\"]/div[1]";

    String XpathBoutonAjoutPanier = "//*[@id=\"content\"]/div[1]/a";

     String XpathNbrArticles="//input[@class='input-text qty text']";

    String XpathDescriptionProduit = "//*[@id=\"product-182\"]/div[2]/div[2]/p";

    String XpathNbrArticlesRestant = "//*[@id=\"product-182\"]/div[2]/p";

    String XpathPrixFicheProduit = "//*[@id=\"product-182\"]/div[2]/div[1]/p/span";

    String XpathLienVoirPanier = "//*[@id=\"wpmenucartli\"]/a";

    String XpathImageProduit = "//*[@id=\"product-182\"]/div[1]/a/img";


    @And("je tape le nombre de articles souhaités dans le champ de selection du nombre de article")
    public void jeTapeLeNombreDeArticlesSouhaitésDansLeChampDeSelectionDuNombreDeArticle() {

        WebElement NbrArticlesSouhaites = driver.findElement(By.xpath(XpathNbrArticles));
        NbrArticlesSouhaites.clear();
        NbrArticlesSouhaites.sendKeys("5");
    }

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


    @And("le détail descriptif est affiché")
    public void leDétailDescriptifEstAffiché() {
      WebElement  Description = driver.findElement(By.xpath(XpathDescriptionProduit));
      Description.getText().equals("The time to start using HTML5 is now. HTML5 provides a complete application development framework for writing full featured applications that run in the web browser.");

    }

    @And("le prix est affiché")
    public void lePrixEstAffiché() {
        WebElement  Prix = driver.findElement(By.xpath(XpathPrixFicheProduit));

        String  PrixAffiche =  Prix.getText();
       String  PrixAttendu = "₹180.00";
       PrixAttendu.contains(PrixAffiche);
    }
    @And("le nombre de articles restants est affiché")
    public void leNombreDeArticlesRestantsEstAffiché() {
        WebElement  NbrRestants = driver.findElement(By.xpath(XpathNbrArticlesRestant));
       String Nbr = NbrRestants.getText();
        Nbr.equals(NbrRestants);

    }


    @Then("je suis notifié de le ajout de mon article au panier")
    public void jeSuisNotifiéDeLeAjoutDeMonArticleAuPanier() {
        WebElement TexteConfirmationAjout = driver.findElement(By.xpath(XpathTexteDeConfirmationAjoutPanier));
        TexteConfirmationAjout.getText().contains("HTML5 WebApp Develpment");
    }


    @And("Je clique sur le lien voir mon panier")
    public void jeCliqueSurLeLienVoirMonPanier() {
       WebElement LienPanier = driver.findElement(By.xpath(XpathLienVoirPanier));
        LienPanier.click();
    }


    @Then("la photo de le article est affiché")
    public void laPhotoDeLeArticleEstAffiché() throws IOException {
        WebElement Img = driver.findElement(By.xpath(XpathImageProduit));
        String ImgUrl = Img.getAttribute("src");
        URL Url = new URL(ImgUrl);
        HttpURLConnection httpConnection = (HttpURLConnection)Url.openConnection();
        int CodeReponse = httpConnection.getResponseCode();
        if(CodeReponse == 200) {
            System.out.println("L'image est accessible");
        } else {
            System.out.println("L'image n'est pas accessible");
        }
    }
}

