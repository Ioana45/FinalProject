import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class MainPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"app\"]/section/div[2]/div/header/div/div[1]/div[1]/a[2]")
    private WebElement menLabel;
    //Am accesat optiunea "Barbati"
    @FindBy(xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
    private WebElement acceptanceOfCookies;
    //Acceptare cookie-uri


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void selectTheMenOption() { this.menLabel.click(); }

    public void theCookiesElementAccept() {this.acceptanceOfCookies.click();}

}
