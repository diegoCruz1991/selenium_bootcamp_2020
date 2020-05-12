package google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHome extends BasePage {

    public static final String BASE_URL = "https://www.google.com/";

    @FindBy(how = How.ID, using = "hplogo")
    private WebElement doddle;

    @FindBy(how = How.ID, using = "lst-ib")
    private WebElement searchBox;

    @FindBy(how = How.NAME, using = "btnI")
    private WebElement feelingLuckyButton;

    @FindBy(how = How.NAME, using = "btnK")
    private WebElement seacrhInGoogleButton;

    public GoogleHome(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
    }

    public GoogleResultsPage searchInGoogle(String searchTxt) {
        searchBox.sendKeys(searchTxt);
        seacrhInGoogleButton.click();
        return new GoogleResultsPage(driver);
    }

    public GoogleResultsPage searchInGoogleFeelingLucky(String searchTxt) {
        searchBox.sendKeys(searchTxt);
        feelingLuckyButton.click();
        return new GoogleResultsPage(driver);
    }

    @Override
    public boolean isLoaded() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(doddle));
            return true;
        } catch(RuntimeException exception) {
            System.out.println("Error: Pagina no Cargo " + exception);
            //logger.error(exception);
            return false;
        }
    }

}
