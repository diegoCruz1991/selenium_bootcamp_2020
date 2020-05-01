package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.WebDriverFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn2 {
    public static void main(String[] args) throws InterruptedException {

        //Create new Instance of Chrome By WebDriverFactory
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        //Set PageLoadTime
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //Open Google in Current Window
        myDriver.get("https://google.com.mx");
        //Print Current URL
        System.out.println(myDriver.getCurrentUrl());
        assert myDriver.getCurrentUrl().equals("https://google.com.mx)") : "correct page";
        //Create new WebElement
        WebElement search_bar = myDriver.findElement(By.name("q"));

        //Test Steps
        search_bar.sendKeys("Selenium");
        search_bar.sendKeys(Keys.ENTER);

        //Set a Wait time
        Thread.sleep(1000);

        //Close current Window
        myDriver.close();
    }
}
