package testNGexercise;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class TestNgExercise1 {


    @Test(priority = 0)
    public static void validadGoogleURL() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //open google in current window
        driver.get("https://www.google.com.mx");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com.mx/");
    }

    @Test(priority = 1)
    public static void failTC() {
        Assert.assertEquals("Test", "Fail");
    }
}
