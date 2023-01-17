package stepsdefs;

import cucumber.api.java.en.And;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MyStepdefsLostPassword {

    String XpathChampMailReinitMdp = "//*[@id=\"user_login\"]";
    String XpathBoutonEnvoiMailReinit = "//*[@id=\"page-36\"]/div/div[1]/form/p[3]/input[2]";

    String XpathMessageConirmationEnvoiMailReinit = "//*[@id=\"page-36\"]/div/div[1]/p";

    public static WebDriver driver = Hooks.driver;
    @And("je saisis mon login et je clique sur valider {string}")
    public void jeSaisisMonLoginEtJeCliqueSurValider(String LoginReinit) {
        WebElement ChampMailReinitMdp = driver.findElement(By.xpath(XpathChampMailReinitMdp));
        ChampMailReinitMdp.sendKeys(LoginReinit);

        WebElement BoutonEnvoiReinitMail = driver.findElement(By.xpath(XpathBoutonEnvoiMailReinit));
        BoutonEnvoiReinitMail.click();

    }

    @And("Je vérifie l'affichage du message de confirmation")
    public void jeVérifieLAffichageDuMessageDeConfirmation() {
        WebElement MessageConfirmMailReinit = driver.findElement(By.xpath(XpathMessageConirmationEnvoiMailReinit));
        MessageConfirmMailReinit.getText().contains("A password reset email has been sent to the email address on file for your account, but may take several minutes to show up in your inbox. Please wait at least 10 minutes before attempting another reset.");

        //ExpectedMsg.contains("A password reset email has been sent to the email address on file for your account, but may take several minutes to show up in your inbox. Please wait at least 10 minutes before attempting another reset.");
        //String expectedMsg1 = MessageConfirmMailReinit.getText();
        // Assert.assertTrue("le message ne s'affiche pas" ,expectedMsg1.contains("jfhjd") );


    }
}
