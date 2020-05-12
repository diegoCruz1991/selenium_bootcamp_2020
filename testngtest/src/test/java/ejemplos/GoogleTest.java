package ejemplos;

import google.pages.GoogleHome;
import google.pages.GoogleResultsPage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

//@Epic("Regression Tests")
//@Feature("First Test")
public class GoogleTest extends BaseTest {

    @Test(alwaysRun = true, priority = 0)
    //@Severity(SeverityLevel.BLOCKER)
    //@Description("Check if the Page to be tested is the correct one")
    //@Story("Get to Google Page")
    //@Step("Go to Google")
    public void validateGoogleURL() {
        myDriver.get(GoogleHome.BASE_URL);

        GoogleHome home = new GoogleHome(myDriver);

        SoftAssert softAssertion = new SoftAssert();

        softAssertion.assertEquals(myDriver.getCurrentUrl(), GoogleHome.BASE_URL + "s");

        softAssertion.assertTrue(home.isLoaded(), "Google page is not loaded");

        softAssertion.assertAll();
    }

    @Test(alwaysRun = true, priority = 1)
    //@Severity(SeverityLevel.BLOCKER)
    //@Description("Search something in Google")
    //@Story("Test Google Search")
    //@Step("Search in Google Selenium")
    public void searchSomething() {
        GoogleHome home = new GoogleHome(myDriver);

        GoogleResultsPage resultsPage = home.searchInGoogle("Selenium");

        Assert.assertTrue(resultsPage.isLoaded(), "Google results page is not loaded");

        Assert.assertTrue(resultsPage.verifyResultByIndex(1, "Selenium"));
    }

    @Test(priority = 2, dependsOnMethods = {"searchSomething"})
    //@Severity(SeverityLevel.BLOCKER)
    //@Description("Search something in Google")
    //@Story("Test Google Search")
    //@Step("Click in the result")
    public void clickOnResultByTitle() throws InterruptedException {
        GoogleResultsPage resultsPage = new GoogleResultsPage(myDriver);

        resultsPage.clickOnResultByTitle("Selenium - Wikipedia, la enciclopedia libre");

        Assert.assertEquals(myDriver.getCurrentUrl(), "https://es.wikipedia.org/wiki/Selenium", "First result is wrong");
    }
}
