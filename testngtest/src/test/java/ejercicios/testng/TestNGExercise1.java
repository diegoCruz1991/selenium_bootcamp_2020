package ejercicios.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class TestNGExercise1 {


    @Test(priority = 0)
    public static void googleTC() throws InterruptedException {
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
        WebDriver myDriver = new FirefoxDriver();
        myDriver.navigate().to("https://www.google.com.mx");

        Assert.assertEquals(myDriver.getCurrentUrl(), "https://www.google.com.mx/");
        Thread.sleep(1000);
        myDriver.close();

    }





}
