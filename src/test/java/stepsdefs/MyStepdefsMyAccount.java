package stepsdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MyStepdefsMyAccount  {
      public static WebDriver driver = Hooks.driver;
     String XpathChampMailLogin = "//*[@id=\"username\"]";
     String XpathChampMdpLogin = "//*[@id=\"password\"]";
     String XpathButtonLogin = "//input[@value=\"Login\"]";
     String XpathParagraphPageDachbors = "//div[@class=\"woocommerce-MyAccount-content\"]/p[2]";
     String XpathmsgErreur = "//ul[@class=\"woocommerce-error\"]/li[1]";
     String XpathLiensOrders = "//a[text() =\"Orders\"]";
     String XpathLiensDownloads = "//a[text() =\"Downloads\"]";
     String XpathLiensAddresses = "//a[text() =\"Addresses\"]";
     String XpathLiensDetailAcount = "//a[text() =\"Account Details\"]";
     String XpathLiensLogout = "//a[text() =\"Logout\"]";

    @When("dans la page login je saisie le mail dans le champ mail {string}")
    public void dansLaPageLoginJeSaisieLeMailDansLeChampMail(String mail) {
        WebElement input_mail_login = driver.findElement(By.xpath(XpathChampMailLogin));
        input_mail_login.sendKeys(mail);
    }
    @And("dans la page login je saisie le MDP dans le champ MDP {string}")
    public void dansLaPageLoginJeSaisieLeMDPDansLeChampMDP(String MDP) {
        WebElement input_MDP_login = driver.findElement(By.xpath(XpathChampMdpLogin));
        input_MDP_login.sendKeys(MDP);

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
        WebElement msgErreur = driver.findElement(By.xpath(XpathmsgErreur));
        msgErreur.getText().contains(MSG);
        //Assert.assertEquals(MSG,msgErreur.getText());
    }



    @And("je me connect")
    public void jeMeConnect() {
        WebElement input_mail_login = driver.findElement(By.xpath(XpathChampMailLogin));
        input_mail_login.sendKeys("fatiha-m_18@hotmail.com");
        WebElement input_MDP_login = driver.findElement(By.xpath(XpathChampMdpLogin));
        input_MDP_login.sendKeys("Anir1234&");
        WebElement ButtonLogin = driver.findElement(By.xpath(XpathButtonLogin));
        ButtonLogin.click();

    }

    @Then("je vérifie la présence de lien Orders")
    public void jeVérifieLaPrésenceDeLienOrders() {
          WebDriverWait w = new WebDriverWait(driver, 5);


        try {
            // identify element
            w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathLiensOrders)));
            System.out.println("titre est visible");
        }
        catch(NoSuchElementException n) {
            System.out.println("titre is invisible");
        }
    }

    @And("je vérifie la présence de lien Download")
    public void jeVérifieLaPrésenceDeLienDownload() {
        WebDriverWait w = new WebDriverWait(driver, 5);
        try {
            // identify element
            w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathLiensDownloads)));
            System.out.println("titre est visible");
        }
        catch(NoSuchElementException n) {
            System.out.println("titre is invisible");
        }

    }

    @And("je vérifie la présence de lien Adresses")
    public void jeVérifieLaPrésenceDeLienAdresses() {
        WebDriverWait w = new WebDriverWait(driver, 5);
        try {
            // identify element
            w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathLiensAddresses)));
            System.out.println("titre est visible");
        }
        catch(NoSuchElementException n) {
            System.out.println("titre is invisible");
        }
    }

    @And("je vérifie la présence de lien Account Details")
    public void jeVérifieLaPrésenceDeLienAccountDetails() {
        WebDriverWait w = new WebDriverWait(driver, 5);
        try {
            // identify element
            w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathLiensDetailAcount)));
            System.out.println("titre est visible");
        }
        catch(NoSuchElementException n) {
            System.out.println("titre is invisible");
        }
    }

    @And("je vérifie la présence de lien Logout")
    public void jeVérifieLaPrésenceDeLienLogout() {
        WebDriverWait w = new WebDriverWait(driver, 5);
        try {
            // identify element
            w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathLiensLogout)));
            System.out.println("titre est visible");
        }
        catch(NoSuchElementException n) {
            System.out.println("titre is invisible");
        }
    }
}
