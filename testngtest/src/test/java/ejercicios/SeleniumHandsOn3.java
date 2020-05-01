package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn3 {
    public static void main (String[] args) throws InterruptedException{
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        myDriver.navigate().to("https://www.facebook.com");

        WebElement myElement = myDriver.findElement(By.id("email"));
        myElement.sendKeys("animerick-r2@hotmail.com");
        myElement = myDriver.findElement(By.id("pass"));
        myElement.sendKeys("D!R@CK2015book");
        myElement = myDriver.findElement(By.id("loginbutton"));
        myElement.click();

        Thread.sleep(5000);
        myDriver.close();
    }
}
