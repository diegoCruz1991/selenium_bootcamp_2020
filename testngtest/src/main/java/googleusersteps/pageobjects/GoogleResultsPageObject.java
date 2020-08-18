package googleusersteps.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class GoogleResultsPageObject extends BasePageObject {

    @FindBy(how = How.NAME, using = "q")
    private WebElement searchBox;

    @FindBy(how = How.XPATH, using = "//div[@id = 'search']//div[@class = 'g']//h3[not(ancestor::div[@class = 'related-question-pair'])]")
    private List<WebElement> results;

    @FindBy(how = How.XPATH, using = "//form[@name = 'f']//button[@type = 'submit']")
    private WebElement searchButton;

    public GoogleResultsPageObject(WebDriver driver, String baseURL) {
        super(driver, driver.getCurrentUrl());
    }

    public List<WebElement> getResults() {
        return this.results;
    }

    public void clickOnSearchButton() {
        this.searchButton.click();
    }

    public void sendKeysInSearchBox(String searchWord) {
        this.searchBox.clear();
        this.searchBox.sendKeys(searchWord);
    }
}
