package ejercicios.testng;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

public class TestNGExcersise1 {

    @Test
    public static void validateGoogleURL() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.google.com");

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
    }
}
