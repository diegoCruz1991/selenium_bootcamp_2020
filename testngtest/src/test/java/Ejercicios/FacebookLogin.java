package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class FacebookLogin {
    public static void main(String[] args) throws InterruptedException {
       WebDriver myDriver = WebDriverFactory.getDriver("chrome");
       myDriver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        myDriver.get("https://www.facebook.com/");

       WebElement txtUser = myDriver.findElement(By.id("email"));
       WebElement txtPass = myDriver.findElement(By.id("pass"));
       WebElement btnLogin = myDriver.findElement(By.id("u_0_b"));


       Thread.sleep(2000);
        txtUser.sendKeys("cesar_i10@hotmail.com");
        txtPass.sendKeys("Nose");
        btnLogin.click();
        Thread.sleep(5000);
        myDriver.close();
    }
}
