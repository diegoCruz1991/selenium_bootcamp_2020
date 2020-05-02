package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.WebDriverFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SeleniumHands5 {
    public static void main (String[] args) throws  InterruptedException{
        WebDriver myDriver= WebDriverFactory.getDriver("Chrome");
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //Entrar a facebook
        myDriver.navigate().to("https://www.facebook.com/");

        //Escribe el email  en el campo email
        WebElement emailElement=myDriver.findElement(By.id("email"));
        emailElement.sendKeys("edith.jimenezm@gmail.com");

        //Escribe el password en el campo password
        WebElement passElement=myDriver.findElement(By.id("pass"));
        passElement.sendKeys("Abril_1203");

        // Da click en el login
        WebElement logElement=myDriver.findElement(By.id("loginbutton"));
        logElement.click();

        Thread.sleep(2000);

        WebElement searchElement=myDriver.findElement(By.name("q"));
        searchElement.sendKeys("QAMinds");
        searchElement.submit();

        Thread.sleep(1000);
        
        myDriver.close();
    }
}
