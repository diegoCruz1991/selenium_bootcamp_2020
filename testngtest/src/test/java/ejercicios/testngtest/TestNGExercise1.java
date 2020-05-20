package ejercicios.testngtest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

public class TestNGExercise1 extends BaseTest {
    @Test
    public static void google() {
        // Da de alta el driver
        WebDriver myDriver= WebDriverFactory.getDriver("Chrome");

        //Entra a Google
        myDriver.navigate().to("https://www.google.com.mx/");

        //Revisa que la URL sea la que se pidió accesar
        Assert.assertEquals(myDriver.getCurrentUrl(),"https://www.google.com.mx/");

        myDriver.close();
    }


}
