package stepsdefs;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStepdefsPanier {

    public static WebDriver driver = Hooks.driver;

    String XpathChampNbrArticlePanier = "//input[@class=\"input-text qty text\"]";

    @Then("je vérifie que le bon nombre de articles a été ajouté au panier")
    public void jeVérifieQueLeBonNombreDeArticlesAÉtéAjoutéAuPanier() {
        WebElement NbrArticlePanier = driver.findElement(By.xpath(XpathChampNbrArticlePanier));
       String NbArticle = NbrArticlePanier.getAttribute("value");
       System.out.printf(NbArticle);
        Assert.assertEquals(NbArticle,"5");
    }
}
