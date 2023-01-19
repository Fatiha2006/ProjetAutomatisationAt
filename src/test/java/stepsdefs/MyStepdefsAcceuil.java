package stepsdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStepdefsAcceuil {
    public static WebDriver driver = Hooks.driver;
    String XpathLienMyAccount = "//*[@id=\"menu-item-50\"]/a";
    String XpathPageAcceuil = "//*[@id=\"text-22-sub_row_1-0-1-1-0\"]/h2";
    String XpathChampEmail = "//input[@type=\"email\"]";
    String XpathButtonXpath = "//input[@value=\"Subscribe\"]";
    String XpathMsgNews = "//p[text()=\"Please provide a valid email address.\"]";
    @Given("j'ouvre l'application")
    public void jOuvreLApplication() {
        driver.get("https://practice.automationtesting.in/");
        driver.manage().window().maximize();
    }

    @When("je clique sur la page My Account")
    public void jeCliqueSurLaPageMyAccount() {
        WebElement lienMyAccount = driver.findElement(By.xpath(XpathLienMyAccount));
        lienMyAccount.click();
    }

    @When("je suis la page D'acceuil")
    public void jeSuisLaPageDAcceuil() {
        WebElement PageAcceuil = driver.findElement(By.xpath(XpathPageAcceuil));
        PageAcceuil.getText().contains("new arrivals");
    }

    @And("Je saisis le mail dans le champ subscribe here {string}")
    public void jeSaisisLeMailDansLeChampSubscribeHere(String Mail) {
        WebElement ChampEmail = driver.findElement(By.xpath(XpathChampEmail));
        ChampEmail.sendKeys(Mail);
    }

    @And("Je clique sur le bouton subscribe")
    public void jeCliqueSurLeBoutonSubscribe() {
        WebElement ButtonSuscribe = driver.findElement(By.xpath(XpathButtonXpath));
        ButtonSuscribe.click();
    }

    @Then("Un message d'erreur apparait {string}")
    public void unMessageDErreurApparait(String Message) {
        WebElement msgNews = driver.findElement(By.xpath(XpathMsgNews));
         Assert.assertEquals(msgNews.getText(),Message);
    }


}
