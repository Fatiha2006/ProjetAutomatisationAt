package stepsdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MuStepdefsPanier {
    public static WebDriver driver = Hooks.driver;
    String XpathClickPanier = "//*[@id=\"wpmenucartli\"]/a/span[1]";
    String XpathPagePanier = "//*[@id=\"content\"]/nav";
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
}
