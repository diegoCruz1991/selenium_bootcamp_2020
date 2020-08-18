package ejemplos;

import google.pages.GoogleHome;
import google.pages.GoogleResultsPage;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

@Epic("Google Testing")
@Feature("First Test")
public class GoogleTest extends BaseTest {

    @Test(alwaysRun = true, priority = 0)
    @Parameters({"user_id", "otro_parametro"})
    @Severity(SeverityLevel.BLOCKER)
    @Description("Check if the Page to be tested is the correct one")
    @Story("Get to Google Page")
    @Step("Go to Google")
    public void validateGoogleURL(String user_id, String otro_parametro) {
        System.out.println(user_id);
        System.out.println(otro_parametro);
        myDriver.get(GoogleHome.BASE_URL);

        GoogleHome home = new GoogleHome(myDriver);

        SoftAssert softAssertion = new SoftAssert();

        softAssertion.assertEquals(myDriver.getCurrentUrl(), GoogleHome.BASE_URL);

        softAssertion.assertTrue(home.isLoaded(), "Google page is not loaded");

        softAssertion.assertAll();
    }

    @Test(alwaysRun = true, priority = 1)
    @Parameters({"user_id", "otro_parametro"})
    @Severity(SeverityLevel.BLOCKER)
    @Description("Search something in Google")
    @Story("Test Google Search")
    @Step("Search in Google Selenium")
    public void searchSomething(String user_id, String otro_parametro) {
        myDriver.get(GoogleHome.BASE_URL);

        GoogleHome home = new GoogleHome(myDriver);

        GoogleResultsPage resultsPage = home.searchInGoogle("Selenium");

        Assert.assertTrue(resultsPage.isLoaded(), "Google results page is not loaded");

        Assert.assertTrue(resultsPage.verifyResultByIndex(1, "Selenium"));
    }

    @Test(priority = 2, dependsOnMethods = {"searchSomething"})
    @Severity(SeverityLevel.BLOCKER)
    @Description("Search something in Google")
    @Story("Test Google Search")
    @Step("Click in the result")
    public void clickOnResultByTitle() throws InterruptedException {
        GoogleResultsPage resultsPage = new GoogleResultsPage(myDriver);

        resultsPage.clickOnResultByTitle("Selenium - Wikipedia, la enciclopedia libre");

        Assert.assertEquals(myDriver.getCurrentUrl(), "https://es.wikipedia.org/wiki/Selenium", "First result is wrong");
    }
}
