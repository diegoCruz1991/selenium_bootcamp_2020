package ejercicios.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestNGExercise1 {

    @Test(priority = 0)
    public static void validateGoogleURL() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        String URL = "https://www.google.com/";
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(driver.getCurrentUrl(),URL,"URL is different than https://www.google.com/");
        driver.close();
    }


}
