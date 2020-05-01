package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn3 {

    public static void main(String[] args) throws InterruptedException {
        //Create new Instance of Chrome By WebDriverFactory
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //Set PageLoadTime
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //***** TEST PROPERTIES *****
        // Target Page
        driver.get("https://facebook.com");
        //Print Current URL
        System.out.println(driver.getCurrentUrl());
        //Check if the page is correct
        assert driver.getCurrentUrl().equals("https://facebook.com") : "correct page";

        // ***** WEB ELEMENTS *****

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement login_button = driver.findElement(By.id("loginbutton"));

        //Test Steps
        email.sendKeys("loquesea@hotmail.com");
        password.sendKeys("loquesea123");
        login_button.click();

        //Set a Wait time
        Thread.sleep(5000);

        //Close current Window
        driver.close();
    }
}
