import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class SearchPage extends PageObject {
    private final String SEARCH_STRING = "ceas";
    private final String Search_Second_Product = "hanorac";

    @FindBy(css = "#app > section > div.stickyHeaderPlaceholder--1uv_5 > div > header > div > div.topRowContainer--33KcX.row > div.headerIcons--3B4c3 > ul > li:nth-child(1) > div > form > input")
    private WebElement searchField;
    //Am accesat field-ul de cautare si voi folosi cuvantul "ceas"
    @FindBy(xpath = "//*[@id=\"app\"]/section/div[2]/div/header/div/div[1]/div[3]/ul/li[1]/div/form/input")
    private WebElement searchSecondProduct;
    //Am accesat field-ul de cautare produs cu un nou produs "hanorac"
    @FindBy(css = "#app > section > div.stickyHeaderPlaceholder--1uv_5 > div > header > div > div.topRowContainer--33KcX.row > div.headerIcons--3B4c3 > ul > li:nth-child(1) > div > form > button")
    private WebElement searchButton;
    //Am dat click pe butonul de cautare
    @FindBy(xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
    private WebElement acceptCookies;
    //Am dat OK la aparitia unor cookie-uri



    public SearchPage(WebDriver driver) { super(driver);}
    public void populateSearchField() {this.searchField.sendKeys(SEARCH_STRING);}
    public void searchOtherProduct() {this.searchSecondProduct.sendKeys(Search_Second_Product);}
    public void searchItemUsingButton() {this.searchButton.click();}
    public void okForCookies() {this.acceptCookies.click();}


}
