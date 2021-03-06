import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThirdPage extends PageObject{
    @FindBy(xpath = "//*[@id=\"app\"]/section/section[1]/section/div[2]/div/div/div/div[7]/div/button")
    private WebElement addToCart;
    //Adaugare produs in cos
    @FindBy(xpath ="//*[@id=\"app\"]/section/div[4]/div[2]/div[2]/div/button")
    private WebElement forPayment;
    //Click pe butonul pentru a plati "Catre casa"
    @FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/div/div/div/div[2]/div/div[2]/div/form/div[1]/div[1]/label/input")
    private WebElement emailfield;
    @FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/div/div/div/div[2]/div/div[2]/div/form/div[1]/div[2]/label/input")
    private WebElement passwordField;
    //Dau click pe field-ul de parola pentru a putea scrie in el
    @FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/div/div/div/div[2]/div/div[2]/div/form/div[3]/button")
    private WebElement passwordValidation;
    //Am dat click pe butonul de logare pentru validarea parolei si a merge mai departe in procesul de cumparare
    @FindBy(xpath = "//*[@id=\"app\"]/section/section/div[2]/div[1]/ul/li/a")
    private WebElement productSearchHeader;
    //Validare dupa cuvantul selectat "Sport" ca am ajuns pe pagina dorita
    @FindBy(xpath = "//*[@id=\"unfolding_filter_box_id_Culoare\"]")
    private WebElement theLabelForColor;
    @FindBy(xpath = "//*[@id=\"38921\"]")
    private WebElement selectTheColor;
    //Din optiunea barbati am selectat eticheta de culori iar din aceasta am ales o culoare
    @FindBy(xpath = "//*[@id=\"app\"]/section/section/div[2]/div[3]/div/section[8]/div/label/div[2]/div[2]/div/input")
    private WebElement theSwitchforsustainable;
    //Am dat click pe butonul de sustenabil
    @FindBy(xpath = "//*[@id=\"app\"]/section/section/div[2]/div[2]/div/div/div/div[2]/div/div/button/div")
    private WebElement theSortOption;
    //Click pe elementul "Sorteaza"
    @FindBy(xpath = "//*[@id=\"Sorting-item-3\"]/div")
    private WebElement newAdd;
    //Am ales optiunea de "Proaspat adaugate din elementul "Sorteaza"
    @FindBy(css = "#app .ReactVirtualized__Grid > div >div:first-of-type > a:first-of-type ")
    private WebElement product;
    //Din pagina de produse sport, am ales primul produs pentru adaugare la favorite







    public ThirdPage(WebDriver driver) {super(driver);}
    public void addTheProductToTheCart() {this.addToCart.click();}
    public void accessThePathForPayment() {this.forPayment.click();}
    public void clickOnEmailField() {this.emailfield.click();}
    public void emailAddress() {this.emailfield.sendKeys("ilieiana9707@gmail.com");}
    public void clickOnPasswordField() {this.passwordField.click();}
    public void writeInThePasswordField() {this.passwordField.sendKeys("ParolaAboutyou0147");}
    public void passwordValidationButton() {this.passwordValidation.click();}
    public String getHeaderProductPage() {  return this.productSearchHeader.getText(); }
    public void theOptionToChooseTheColor() {this.theLabelForColor.click();}
    public void selectTheWishColor() {this.selectTheColor.click();}
    public void theSustainableButton() {this.theSwitchforsustainable.click();}
    public void selectTheSortOption() {this.theSortOption.click();}
    public void fromTheSortOptionSelectNewAdd() {this.newAdd.click();}
    public void productForFavorites() {this.product.click();}


}