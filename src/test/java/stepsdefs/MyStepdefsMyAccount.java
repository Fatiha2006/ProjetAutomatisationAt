package stepsdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MyStepdefsMyAccount  {
      public static WebDriver driver = Hooks.driver;
     String XpathChampMailLogin = "//*[@id=\"username\"]";
     String XpathChampMdpLogin = "//*[@id=\"password\"]";
     String XpathButtonLogin = "//input[@value=\"Login\"]";
     String XpathParagraphPageDachbors = "//div[@class=\"woocommerce-MyAccount-content\"]/p[2]";

    @When("dans la page login je saisie le mail dans le champ mail  {string}")
    public void dansLaPageLoginJeSaisieLeMailDansLeChampMail(String mail) {
        WebElement input_mail_login = driver.findElement(By.xpath(XpathChampMailLogin));
        input_mail_login.sendKeys(mail);
    }
    @And("dans la page login je saisie le MDP dans le champ MDP {string}")
    public void dansLaPageLoginJeSaisieLeMDPDansLeChampMDP(String MDP) {
        WebElement input_mail_login = driver.findElement(By.xpath(XpathChampMdpLogin));
        input_mail_login.sendKeys(MDP);

    }

    @And("je clique sur le bouton LOGIN")
    public void jeCliqueSurLeBoutonLOGIN() {
        WebElement ButtonLogin = driver.findElement(By.xpath(XpathButtonLogin));
        ButtonLogin.click();
    }

    @Then("je vérifie que l'écran Dashboard est affiché")
    public void jeVérifieQueLÉcranDashboardEstAffiché() {
        WebElement ParagraphPageDashbord = driver.findElement(By.xpath(XpathParagraphPageDachbors));
        String paraph = ParagraphPageDashbord.getText();
            System.out.println(paraph);
    }



}
