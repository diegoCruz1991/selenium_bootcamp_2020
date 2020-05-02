package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class FacebookSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        myDriver.get("https://www.facebook.com/");

        WebElement txtEmail = myDriver.findElement(By.id("email"));
        WebElement txtPass = myDriver.findElement(By.id("pass"));
        WebElement btnLogin = myDriver.findElement(By.id("u_0_b"));

        txtEmail.sendKeys("cesar_i10@hotmail.com");
        txtPass.sendKeys("*******");
        btnLogin.click();
        Thread.sleep(1000);
        WebElement txtSearch = myDriver.findElement(By.name("q"));
        txtSearch.sendKeys("QA Minds");
        txtSearch.submit();
        Thread.sleep(10000);
        myDriver.close();







    }
}
