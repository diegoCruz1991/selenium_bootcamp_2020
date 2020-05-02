package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn5 {
    public static void main (String[] args) throws InterruptedException{
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        myDriver.get("https://facebook.com");
        WebElement myElement = myDriver.findElement(By.id("email"));
        myElement.sendKeys("animerick-r2@hotmail.com");
        myElement = myDriver.findElement(By.id("pass"));
        myElement.sendKeys("MyPassWord");
        myElement = myDriver.findElement(By.id("loginbutton"));
        myElement.click();
        Thread.sleep(4000);
        myElement = myDriver.findElement(By.name("q"));
        myElement.sendKeys("QA Minds");
        myElement.submit();
        Thread.sleep(10000);

        myDriver.close();
    }
}
