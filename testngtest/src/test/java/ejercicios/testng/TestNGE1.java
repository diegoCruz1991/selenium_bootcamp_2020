package ejercicios.testng;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class TestNGE1 {

    @Test
    public static void validateGoogleURL() {
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        myDriver.get("https://www.google.com/");

        Assert.assertEquals(myDriver.getCurrentUrl(), "https://www.google.com/");

        myDriver.close();
    }
}
