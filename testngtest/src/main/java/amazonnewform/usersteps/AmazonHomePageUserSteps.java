package amazonnewform.usersteps;

import amazonnewform.pageobjects.header.AmazonSearchPageObject;
import amazonnewform.pages.AmazonHomePage;
import org.openqa.selenium.WebDriver;

public class AmazonHomePageUserSteps {

    private AmazonHomePage amazonHomePage;

    public AmazonHomePageUserSteps(WebDriver driver) {
        this.amazonHomePage = new AmazonHomePage(driver);
    }

    public void searchAProduct(String product) {
        AmazonSearchPageObject amazonSearchPageObject = this.amazonHomePage.getAmazonHeaderComponent().getAmazonSearchPageObject();

        amazonSearchPageObject.sendKeysSearchBox(product);
        amazonSearchPageObject.clickOnSearchButton();
    }
}
