package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn4 {
    public static void main(String[] args) throws InterruptedException {
        //Create new Instance of Chrome By WebDriverFactory
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //Set PageLoadTime
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //***** TEST PROPERTIES *****
        // Target Page
        driver.get("https://www.amazon.com.mx/");
        //Print Current URL
        System.out.println(driver.getCurrentUrl());
        //Check if the page is correct
        assert driver.getCurrentUrl().equals("https://www.amazon.com.mx/") : "correct page";

        // ***** WEB ELEMENTS *****
        WebElement search_bar;

        //Test Steps
        Thread.sleep(10000);
        search_bar = driver.findElement(By.id("twotabsearchtextbox"));
        search_bar.sendKeys("Selenium");
        search_bar.submit();

        //Set a Wait time
        Thread.sleep(5000);

        //Close current Window
        driver.close();
    }
}
