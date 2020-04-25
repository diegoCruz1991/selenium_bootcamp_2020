package ejemplos;

import google.pages.GoogleHome;
import google.pages.GoogleResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    @Test(alwaysRun = true, priority = 0)
    public void validateGoogleURL() {
        myDriver.get(GoogleHome.BASE_URL);

        GoogleHome home = new GoogleHome(myDriver);

        Assert.assertEquals(myDriver.getCurrentUrl(), GoogleHome.BASE_URL);

        Assert.assertTrue(home.isLoaded(), "Google page is not loaded");
    }

    @Test(alwaysRun = true, priority = 1)
    public void searchSomething() {
        GoogleHome home = new GoogleHome(myDriver);

        GoogleResultsPage resultsPage = home.searchInGoogle("Selenium");

        Assert.assertTrue(resultsPage.isLoaded(), "Google results page is not loaded");

        Assert.assertTrue(resultsPage.verifyResultByIndex(1, "Selenium"));
    }

    @Test(priority = 2, dependsOnMethods = {"searchSomething"})
    public void clickOnResultByTitle() throws InterruptedException {
        GoogleResultsPage resultsPage = new GoogleResultsPage(myDriver);

        resultsPage.clickOnResultByTitle("Selenium - Wikipedia, la enciclopedia libre");

        Assert.assertEquals(myDriver.getCurrentUrl(), "https://es.wikipedia.org/wiki/Selenium", "First result is wrong");
    }
}
