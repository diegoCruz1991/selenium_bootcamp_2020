package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn4 {
    public static void main (String[] args) throws InterruptedException{
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        myDriver.navigate().to("https://amazon.com.mx");
        Thread.sleep(2000);
        WebElement myElement = myDriver.findElement(By.id("twotabsearchtextbox"));
        myElement.sendKeys("Selenium");
        myElement.submit();
        Thread.sleep(10000);
        myDriver.close();
    }
}
