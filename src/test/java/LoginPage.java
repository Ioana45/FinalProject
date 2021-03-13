import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"app\"]/section/div[1]/div/header/div/div[1]/div[2]/ul/li[2]")
    private WebElement loginLabel;
    //Click pe butonul de logare
    @FindBy(xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
    private WebElement theAcceptcookies;
    //Acceptare cookie-uri

    public LoginPage(WebDriver driver) { super(driver);}
    public void selectTheLoginLabel() {this.loginLabel.click();}
    public void acceptCookies() {this.theAcceptcookies.click();}


}
