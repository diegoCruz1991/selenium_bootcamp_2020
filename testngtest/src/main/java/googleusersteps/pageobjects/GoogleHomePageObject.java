package googleusersteps.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleHomePageObject extends BasePageObject {

    @FindBy(how = How.ID, using = "hplogo")
    private WebElement doddle;

    @FindBy(how = How.NAME, using = "q")
    private WebElement searchBox;

    @FindBy(how = How.NAME, using = "btnI")
    private WebElement feelingLuckyButton;

    @FindBy(how = How.NAME, using = "btnK")
    private WebElement searchInGoogleButton;

    public GoogleHomePageObject(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
    }

    public void clickOnSearchInGoogleButton() {
        this.searchInGoogleButton.click();
    }

    public void clickOnFeelingLuckyButton() {
        this.feelingLuckyButton.click();
    }

    public void clickOnDoddle() {
        this.doddle.click();
    }

    public void sendKeysInSearchBox(String searchWord) {
        this.searchBox.clear();
        this.searchBox.sendKeys(searchWord);
    }
}
