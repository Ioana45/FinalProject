import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class MainPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"app\"]/section/div[2]/div/header/div/div[1]/div[1]/a[2]/span")
    private WebElement menLabel;
    //Am accesat optiunea "Barbati"
    @FindBy(xpath = "//*[@id=\"app\"]/section/div[2]/div/header/div/div[2]/ul/li[5]/a")
    private WebElement sportsArticles;
    //Am accesat elementul de articole sport
   /* @FindBy(xpath = "//*[@id=\"unfolding_filter_box_id_Culoare\"]")
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
    @FindBy(xpath = "//*[@id=\"app\"]/section/section/div[2]/div[3]/div/div/button[2]")
    private WebElement wipeTheFiltres;*/
    //Optiunea de stergere filtre
    // @FindBy(css = "#app .ReactVirtualized__Grid > div >div:first-of-type > a:first-of-type > button")
    // private WebElement addTOFavorites;
   // @FindBy(css = "#app .ReactVirtualized__Grid > div >div:first-of-type > a:first-of-type ")
    //private WebElement product;
    //Selectare element de adaugare produs in lista de favorite
   /* @FindBy(xpath = "//*[@id=\"app\"]/section/section/div[2]/div[1]/div/div/div/div[2]/button")
    private WebElement filterElement;
    //Am accesat filtru
    @FindBy(xpath = "//*[@id=\"app\"]/section/div[6]/div[2]/div[2]/div[2]/ul/li/label/div/div[2]/div")
    private WebElement theSwitchForDiscounts;
    //Din elementul filtru am dat click pe Switch-ul pentru articolele reduse*/
    @FindBy(xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
    private WebElement acceptanceOfCookies;
    //Acceptare cookie-ui


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void selectTheMenOption() {
        this.menLabel.click();
    }

    public void accessSportsArticles() {
        this.sportsArticles.click();
    }
    /*public void theOptionToChooseTheColor() {this.theLabelForColor.click();}
    public void selectTheWishColor() {this.selectTheColor.click();}
    public void theSustainableButton() {this.theSwitchforsustainable.click();}
    public void selectTheSortOption() {this.theSortOption.click();}
    public void fromTheSortOptionSelectNewAdd() {this.newAdd.click();}
    public void removeTheAllfilters() {this.wipeTheFiltres.click();}*/
    /*public void selectTheStyleButton() {this.yourStyle.click();}
    public void freshlyAddedFromStyleItem() {this.newAdd.click();}
    public void clickOnFilterButton() {this.filterElement.click();}
    public void activatesTheSwitchForDiscounts() {this.theSwitchForDiscounts.click();}*/
    // public void selectTheFavoritesOption() {
    // Actions action = new Actions(driver);
    //action.moveToElement(product).moveToElement(addTOFavorites).click().build().perform();
    //this.addTOFavorites.click();
//}
    public void theCookiesElementAccept() {this.acceptanceOfCookies.click();}

}
