import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThirdPage extends PageObject{
    @FindBy(xpath = "//*[@id=\"app\"]/section/section[1]/section/div[2]/div/div/div/div[7]/button")
    private WebElement addTOFavorites;
    @FindBy(xpath = "//*[@id=\"app\"]/section/section[1]/section/div[2]/div/div/div/div[7]/div/button")
    private WebElement addToCart;
    //Adaugare produs in cos
    @FindBy(css = "#app > section > section > div:last-of-type > div:nth-child(3) > div> div > button:last-of-type")
    private WebElement wipeTheFiltres;
    //Optiunea de stergere filtre
    @FindBy(xpath ="//*[@id=\"app\"]/section/div[4]/div[2]/div[2]/div/button")
    private WebElement forPayment;
    //Click pe butonul pentru a plati "Catre casa"
    @FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/form/div[1]/div[1]/label/input")
    private WebElement emailfield;
    @FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/form/div[1]/div[2]/label/input")
    private WebElement passwordField;
    //Dau click pe field-ul de parola pentru a putea scrie in el
    @FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/form/div[3]/button")
    private WebElement passwordValidation;
    //Am dat click pe butonul de logare pentru validarea parolei si a merge mai departe in procesul de cumparare




    public ThirdPage(WebDriver driver) {super(driver);}
    public void theFavoriteProduct() {this.addTOFavorites.click();}
    public void addTheProductToTheCart() {this.addToCart.click();}
    public void accessThePathForPayment() {this.forPayment.click();}
    public void removeTheAllFilters() {this.wipeTheFiltres.click();}
    public void clickOnEmailField() {this.emailfield.click();}
    public void emailAddress() {this.emailfield.sendKeys("ilieiana9707@gmail.com");}
    public void clickOnPasswordField() {this.passwordField.click();}
    public void writeInThePasswordField() {this.passwordField.sendKeys("ParolaAboutyou0147");}
    public void passwordValidationButton() {this.passwordValidation.click();}
}