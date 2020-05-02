package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHands3 {
    public static void main (String[] args) throws  InterruptedException{
        WebDriver myDriver= WebDriverFactory.getDriver("Chrome");
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //Entra a facebook
        myDriver.navigate().to("https://www.facebook.com/");

        //Escribe el email  en el campo email
        WebElement emailElement=myDriver.findElement(By.id("email"));
        emailElement.sendKeys("edith.jimenezm@gmail.com");

        //Escribe el password en el campo password
        WebElement passElement=myDriver.findElement(By.id("pass"));
        passElement.sendKeys("Edith");

        // Da click en el login
        WebElement logElement=myDriver.findElement(By.id("loginbutton"));
        logElement.click();

        Thread.sleep(10000);

        //Cierra driver
        myDriver.close();
    }
}
