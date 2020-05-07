package TestNG;

import ejemplos.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

public class Exercise1 {

    WebDriver driver = WebDriverFactory.getDriver("chrome");

    @Test(alwaysRun = true)
    public void validateGoogleURL() {
        driver.get("https://www.google.com.mx");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com.mx/");
        driver.close();
    }

}
