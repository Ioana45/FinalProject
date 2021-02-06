import org.apache.tools.ant.taskdefs.Sleep;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
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
    @Test(testName = "Search accessories label")
    public static void labelForAccesorries () {
        driver.get(Utills.BASE_URL);
        SearchPage webForm = new SearchPage(driver);
        webForm.clickOnTheAccessories();
    }

    @Test(testName = "Search a product")
    public static void searchForProduct (){
        driver.get(Utills.BASE_URL);
        SearchPage webForm = new SearchPage(driver);
        webForm.searchItemUsingButton();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webForm.populateSearchField();
        webForm.searchItemUsingButton();
    }

    @Test(testName = "Click on a product")
    public static void selectTheProduct () {
        driver.get(Utills.BASE_URL);
        SearchPage webForm = new SearchPage(driver);
        webForm.searchItemUsingButton();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webForm.populateSearchField();
        webForm.searchItemUsingButton();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webForm.accessTheProduct();

    }

    @Test(testName = "Put the product in the cart")
    public static void addTheProductInTheCart () {
        driver.get(Utills.BASE_URL);
        SearchPage webForm = new SearchPage(driver);
        webForm.searchItemUsingButton();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webForm.populateSearchField();
        webForm.searchItemUsingButton();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webForm.accessTheProduct();

       // webForm.addTheProductToTheCart();
    }

    @Test(testName = "Go pay")
    public static void clickToPay(){
        driver.get(Utills.BASE_URL);
        SearchPage webForm = new SearchPage(driver);
        webForm.accessThePathForPayment();
    }

   @Test(testName = "Login test")
    public static void loginForPayement(){

    }



}
