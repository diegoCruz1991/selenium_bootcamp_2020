package ejercicios.testng;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

public class TestNGExcersise1 {

    @Test(alwaysRun = true)
    @Parameters("user_id")
    public static void validateGoogleURL() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.google.com");

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
    }
}
