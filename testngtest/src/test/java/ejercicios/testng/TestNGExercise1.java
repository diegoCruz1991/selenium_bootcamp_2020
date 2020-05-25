package ejercicios.testng;

import ejemplos.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class TestNGExercise1 extends BaseTest {


    @Test(priority = 0)
    public void googleTC() throws InterruptedException {

        myDriver.navigate().to("https://www.google.com.mx");

        Assert.assertEquals(myDriver.getCurrentUrl(), "https://www.google.com.mx/");
        Thread.sleep(1000);


    }





}
