import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class SearchPage extends PageObject {
    private final String SEARCH_STRING = "ceas";
    private final String Search_Second_Product = "hanorac";

    @FindBy(xpath = "//*[@id=\"app\"]/section/div[2]/div/header/div/div[2]/ul/li[6]/a")
    private WebElement AccessoriesOption;
    //Am accesat elementul accesorii
    @FindBy(xpath = "//*[@id=\"app\"]/section/div[2]/div/header/div/div[1]/div[2]/ul/li[1]/div/form/input")
    private WebElement searchField;
    //Am accesat field-ul de cautare si voi folosi cuvantul "ceas"
    @FindBy(xpath = "//*[@id=\"app\"]/section/div[2]/div/header/div/div[1]/div[3]/ul/li[1]/div/form/input")
    private WebElement searchSecondProduct;
    //Am accesat field-ul de cautare produs cu un nou produs "hanorac"
    @FindBy(xpath = "//*[@id=\"app\"]/section/div[2]/div/header/div/div[1]/div[2]/ul/li[1]/div/form/button")
    private WebElement searchButton;
    //Am dat click pe butonul de cautate
    //@FindBy(xpath = "//*[@id=\"5567153\"]")
    @FindBy(css = ".ReactVirtualized__Grid__innerScrollContainer div:first-child a:nth-child(1)")
    private WebElement ProductChoice;
    //Am selectat produsul dorit
    @FindBy(xpath = "//*[@id=\"app\"]/section/section[1]/section/div[2]/div/div/div/div[6]/div/button")
    private WebElement addToCart;
    //Adaugare produs in cos
    @FindBy(xpath ="//*[@id=\"app\"]/section/div[3]/div[2]/div[2]/div/button")
    private WebElement forPayment;
    //Click pe butonul pentru a plati "Catre casa"
    @FindBy(xpath = "//*[@id=\"modal-root\"]/div[3]/div/div/div/div/div[1]/div/div[1]/div[1]")
    private WebElement LogareChoice;
    //Am ales optiunea logare si nu inregistreaza-te
    @FindBy(xpath = "//*[@id=\"modal-root\"]/div[3]/div/div/div/div/div[1]/div/div[2]/form/div[3]/label/input")
    private WebElement fieldPassword;
    //Am selectat field-ul de parola
    @FindBy(xpath = "//*[@id=\"modal-root\"]/div[3]/div/div/div/div/div[1]/div/div[2]/form/button")
    private WebElement passwordValidation;
    //Am dat click pe butonul de logare pentru validarea parolei si a merge mai departe in procesul de cumparare

    public SearchPage(WebDriver driver) { super(driver);}
    public void clickOnTheAccessories() {this.AccessoriesOption.click();}
    public void populateSearchField() {this.searchField.sendKeys(SEARCH_STRING);}
    public void searchOtherProduct() {this.searchSecondProduct.sendKeys(Search_Second_Product);}
    public void searchItemUsingButton() {this.searchButton.click();}
    public void accessTheProduct() {this.ProductChoice.click();}
    public void addTheProductToTheCart() {this.addToCart.click();}
    public void accessThePathForPayment() {this.forPayment.click();}
    public void selectTheLoginOption() {this.LogareChoice.click();}
    public void loginWithPassword() {this.fieldPassword.sendKeys("ParolaAboutyou0147");}
    public void passwordValidationButton() {this.passwordValidation.click();}
}
