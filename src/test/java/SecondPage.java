import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage extends PageObject{
    @FindBy(xpath = "//*[@id=\"app\"]/section/div[1]/div/header/div/div[2]/ul/li[5]/a")
    private WebElement sportsArticles;
    //Am accesat elementul de articole sport
    @FindBy(xpath = "//*[@id=\"app\"]/section/section/div[2]/div[3]/div/section[8]/div/label/div[2]/div[2]/div/input")
    private WebElement theSwitchforsustainable;
    //Am dat click pe butonul de sustenabil
    @FindBy(xpath = "//*[@id=\"app\"]/section/section/div[2]/div[2]/div/div/div/div[2]/div/div/button/div")
    private WebElement theSortOption;
    //Click pe elementul "Sorteaza"
    @FindBy(xpath = "//*[@id=\"Sorting-item-3\"]/div")
    private WebElement newAdd;
    //Am ales optiunea de "Proaspat adaugate din elementul "Sorteaza"
    @FindBy(css = ".ReactVirtualized__Grid__innerScrollContainer div:first-child a:nth-child(1)")
    private WebElement ProductChoice;
    //Am selectat produsul dorit
    @FindBy(css = "#app .ReactVirtualized__Grid > div >div:first-of-type > a:first-of-type ")
    private WebElement product;
    //Din pagina de produse sport, am ales primul produs pentru adaugare la favorite
    @FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/div/div/div/div[2]/div/div[1]/div[1]")
    private WebElement logareChoice;
    //Am ales optiunea logare si nu inregistreaza-te


    public SecondPage(WebDriver driver) { super(driver);}
    public void accessSportsArticles() {
        this.sportsArticles.click();
    }
    public void theSustainableButton() {this.theSwitchforsustainable.click();}
    public void selectTheSortOption() {this.theSortOption.click();}
    public void fromTheSortOptionSelectNewAdd() {this.newAdd.click();}
    public void accessTheProduct() {this.ProductChoice.click();}
    public void productForFavorites() {this.product.click();}
    public void selectTheLoginOption() {this.logareChoice.click();}


}
