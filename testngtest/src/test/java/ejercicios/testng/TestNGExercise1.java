package ejercicios.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import utils.WebDriverFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class TestNGExercise1 {

    @Test
    public void browser() {
        File chromeFilePath = new File("src/test/resources/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        //Other way to execute the driver
        //WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
        driver.close();
    }

}
