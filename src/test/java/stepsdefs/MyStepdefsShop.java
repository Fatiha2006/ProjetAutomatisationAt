package stepsdefs;

import com.github.dockerjava.core.dockerfile.DockerfileStatement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStepdefsShop {
    public static WebDriver driver = Hooks.driver;
   String  XpathClickPageShop = "//a[text()=\"Shop\"]";
   String  XpathPageShop = "//*[@id=\"content\"]/nav";
   String XpathLogoAt = "//*[@id=\"site-logo\"]/a/img";
   String XpathPageAcceuil = "//*[@id=\"text-22-sub_row_1-0-1-1-0\"]/h2";
   String XpathSelectionArticle = "//*[@id=\"content\"]/ul/li[4]/a[1]";
   String XpathTitreArticle = "//h3[text()=\"Functional Programming in JS\"]";
   String XpathTitreArticle2 = "//h3[text()=\"HTML5 WebApp Develpment\"]";
   String XpathAddToBasket = "//a[@data-product_id=\"165\"]";
    String XpathAddToBasket2 = "//a[@data-product_id=\"182\"]";
    String XpathLienViewBasket = "//*[@id=\"content\"]/ul/li[4]/a[3]";
    String XpathTitrePanier = "//h2";
    String XpathReadMore = "//a[@data-product_id=\"169\"]";
    String XpathIconePanier = "//a[@title=\"View your shopping cart\"]";
     String XpathThemeHtml = "//a[text()=\"HTML\"]";
     String XpathArticleHTML = "//ul[@class=\"products masonry-done\"]/li";
     String XpathTitleArticle = "//ul[@class=\"products masonry-done\"]/li/a/h3[text()=\"HTML5 Forms\"]";
     String XpathPrixArticle = "//ul[@class=\"products masonry-done\"]/li[1]/a/span[@class=\"price\"]";
     String XpathImgArticle = "//ul[@class=\"products masonry-done\"]/li[1]/a/img";
     String XpathLibelleArticle = "//ul[@class=\"products masonry-done\"]/li[1]/a/h3";
    String XpathChampEmail = "//input[@type=\"email\"]";
    String XpathButtonXpath = "//input[@value=\"Subscribe\"]";

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

    @And("je clique sur un article")
    public void jeCliqueSurUnArticle() {
        WebElement SelectionArticle = driver.findElement(By.xpath(XpathSelectionArticle));
        SelectionArticle.click();
    }

    @When("je clique la page shop")
    public void jeCliqueLaPageShop() {
        WebElement ClickPageShop = driver.findElement(By.xpath(XpathClickPageShop));
        ClickPageShop.click();

    }

    @Then("je vérifié le titre d'un article {string}")
    public void jeVérifiéLeTitreDUnArticle(String Titre1) {
        WebElement titreArticle = driver.findElement(By.xpath(XpathTitreArticle));
        Assert.assertTrue("Titre non affiché",titreArticle.isDisplayed());

    }

    @And("je vérifié le titre d'un autre article {string}")
    public void jeVérifiéLeTitreDUnAutreArticle(String Titre2) {
        WebElement titreArticle = driver.findElement(By.xpath(XpathTitreArticle2));
        Assert.assertTrue("Titre non affiché",titreArticle.isDisplayed());
    }

    @Then("je vérifie la présence de button Add to basket 1")
    public void jeSélectionneDeBoutonAddToBascketPourAjouteUnArticle() {
        WebElement AddToBasket = driver.findElement(By.xpath(XpathAddToBasket));
        AddToBasket.isDisplayed();
    }

    @And("je vérifie la présence de button Add to basket 2")
    public void jeSélectionneUnAutreBoutonAAddToBascketPourUnAutreArticle() {
        WebElement AddToBasket = driver.findElement(By.xpath(XpathAddToBasket2));
        AddToBasket.isDisplayed();
    }

    @And("je clique sur le bouton ADD TO BASCKET")
    public void jeCliqueSurLeBoutonADDTOBASCKET() {
        WebElement AddToBasket = driver.findElement(By.xpath(XpathAddToBasket2));
        AddToBasket.click();
    }

    @Then("je Vérifie que le lien VIEW Bascket existe <{string}>")
    public void jeVérifieQueLeLienVIEWBascketExiste(String arg0) {
        WebElement AddToBasket = driver.findElement(By.xpath(XpathLienViewBasket));
        AddToBasket.isDisplayed();
    }

    @And("je vérifie que le lien VIEW Bascket redirige vers la page panier")
    public void jeVérifieQueLeLienVIEWBascketRedirigeVersLaPagePanier() {
        WebElement AddToBasket = driver.findElement(By.xpath(XpathLienViewBasket));
        AddToBasket.click();
        WebElement TitreTotal = driver.findElement(By.xpath(XpathTitrePanier));
        TitreTotal.isDisplayed();
    }

    @Then("Je Vérifie que le bouton READ MORE pour un article qui est en repture de stock")
    public void jeVérifieQueLeBoutonREADMOREPourUnArticleQuiEstEnReptureDeStock() {
        WebElement buttonReadMore = driver.findElement(By.xpath(XpathReadMore));
        buttonReadMore.isDisplayed();
    }

    @And("je clique sur l'îcone panier")
    public void jeCliqueSurLÎconePanier() {
        WebElement iconePanier = driver.findElement(By.xpath(XpathIconePanier));
        iconePanier.click();
    }

    @Then("Je Vérifie que je suis redirigé vers la page panier")
    public void jeVérifieQueJeSuisRedirigéVersLaPagePanier() {
        WebElement TitreTotal = driver.findElement(By.xpath(XpathTitrePanier));
        TitreTotal.isDisplayed();

    }


    @And("Je clique sur la catégorie")
    public void jeCliqueSurLaCatégorie() {
        WebElement categorieHTML = driver.findElement(By.xpath(XpathThemeHtml));
        categorieHTML.click();

    }

    @Then("Je Vérifie le nombre d'article affiché")
    public void jeVérifieLeNombreDArticleAffiché() {
        System.out.println(driver.findElements(By.xpath(XpathArticleHTML)).size());
        int sizeElement = driver.findElements(By.xpath(XpathArticleHTML)).size();
        Assert.assertEquals(sizeElement , 3);
    }

    @Then("je vérifie que l'article cotient un prix")
    public void jeVérifieQueLArticleCotientUnPrix() {

        WebElement PrixArticle = driver.findElement(By.xpath(XpathPrixArticle));
        PrixArticle.isDisplayed();
    }

    @And("je vérifie que l'article contient un libille")
    public void jeVérifieQueLArticleContientUnLibille() {
        WebElement titleArticle = driver.findElement(By.xpath(XpathTitleArticle));
        titleArticle.isDisplayed();
    }

    @And("je clique sur le lien de l'image d'un article")
    public void jeCliqueSurLeLienDeLImageDUnArticle() {
        WebElement imgArticle = driver.findElement(By.xpath(XpathImgArticle));
        imgArticle.click();;
    }


    @And("je clique sur le libellé")
    public void jeCliqueSurLeLibellé() {
        WebElement libelleAricle = driver.findElement(By.xpath(XpathLibelleArticle));
        libelleAricle.click();
    }

    @Then("La fonctionnalité est bien présente sur la page shop")
    public void laFonctionnalitéEstBienPrésenteSurLaPageShop() {
        WebElement ChampEmail = driver.findElement(By.xpath(XpathChampEmail));
        WebElement ButtonSuscribe = driver.findElement(By.xpath(XpathButtonXpath));
        ChampEmail.isDisplayed();
        ButtonSuscribe.isDisplayed();
    }
}
