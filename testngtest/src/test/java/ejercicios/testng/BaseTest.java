package ejercicios.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.WebDriverFactory;

public class BaseTest {

    protected WebDriver myDriver;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        myDriver = WebDriverFactory.getDriver(browser);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        myDriver.close();
        myDriver.quit();
    }
}