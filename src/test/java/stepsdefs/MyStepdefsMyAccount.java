package stepsdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MyStepdefsMyAccount  {
      public static WebDriver driver = Hooks.driver;
     String XpathChampMailLogin = "//*[@id=\"username\"]";
     String XpathChampMdpLogin = "//*[@id=\"password\"]";
     String XpathButtonLogin = "//input[@value=\"Login\"]";
     String XpathParagraphPageDachbors = "//div[@class=\"woocommerce-MyAccount-content\"]/p[2]";
    String XpathLienAccountDetails = "//a[text()=\"Account Details\"]";
    //*[@id="page-36"]/div/div[1]/nav/ul/li[5]/a
    String IdChampNom = "account_last_name";
    String Nom = "Piquet";
    String IdChampPrenom = "account_first_name";
    String Prenom ="Pierre";
    String IdChampEmail = "account_email";
    String Email = "testpoec2g3@yopmail.fr";

    String IdChampMdpCourant = "password_current";

    String IdChampNouveauMdp = "password_1";

    String IdChampNouveauMdpConf = "password_2";

    String XpathBoutonSauvegarderChangement = "//input[@value=\"Save changes\"]";

    String XpathNotifMdp = "//*[@id=\"page-36\"]/div/div[1]/ul/li";

    String XpathMsgErreurMdpPasIdentique = XpathNotifMdp;

    String XpathMsgErreurMdpCourant = XpathNotifMdp;

    String XpathMsgConfirmation = "//div[@class=\"woocommerce-message\"]";

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

    @Then("je v??rifie que l'??cran Dashboard est affich??")
    public void jeV??rifieQueL??cranDashboardEstAffich??() {
        WebElement ParagraphPageDashbord = driver.findElement(By.xpath(XpathParagraphPageDachbors));
        ParagraphPageDashbord.getText().contains("From your account dashboard you can view your");
    }


    @Then("Message erreur s'affiche {string}")
    public void messageErreurSAffiche(String MSG) {
        WebElement MsgErreur = driver.findElement(By.xpath(XpathMessageErreur));
        MsgErreur.getText().contains("Error: the password you entered for the username");

    }

    @Then("je v??rifie la pr??sence de lien Orders")
    public void jeV??rifieLaPr??senceDeLienOrders() {
        WebElement lienOrder = driver.findElement(By.xpath(XpathLinkOrder));
        lienOrder.getText().contains("Orders");
    }

    @And("je v??rifie la pr??sence de lien Download")
    public void jeV??rifieLaPr??senceDeLienDownload() {
        WebElement lienDownload = driver.findElement(By.xpath(XpathLinkDownloads));
        lienDownload.getText().contains("Downloads");
    }

    @And("je v??rifie la pr??sence de lien Adresses")
    public void jeV??rifieLaPr??senceDeLienAdresses() {
        WebElement lienAddress = driver.findElement(By.xpath(XpathLinkAddress));
        lienAddress.getText().contains("Addresses");
    }

    @And("je v??rifie la pr??sence de lien Account Details")
    public void jeV??rifieLaPr??senceDeLienAccountDetails() {
        WebElement lienDetail = driver.findElement(By.xpath(XpathLinkDetails));
        lienDetail.getText().contains("Addresses");
    }

    @And("je v??rifie la pr??sence de lien Logout")
    public void jeV??rifieLaPr??senceDeLienLogout() {
        WebElement lienLogout = driver.findElement(By.xpath(XpathLinkLogout));
        lienLogout.getText().contains("Logout");
    }


    @And("je clique sur le lien lougout")
    public void jeCliqueSurLeLienLougout() {
        WebElement lienLogout = driver.findElement(By.xpath(XpathLinkLogout));
        lienLogout.click();
    }

    @Then("le pav?? de login est affich??")
    public void lePav??DeLoginEstAffich??() {
        WebElement titreLogin = driver.findElement(By.xpath(XpathTitleLogin));
        titreLogin.getText().contains("Login");
    }


    @And("je clique sur le lien Account Details")
    public void jeCliqueSurLeLienAccountDetails() {
        WebElement LienAccountDetails = driver.findElement(By.xpath(XpathLienAccountDetails));
        LienAccountDetails.click();
    }

    @Then("je v??rifie que le bon nom est affich??")
    public void jeV??rifieQueLeBonNomEstAffich??() {
        WebElement  ChampNom = driver.findElement(By.id(IdChampNom));
       String NomPresent = ChampNom.getAttribute("value");
       Assert.assertEquals(NomPresent, Nom);



    }
    @And("je v??rifie que le bon pr??nom est affich??")
    public void jeV??rifieQueLeBonPr??nomEstAffich??() {
        WebElement  ChampPrenom = driver.findElement(By.id(IdChampPrenom));
        String PrenomPresent = ChampPrenom.getAttribute("value");
        Assert.assertEquals(PrenomPresent,Prenom);
    }


    @And("je v??rifie que le bon email est affich??")
    public void jeV??rifieQueLeBonEmailEstAffich??() {
       WebElement ChampEmail = driver.findElement(By.id(IdChampEmail));
       String EmailPresent = ChampEmail.getAttribute("value");
       Assert.assertEquals(EmailPresent,Email);

    }

    @And("je saisis le mot de passe dans le champ mot de passe actuel {string}")
    public void jeSaisisLeMotDePasseDansLeChampMotDePasseActuel(String ActualMdpG4) {
        WebElement ChampMdpCourant = driver.findElement(By.id(IdChampMdpCourant));
        ChampMdpCourant.sendKeys(ActualMdpG4);
    }

    @And("je saisis le nouveau mot de passe dans le champ nouveau mot de passe {string}")
    public void jeSaisisLeNouveauMotDePasseDansLeChampNouveauMotDePasse(String NewMdpG4) {
        WebElement ChampNouveauMdp = driver.findElement(By.id(IdChampNouveauMdp));
        ChampNouveauMdp.sendKeys(NewMdpG4);
    }


    @And("je saisis le nouveau mot de passe dans le champ de confirmation {string}")
    public void jeSaisisLeNouveauMotDePasseDansLeChampDeConfirmation(String NewMdpConfirm) {
        WebElement ChampNouveauMdpConf = driver.findElement(By.id(IdChampNouveauMdpConf));
        ChampNouveauMdpConf.sendKeys(NewMdpConfirm);
    }


    @And("je saisis un mauvais mot de passe dans le champ de confirmation {string}")
    public void jeSaisisUnMauvaisMotDePasseDansLeChampDeConfirmation(String WrongMdpConfirm) {
        WebElement ChampNouveauMdpConf = driver.findElement(By.id(IdChampNouveauMdpConf));
        ChampNouveauMdpConf.sendKeys(WrongMdpConfirm);
    }

    @And("je saisis un mauvais de passe dans le champ mot de passe actuel {string}")
    public void jeSaisisUnMauvaisDePasseDansLeChampMotDePasseActuel(String WrongCurrentMdp) {
        WebElement ChampMdpCourant = driver.findElement(By.id(IdChampMdpCourant));
        ChampMdpCourant.sendKeys(WrongCurrentMdp);

    }

    @And("je clique sur le bouton confirmer")
    public void jeCliqueSurLeBoutonConfirmer() {
        WebElement BtnSauvegarder = driver.findElement(By.xpath(XpathBoutonSauvegarderChangement));
        BtnSauvegarder.click();
    }

    @Then("je v??rifie le affichage du message d erreur mdp non identique {string}")
    public void jeV??rifieLeAffichageDuMessageDErreurMdpNonIdentique(String ErrorMessagePassDoNoMatch) {
         WebElement MsgErreurMdpPasIdentique = driver.findElement(By.xpath(XpathMsgErreurMdpPasIdentique));
       String MessageConfDifferent = MsgErreurMdpPasIdentique.getText();
        Assert.assertEquals(ErrorMessagePassDoNoMatch,MessageConfDifferent);
    }


    @Then("je v??rifie le affichage du message de erreur mdp courant erron?? {string}")
    public void jeV??rifieLeAffichageDuMessageDeErreurMdpCourantErron??(String ErrorMessageWrongCurrent) {
        WebElement MsgErreurMdpcourantErrone = driver.findElement(By.xpath(XpathMsgErreurMdpCourant));
        String MsgCourantErrone =  MsgErreurMdpcourantErrone.getText();
        Assert.assertEquals(ErrorMessageWrongCurrent,MsgCourantErrone);
    }

    @Then("je v??rifie le affichage du message de confirmation {string}")
    public void jeV??rifieLeAffichageDuMessageDeConfirmation(String MessageConfirmation) {
        WebElement MsgConf = driver.findElement(By.xpath(XpathMsgConfirmation));
        String MsgConfirmation = MsgConf.getText();
        Assert.assertEquals(MsgConfirmation,MessageConfirmation);

    }
}



