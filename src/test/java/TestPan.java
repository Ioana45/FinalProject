import jdk.jshell.execution.Util;
import org.apache.tools.ant.Main;
import org.apache.tools.ant.taskdefs.Sleep;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utills.CHROME_DRIVER_LOCATION);
    }
//Testing for the Main Page

    @Test(testName = "Select the men option")
    public static void theMenOption () {
        driver.get(Utills.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.selectTheMenOption();
    }

    @Test(testName = "From men select the sport option")
    public static void theLabelForSportsArticles (){
        driver.get(Utills.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.theCookiesElementAccept();
        Utills.WaitForElement(2);
        webForm.selectTheMenOption();
        Utills.WaitForElement(1);
        webForm.accessSportsArticles();
    }
    @Test(testName = "Select after the color")
    public static void colorChoice () {
        driver.get(Utills.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.theCookiesElementAccept();
        Utills.WaitForElement(2);
        webForm.selectTheMenOption();
        Utills.WaitForElement(1);
        webForm.accessSportsArticles();
        Utills.WaitForElement(1);
       // webForm.theOptionToChooseTheColor();
       // webForm.selectTheWishColor();
    }
    @Test(testName = "Switch button for sustainable")
    public static void selectTheSustainableChoice() {
        driver.get(Utills.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.theCookiesElementAccept();
        Utills.WaitForElement(2);
        webForm.selectTheMenOption();
        Utills.WaitForElement(1);
        webForm.accessSportsArticles();
        Utills.WaitForElement(1);
        //webForm.theSustainableButton();
        Utills.WaitForElement(1);
       // webForm.removeTheAllfilters();
    }
    @Test(testName = "Choice of new products from the sorting option ")
    public static void theSortChoice() {
        driver.get(Utills.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.theCookiesElementAccept();
        Utills.WaitForElement(2);
        webForm.selectTheMenOption();
        Utills.WaitForElement(1);
        webForm.accessSportsArticles();
        Utills.WaitForElement(1);
       // webForm.selectTheSortOption();
      //  webForm.fromTheSortOptionSelectNewAdd();

    }
    @Test(testName = "Add a produs in the favorites list")
    public static void selectFavoriteProduct() {
        driver.get(Utills.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.theCookiesElementAccept();
        Utills.WaitForElement(2);
        webForm.selectTheMenOption();
        Utills.WaitForElement(1);
        webForm.accessSportsArticles();
        Utills.WaitForElement(2);
      //  webForm.selectTheFavoritesOption();

    }



    //Testing for page search product
    @Test(testName = "Search a product")
    public static void searchForProduct (){
        driver.get(Utills.BASE_URL);
        SearchPage webForm = new SearchPage(driver);
        webForm.searchItemUsingButton();
        Utills.WaitForElement(1);
        webForm.populateSearchField();
        webForm.searchItemUsingButton();
    }

    @Test(testName = "Click on a product")
    public static void selectTheProduct () {
        driver.get(Utills.BASE_URL);
        SearchPage webForm = new SearchPage(driver);
        webForm.okForCookies();
        webForm.searchItemUsingButton();
        Utills.WaitForElement(1);
        webForm.populateSearchField();
        webForm.searchItemUsingButton();
        Utills.WaitForElement(1);
       //webForm.accessTheProduct();

    }

    @Test(testName = "Put the product in the cart")
    public static void addTheProductInTheCart () {
        driver.get(Utills.BASE_URL);
        SearchPage webForm = new SearchPage(driver);
        webForm.okForCookies();
        webForm.searchItemUsingButton();
        Utills.WaitForElement(1);
        webForm.populateSearchField();
        webForm.searchItemUsingButton();
        Utills.WaitForElement(1);
        //webForm.accessTheProduct();
        Utills.WaitForElement(3);
        webForm.addTheProductToTheCart();
    }

    @Test(testName = "Go pay")
    public static void clickToPay(){
        driver.get(Utills.BASE_URL);
        SearchPage webForm = new SearchPage(driver);
        webForm.okForCookies();
        webForm.searchItemUsingButton();
        Utills.WaitForElement(1);
        webForm.populateSearchField();
        webForm.searchItemUsingButton();
        Utills.WaitForElement(1);
        //webForm.accessTheProduct();
        Utills.WaitForElement(3);
        webForm.addTheProductToTheCart();
        Utills.WaitForElement(2);
        webForm.accessThePathForPayment();
    }

    // Testing the login option

   @Test(testName = "Login test")
    public static void loginForPayment(){
        driver.get(Utills.BASE_URL);
        LoginPage webForm = new LoginPage(driver);
        webForm.selectTheLoginLabel();
    }

    @Test(testName = "Select the login option")
    public static void theOptionLogin(){
        driver.get(Utills.BASE_URL);
        LoginPage webForm = new LoginPage(driver);
        webForm.selectTheLoginLabel();
        //Utills.WaitForElement(1);
        webForm.selectTheLoginOption();
    }

    @Test(testName = "Select a product from list")
    public static void selectProductFromList() {
        driver.get(Utills.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.selectTheMenOption();
        Utills.WaitForElement(3);
        webForm.accessSportsArticles();
        Utills.WaitForElement(3);
        SecondPage secondWebForm = new SecondPage(driver);
        secondWebForm.productForFavorites();
    }

    @AfterSuite
    public static void cleanUP() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

}
