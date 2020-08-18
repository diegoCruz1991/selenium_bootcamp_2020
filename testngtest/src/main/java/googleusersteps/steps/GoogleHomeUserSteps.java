package googleusersteps.steps;

import googleusersteps.pageobjects.GoogleHomePageObject;
import org.openqa.selenium.WebDriver;

public class GoogleHomeUserSteps {

    private GoogleHomePageObject googleHomePageObject;

    private WebDriver driver;

    public GoogleHomeUserSteps(WebDriver driver) {
        this.driver = driver;
        this.googleHomePageObject = new GoogleHomePageObject(driver);
    }

    public GoogleResultsUserSteps searchContent(String word) {
        this.googleHomePageObject.sendKeysInSearchBox(word);
        this.googleHomePageObject.clickOnSearchInGoogleButton();

        return new GoogleResultsUserSteps(this.driver);
    }

    public GoogleResultsUserSteps searchContentFeelingLucky(String word) {
        this.googleHomePageObject.sendKeysInSearchBox(word);
        this.googleHomePageObject.clickOnFeelingLuckyButton();

        return new GoogleResultsUserSteps(this.driver);
    }
}
