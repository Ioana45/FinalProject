import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThirdPage extends PageObject{
    @FindBy(css = "//*[@id=\"app\"]/section/section[1]/section/div[2]/div/div/div/div[7]/button")
    private WebElement addTOFavorites;

    public ThirdPage(WebDriver driver) {super(driver);}
    public void theFavoriteProduct() {this.addTOFavorites.click();}
}
