package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorExercise2 {
    public static void main(String[] args) throws InterruptedException {

        //Create new Instance of Chrome By WebDriverFactory
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //Set PageLoadTime
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // ***** TEST PROPERTIES *****
        // Target Page
        driver.get("https://www.google.com.mx/");
        //Print Current URL
        System.out.println(driver.getCurrentUrl());
        //Check if the page is correct
        assert driver.getCurrentUrl().equals("https://www.mercadolibre.com.mx/") : "correct page";

        // ***** WEB ELEMENTS *****


        // ***** TEST STEPS *****
        //set implicit wait
        driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
        WebElement search_bar = driver.findElement(By.name("as_word"));


        //Set a Wait time
        Thread.sleep(5000);

        //Close current Window
        driver.close();
    }
}
