package ejercicios.testng;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class TestNGE1 extends BaseTest{
    @Test(priority = 0)
    public void validateGoogleURL()
    {

        myDriver.get("https://www.google.com/");

        Assert.assertEquals(myDriver.getCurrentUrl(), "https://www.google.com/");

    }
}
