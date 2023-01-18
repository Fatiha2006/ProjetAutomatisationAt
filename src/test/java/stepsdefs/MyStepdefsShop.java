package stepsdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStepdefsShop {
    public static WebDriver driver = Hooks.driver;
   String  XpathClickPageShop = "//a[text()=\"Shop\"]";
   String  XpathPageShop = "//*[@id=\"content\"]/nav";
   String XpathLogoAt = "//*[@id=\"site-logo\"]/a/img";
   String XpathPageAcceuil = "//*[@id=\"text-22-sub_row_1-0-1-1-0\"]/h2";

    @When("je clique sur la page shop")
    public void jeCliqueSurLaPageShop() {
        WebElement ClickPageShop = driver.findElement(By.xpath(XpathClickPageShop));
        ClickPageShop.click();
    }

    @And("je suis bien redirigée vers la page shop")
    public void jeSuisBienRedirigéeVersLaPageShop() {
        WebElement PageShop = driver.findElement(By.xpath(XpathPageShop));
        PageShop.getText().contains("shop");
    }

    @And("je clique sur le logo AT")
    public void jeCliqueSurLeLogoAT() {
       WebElement LogoAt = driver.findElement(By.xpath(XpathLogoAt));
       LogoAt.click();
    }

    @Then("je suis bien redirigé vers la page d’accueil")
    public void jeSuisBienRedirigéVersLaPageDAccueil() {
        WebElement PageAcceuil = driver.findElement(By.xpath(XpathPageAcceuil));
        PageAcceuil.getText().contains("new arrivals");
    }



}
