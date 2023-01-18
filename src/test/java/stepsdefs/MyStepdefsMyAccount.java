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

     String XpathClickPageMyAccount = "//*[@id=\"menu-item-50\"]/a";

     String XpathPageMyAccount = "//*[@id=\"customer_login\"]/div[1]/h2";
     String XpathLogout = "//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a";
     String XpathParagrapheLogin = "//*[@id=\"customer_login\"]/div[1]/h2";
     String XpathParagrapheRegister = "//*[@id=\"customer_login\"]/div[2]/h2";

    @When("dans la page login je saisie le mail dans le champ mail {string}")
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
        ParagraphPageDashbord.getText().contains("From your account dashboard you can view your");
    }


    @When("je clique sur la page  My Account")
    public void jeCliqueSurLaPageMyAccount() {
        WebElement ClickPageMyAccount = driver.findElement(By.xpath(XpathClickPageMyAccount));
        ClickPageMyAccount.click();

    }

    @And("je suis bien redirigée vers la My Account")
    public void jeSuisBienRedirigéeVersLaMyAccount() {
        WebElement PageMyAccount = driver.findElement(By.xpath(XpathPageMyAccount));
        PageMyAccount.getText().contains("Login");
    }

    @And("je clique sur le lien lougout")
    public void jeCliqueSurLeLienLougout() {
        WebElement BoutonLogout = driver.findElement(By.xpath(XpathLogout));
        BoutonLogout.click();
    }

    @Then("le pavé de login est affiché")
    public void lePavéDeLoginEstAffiché() {
        WebElement PaveLogin = driver.findElement(By.xpath(XpathParagrapheLogin));
        PaveLogin.getText().contains("Login");
    }

    @And("le pavé de Register est affiché")
    public void lePavéDeRegisterEstAffiché() {
        WebElement PaveRegister = driver.findElement(By.xpath(XpathParagrapheRegister));
        PaveRegister.getText().contains("Register");
    }
    }


