import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FourthPage extends PageObject{

    @FindBy(xpath = "//*[@id=\"app\"]/section/section[1]/section/div[2]/div/div/div/div[7]/button")
    private WebElement addTOFavorites;

    public FourthPage(WebDriver driver) {super(driver);}

    public void theFavoriteProduct() {this.addTOFavorites.click();}




}
