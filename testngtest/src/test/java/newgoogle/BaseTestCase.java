package newgoogle;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.PropertyReader;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class BaseTestCase {

    protected WebDriver myDriver;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        // Define which browser to use
        String browser = PropertyReader.getProperty("test.properties", "BROWSER");

        // Get correct driver for desire browser
        myDriver = WebDriverFactory.getDriver(browser);
        myDriver.manage().timeouts().pageLoadTimeout(Integer.parseInt(PropertyReader.getProperty("test.properties", "PAGE_LOAD_TIMEOUT")), TimeUnit.SECONDS);
        myDriver.manage().timeouts().implicitlyWait(Integer.parseInt(PropertyReader.getProperty("test.properties", "IMPLICITLY_WAIT_TIMEOUT")), TimeUnit.SECONDS);
        myDriver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        myDriver.close();
        myDriver.quit();
    }
}
