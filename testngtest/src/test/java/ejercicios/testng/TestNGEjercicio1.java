package ejercicios.testng;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.WebDriverFactory;
public class TestNGEjercicio1 {

    @Test
            public void validateGoogleURL()

    {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com.mx/?gws_rd=ssl");

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com.mx/?gws_rd=ssl");
    }

}
