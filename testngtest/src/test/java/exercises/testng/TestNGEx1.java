package exercises.testng;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

public class TestNGEx1 {

    @Test(priority = 0)
    public static void passTC() {

        WebDriver driver = new WebDriverFactory().getDriver("chrome");
        driver.get("https://www.google.com/");
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://www.google.com/");
        driver.close();
    }

    @Test()
    public static void failTC() {

        WebDriver driver = new WebDriverFactory().getDriver("chrome");
        driver.get("https://amazon.com.mx");
        Assert.assertEquals(5, 6);
        driver.close();
    }
}
