package ejemplos;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise1 extends BaseTest {

    @Test(alwaysRun = true)
    public void validateGoogleURL() throws InterruptedException {
        myDriver.get("https://www.google.com");
        Thread.sleep(4000);
        Assert.assertEquals(myDriver.getCurrentUrl(), "https://www.google.com/");
    }

    @Test(alwaysRun = true)
    public void validateGoogleButton() {
        myDriver.get("https://www.google.com");
        Assert.assertEquals(myDriver.getCurrentUrl(), "https://www.google.com/");
    }

}
