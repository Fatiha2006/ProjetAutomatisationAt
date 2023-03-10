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
    String XpathSpanPageDetail = "//span[@class=\"posted_in\"]";

    @And("je suis bien redirig√©e vers la page shop")
    public void jeSuisBienRedirig√©eVersLaPageShop() {
        WebElement PageShop = driver.findElement(By.xpath(XpathPageShop));
        PageShop.getText().contains("shop");
    }

    @And("je clique sur le logo AT")
    public void jeCliqueSurLeLogoAT() {
       WebElement LogoAt = driver.findElement(By.xpath(XpathLogoAt));
       LogoAt.click();
    }

    @Then("je suis bien redirig√© vers la page d‚Äôaccueil")
    public void jeSuisBienRedirig√©VersLaPageDAccueil() {
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
    @Then("je suis bien redirig√© vers la page d√©tail de l'article")
    public void jeSuisBienRedirig√©VersLaPageD√©tailDeLArticle() {
        WebElement SpanPageDetail = driver.findElement(By.xpath(XpathSpanPageDetail));
        SpanPageDetail.getText().contains("Category: ");
    }

    @Then("je v√©rifi√© le titre d'un article {string}")
    public void jeV√©rifi√©LeTitreDUnArticle(String Titre1) {
        WebElement titreArticle = driver.findElement(By.xpath(XpathTitreArticle));
        Assert.assertTrue("Titre non affich√©",titreArticle.isDisplayed());

    }

    @And("je v√©rifi√© le titre d'un autre article {string}")
    public void jeV√©rifi√©LeTitreDUnAutreArticle(String Titre2) {
        WebElement titreArticle = driver.findElement(By.xpath(XpathTitreArticle2));
        Assert.assertTrue("Titre non affich√©",titreArticle.isDisplayed());
    }

    @Then("je v√©rifie la pr√©sence de button Add to basket 1")
    public void jeS√©lectionneDeBoutonAddToBascketPourAjouteUnArticle() {
        WebElement AddToBasket = driver.findElement(By.xpath(XpathAddToBasket));
        AddToBasket.isDisplayed();
    }

    @And("je v√©rifie la pr√©sence de button Add to basket 2")
    public void jeS√©lectionneUnAutreBoutonAAddToBascketPourUnAutreArticle() {
        WebElement AddToBasket = driver.findElement(By.xpath(XpathAddToBasket2));
        AddToBasket.isDisplayed();
    }

    @And("je clique sur le bouton ADD TO BASCKET")
    public void jeCliqueSurLeBoutonADDTOBASCKET() {
        WebElement AddToBasket = driver.findElement(By.xpath(XpathAddToBasket2));
        AddToBasket.click();
    }

    @Then("je V√©rifie que le lien VIEW Bascket existe <{string}>")
    public void jeV√©rifieQueLeLienVIEWBascketExiste(String arg0) {
        WebElement AddToBasket = driver.findElement(By.xpath(XpathLienViewBasket));
        AddToBasket.isDisplayed();
    }

    @And("je v√©rifie que le lien VIEW Bascket redirige vers la page panier")
    public void jeV√©rifieQueLeLienVIEWBascketRedirigeVersLaPagePanier() {
        WebElement AddToBasket = driver.findElement(By.xpath(XpathLienViewBasket));
        AddToBasket.click();
        WebElement TitreTotal = driver.findElement(By.xpath(XpathTitrePanier));
        TitreTotal.isDisplayed();
    }

    @Then("Je V√©rifie que le bouton READ MORE pour un article qui est en repture de stock")
    public void jeV√©rifieQueLeBoutonREADMOREPourUnArticleQuiEstEnReptureDeStock() {
        WebElement buttonReadMore = driver.findElement(By.xpath(XpathReadMore));
        buttonReadMore.isDisplayed();
    }

    @And("je clique sur l'√ģcone panier")
    public void jeCliqueSurL√éconePanier() {
        WebElement iconePanier = driver.findElement(By.xpath(XpathIconePanier));
        iconePanier.click();
    }

    @Then("Je V√©rifie que je suis redirig√© vers la page panier")
    public void jeV√©rifieQueJeSuisRedirig√©VersLaPagePanier() {
        WebElement TitreTotal = driver.findElement(By.xpath(XpathTitrePanier));
        TitreTotal.isDisplayed();

    }


    @And("Je clique sur la cat√©gorie")
    public void jeCliqueSurLaCat√©gorie() {
        WebElement categorieHTML = driver.findElement(By.xpath(XpathThemeHtml));
        categorieHTML.click();

    }

    @Then("Je V√©rifie le nombre d'article affich√©")
    public void jeV√©rifieLeNombreDArticleAffich√©() {
        System.out.println(driver.findElements(By.xpath(XpathArticleHTML)).size());
        int sizeElement = driver.findElements(By.xpath(XpathArticleHTML)).size();
        Assert.assertEquals(sizeElement , 3);
    }

    @Then("je v√©rifie que l'article cotient un prix")
    public void jeV√©rifieQueLArticleCotientUnPrix() {

        WebElement PrixArticle = driver.findElement(By.xpath(XpathPrixArticle));
        PrixArticle.isDisplayed();
    }

    @And("je v√©rifie que l'article contient un libille")
    public void jeV√©rifieQueLArticleContientUnLibille() {
        WebElement titleArticle = driver.findElement(By.xpath(XpathTitleArticle));
        titleArticle.isDisplayed();
    }

    @And("je clique sur le lien de l'image d'un article")
    public void jeCliqueSurLeLienDeLImageDUnArticle() {
        WebElement imgArticle = driver.findElement(By.xpath(XpathImgArticle));
        imgArticle.click();;
    }


    @And("je clique sur le libell√©")
    public void jeCliqueSurLeLibell√©() {
        WebElement libelleAricle = driver.findElement(By.xpath(XpathLibelleArticle));
        libelleAricle.click();
    }

    @Then("La fonctionnalit√© est bien pr√©sente sur la page shop")
    public void laFonctionnalit√©EstBienPr√©senteSurLaPageShop() {
        WebElement ChampEmail = driver.findElement(By.xpath(XpathChampEmail));
        WebElement ButtonSuscribe = driver.findElement(By.xpath(XpathButtonXpath));
        ChampEmail.isDisplayed();
        ButtonSuscribe.isDisplayed();
    }
}
