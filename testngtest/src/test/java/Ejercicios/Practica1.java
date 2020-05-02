package Ejercicios;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Practica1 {

    public static void main (String [] arg) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");


        driver.get("https://www.facebook.com/");


        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("anac_hernandez_eulloqui@live.com");

        WebElement passField = driver.findElement(By.id("pass"));
        passField.sendKeys("123polilla");

        WebElement loginField = driver.findElement(By.id("loginbutton"));
        loginField.click();

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("qa minds");

        Thread.sleep(2000);
        driver.close();
    }

}
