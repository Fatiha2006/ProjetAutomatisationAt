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
     String XpathMessageErreur = "//*[@id=\"page-36\"]/div/div[1]/ul/li";
     String XpathLinkOrder = "//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[2]/a";
     String XpathLinkDownloads = "//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[3]/a";
     String XpathLinkAddress = "//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[4]/a";
    String XpathLinkDetails = "//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[5]/a";
    String XpathLinkLogout = "//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a";
    String XpathTitleLogin = "//h2[text()=\"Login\"]";


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


    @Then("Message erreur s'affiche {string}")
    public void messageErreurSAffiche(String MSG) {
        WebElement MsgErreur = driver.findElement(By.xpath(XpathMessageErreur));
        MsgErreur.getText().contains("Error: the password you entered for the username");

    }

    @Then("je vérifie la présence de lien Orders")
    public void jeVérifieLaPrésenceDeLienOrders() {
        WebElement lienOrder = driver.findElement(By.xpath(XpathLinkOrder));
        lienOrder.getText().contains("Orders");
    }

    @And("je vérifie la présence de lien Download")
    public void jeVérifieLaPrésenceDeLienDownload() {
        WebElement lienDownload = driver.findElement(By.xpath(XpathLinkDownloads));
        lienDownload.getText().contains("Downloads");
    }

    @And("je vérifie la présence de lien Adresses")
    public void jeVérifieLaPrésenceDeLienAdresses() {
        WebElement lienAddress = driver.findElement(By.xpath(XpathLinkAddress));
        lienAddress.getText().contains("Addresses");
    }

    @And("je vérifie la présence de lien Account Details")
    public void jeVérifieLaPrésenceDeLienAccountDetails() {
        WebElement lienDetail = driver.findElement(By.xpath(XpathLinkDetails));
        lienDetail.getText().contains("Addresses");
    }

    @And("je vérifie la présence de lien Logout")
    public void jeVérifieLaPrésenceDeLienLogout() {
        WebElement lienLogout = driver.findElement(By.xpath(XpathLinkLogout));
        lienLogout.getText().contains("Logout");
    }


    @And("je clique sur le lien lougout")
    public void jeCliqueSurLeLienLougout() {
        WebElement lienLogout = driver.findElement(By.xpath(XpathLinkLogout));
        lienLogout.click();
    }

    @Then("le pavé de login est affiché")
    public void lePavéDeLoginEstAffiché() {
        WebElement titreLogin = driver.findElement(By.xpath(XpathTitleLogin));
        titreLogin.getText().contains("Login");
    }
}
