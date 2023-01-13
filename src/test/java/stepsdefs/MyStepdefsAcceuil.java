package stepsdefs;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStepdefsAcceuil {
    public static WebDriver driver = Hooks.driver;
    String XpathLienMyAccount = "//*[@id=\"menu-item-50\"]/a";

    @Given("je clique sur la page My Account")
    public void jeCliqueSurLaPageMyAccount() {
        driver.get("https://practice.automationtesting.in/");
        driver.manage().window().maximize();
        WebElement lienMyAccount = driver.findElement(By.xpath(XpathLienMyAccount));
        lienMyAccount.click();
    }
}