package googleusersteps.steps;

import googleusersteps.pageobjects.GoogleHomePageObject;
import googleusersteps.pageobjects.GoogleResultsPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleResultsUserSteps {

    private GoogleResultsPageObject googleResultsPageObject;

    public GoogleResultsUserSteps(WebDriver driver) {
        this.googleResultsPageObject = new GoogleResultsPageObject(driver, driver.getCurrentUrl());
    }

    public void clickOnResultItem(int resultIndex) {
        this.googleResultsPageObject.getResults().get(resultIndex).click();
    }

    public List<WebElement> getResultsSubList(int startIndex, int endIndex) {
        List<WebElement> listResults = this.googleResultsPageObject.getResults();

        return listResults.subList(startIndex, endIndex);
    }
}
