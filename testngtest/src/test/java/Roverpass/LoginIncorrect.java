package Roverpass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class LoginIncorrect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myDriver.get("********");

        WebElement txtEmail = myDriver.findElement(By.id("session_form_email"));
        WebElement txtxPAssword = myDriver.findElement(By.id("session_form_password"));
        WebElement btnSingin = myDriver.findElement(By.name("commit"));

        txtEmail.sendKeys("*******");
        txtxPAssword.sendKeys("*******");
        btnSingin.click();
        Thread.sleep(3000);


        //myDriver.close();
    }
}
