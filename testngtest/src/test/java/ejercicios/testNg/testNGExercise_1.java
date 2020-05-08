package ejercicios.testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

public class testNGExercise_1 {
    @Test(priority = 0)
    public static void passTC() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("https://www.google.com.mx/");
        Assert.assertEquals(driver.getCurrentUrl().toString(), "https://www.google.com.mx/");
    }
}
