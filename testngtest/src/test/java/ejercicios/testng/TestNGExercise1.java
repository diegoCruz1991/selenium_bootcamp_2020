package ejercicios.testng;

import ejemplos.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestNGExercise1 extends BaseTest {

    @Test(priority = 0)
    public void validateGoogleURL() {
        //WebDriver driver = WebDriverFactory.getDriver("chrome");
        String URL = "https://www.google.com/";
        myDriver.get(URL);
        myDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(myDriver.getCurrentUrl(),URL,"URL is different than https://www.google.com/");
    }


}
