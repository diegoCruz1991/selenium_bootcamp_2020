package ejercicios.testNG;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

public class TestNGExercise1 {

    @Test(priority = 0)
    public static void validateGoogleURL() {
        WebDriver chrome = WebDriverFactory.getDriver("chrome");

        chrome.get("https://www.google.com/");

        Assert.assertEquals(chrome.getCurrentUrl(),"https://www.google.com/");
    }
}
