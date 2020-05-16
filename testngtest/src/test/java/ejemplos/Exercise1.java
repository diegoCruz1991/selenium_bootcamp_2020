package ejemplos;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise1 extends BaseTest {

    @Test(alwaysRun = true)
    public void validateGoogleURL() {
        driver.get("https://www.google.com");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
    }

    @Test(alwaysRun = true)
    public void validateGoogleButton() {
        driver.get("https://www.google.com");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
    }

}
