import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"app\"]/section/div[2]/div/header/div/div[1]/div[2]/ul/li[2]")
    private WebElement loginLabel;
    //Click pe butonul de logare
    @FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/div/div/div/div[1]/div/div[1]/div[1]")
    private WebElement logareChoice;
    //Am ales optiunea logare si nu inregistreaza-te
    @FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/div/div/div/div[1]/div/div[2]/form/div[3]/label/input")
    private WebElement passwordField;
    //Dau click pe field-ul de parola pentru a putea scrie in el
    @FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/div/div/div/div[1]/div/div[2]/form/div[3]/label/input")
    private WebElement loginWithPassword;
    //Am selectat field-ul de parola
    @FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/div/div/div/div[1]/div/div[2]/form/button")
    private WebElement passwordValidation;
    //Am dat click pe butonul de logare pentru validarea parolei si a merge mai departe in procesul de cumparare
    @FindBy(xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
    private WebElement theAcceptcookies;
    //Acceptare cookie-uri

    public LoginPage(WebDriver driver) { super(driver);}
    public void selectTheLoginLabel() {this.loginLabel.click();}
    public void selectTheLoginOption() {this.logareChoice.click();}
    public void clickOnPasswordField() {this.passwordField.click();}
    public void writeInThePasswordField() {this.loginWithPassword.sendKeys("ParolaAboutyou0147");}
    public void passwordValidationButton() {this.passwordValidation.click();}
    public void acceptCookies() {this.theAcceptcookies.click();}


}
