package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn5 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        myDriver.get("https://www.facebook.com");
        Thread.sleep(3000);

        WebElement mail = myDriver.findElement(By.id("email"));
        mail.sendKeys("mytestfmt5@gmail.com");

        WebElement passwd = myDriver.findElement(By.id("pass"));
        passwd.sendKeys("Accedoqa123");

        WebElement logButton = myDriver.findElement(By.id("loginbutton"));
        logButton.click();
        Thread.sleep(3000);

        WebElement searchBox = myDriver.findElement(By.name("q"));
        searchBox.sendKeys("QA Minds");


        Thread.sleep(10000);

        myDriver.close();
    }
}
