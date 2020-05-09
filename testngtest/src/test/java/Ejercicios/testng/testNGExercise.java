package Ejercicios.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class testNGExercise {

    @Test(priority = 0)

    public static void passTC() {
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myDriver.get("https://www.google.com/");
       // WebElement txtPage = myDriver.getCurrentUrl();

        Assert.assertEquals( myDriver.getCurrentUrl(), "https://www.google.com/");

    }

}
