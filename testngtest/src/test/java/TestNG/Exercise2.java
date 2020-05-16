package TestNG;

import ejemplos.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise2 extends BaseTest {

    @Test(alwaysRun = true)
    public void validateGoogleURL() {
        driver.get("https://www.google.com.mx");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com.mx/");
    }

}
