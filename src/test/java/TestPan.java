import jdk.jshell.execution.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestPan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utills.CHROME_DRIVER_LOCATION);
    }

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
        SecondPage secondWebForm = new SecondPage(driver);
        secondWebForm.accessSportsArticles();
        Utills.WaitForElement(3);
        ThirdPage thirdPage = new ThirdPage(driver);
        Assert.assertEquals(thirdPage.getHeaderProductPage(), "Haine sport");
    }
    @Test(testName = "Select after the color")
    public static void colorChoice () {
        driver.get(Utills.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.theCookiesElementAccept();
        Utills.WaitForElement(2);
        webForm.selectTheMenOption();
        Utills.WaitForElement(1);
        SecondPage secondWebForm = new SecondPage(driver);
        secondWebForm.accessSportsArticles();
        Utills.WaitForElement(3);
        ThirdPage thirdWebForm = new ThirdPage(driver);
        thirdWebForm.theOptionToChooseTheColor();
        thirdWebForm.selectTheWishColor();
    }

    @Test(testName = "Switch button for sustainable")
    public static void selectTheSustainableChoice() {
        driver.get(Utills.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.theCookiesElementAccept();
        Utills.WaitForElement(2);
        webForm.selectTheMenOption();
        Utills.WaitForElement(1);
        SecondPage secondWebForm = new SecondPage(driver);
        secondWebForm.accessSportsArticles();
        Utills.WaitForElement(3);
        ThirdPage thirdWebForm = new ThirdPage(driver);
        thirdWebForm.theSustainableButton();
    }
    @Test(testName = "Choice of new products from the sorting option ")
    public static void theSortChoice() {
        driver.get(Utills.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.theCookiesElementAccept();
        Utills.WaitForElement(2);
        webForm.selectTheMenOption();
        Utills.WaitForElement(1);
        SecondPage secondWebForm = new SecondPage(driver);
        secondWebForm.accessSportsArticles();
        Utills.WaitForElement(3);
        ThirdPage thirdWebForm = new ThirdPage(driver);
        thirdWebForm.selectTheSortOption();
        Utills.WaitForElement(1);
        thirdWebForm.fromTheSortOptionSelectNewAdd();

    }

    @Test(testName = "Add a produs in the favorites list")
    public static void selectFavoriteProduct() {
        driver.get(Utills.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.theCookiesElementAccept();
        Utills.WaitForElement(2);
        webForm.selectTheMenOption();
        Utills.WaitForElement(1);
        SecondPage secondWebForm = new SecondPage(driver);
        secondWebForm.accessSportsArticles();
        Utills.WaitForElement(3);
        ThirdPage thirdWebPage = new ThirdPage(driver);
        thirdWebPage.productForFavorites();
        Utills.WaitForElement(3);
        FourthPage fourthdWebPage = new FourthPage(driver);
        fourthdWebPage.theFavoriteProduct();
    }

    @Test(testName = "Search a product")
    public static void searchForProduct (){
        driver.get(Utills.BASE_URL);
        SearchPage webForm = new SearchPage(driver);
        webForm.okForCookies();
        Utills.WaitForElement(2);
        webForm.searchItemUsingButton();
        Utills.WaitForElement(3);
        webForm.populateSearchField();
        webForm.searchItemUsingButton();
    }

    @Test(testName = "Click on a product")
    public static void selectTheProduct () {
        driver.get(Utills.BASE_URL);
        SearchPage webForm = new SearchPage(driver);
        webForm.okForCookies();
        Utills.WaitForElement(3);
        webForm.searchItemUsingButton();
        Utills.WaitForElement(2);
        webForm.populateSearchField();
        Utills.WaitForElement(1);
        webForm.searchItemUsingButton();
        Utills.WaitForElement(1);
        SecondPage secondWebPage = new SecondPage(driver);
        secondWebPage.accessTheProduct();


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
        SecondPage secondWebPage = new SecondPage(driver);
        secondWebPage.accessTheProduct();
        ThirdPage thirdWebPage = new ThirdPage(driver);
        Utills.WaitForElement(2);
        thirdWebPage.addTheProductToTheCart();


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
        Utills.WaitForElement(3);
        SecondPage secondWebPage = new SecondPage(driver);
        secondWebPage.accessTheProduct();
        Utills.WaitForElement(2);
        ThirdPage thirdWebPage = new ThirdPage(driver);
        thirdWebPage.addTheProductToTheCart();
        Utills.WaitForElement(3);
        thirdWebPage.accessThePathForPayment();

    }


   @Test(testName = "Login test")
    public static void loginForPayment(){
        driver.get(Utills.BASE_URL);
        LoginPage webForm = new LoginPage(driver);
        webForm.acceptCookies();
        Utills.WaitForElement(2);
        webForm.selectTheLoginLabel();
    }

    @Test(testName = "Select the login option")
    public static void theOptionLogin(){
        driver.get(Utills.BASE_URL);
        LoginPage webForm = new LoginPage(driver);
        webForm.selectTheLoginLabel();
        Utills.WaitForElement(2);
        SecondPage secondWebForm = new SecondPage(driver);
        secondWebForm.selectTheLoginOption();
    }
    @Test(testName = "Login with email and password")
    public static void loginWithEmailAndPassword(){
        driver.get(Utills.BASE_URL);
        LoginPage webForm = new LoginPage(driver);
        webForm.selectTheLoginLabel();
        Utills.WaitForElement(2);
        SecondPage secondWebForm = new SecondPage(driver);
        secondWebForm.selectTheLoginOption();
        ThirdPage thirdWebForm = new ThirdPage(driver);
        thirdWebForm.clickOnEmailField();
        Utills.WaitForElement(1);
        thirdWebForm.emailAddress();
        Utills.WaitForElement(2);
        thirdWebForm.clickOnPasswordField();
        Utills.WaitForElement(1);
        thirdWebForm.writeInThePasswordField();
        Utills.WaitForElement(2);
        thirdWebForm.passwordValidationButton();

    }


    @AfterSuite
    public static void cleanUP() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

}
