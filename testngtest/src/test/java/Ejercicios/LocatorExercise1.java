package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorExercise1 {
    public static void main(String[] args) throws InterruptedException {

        //Create new Instance of Chrome By WebDriverFactory
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //Set PageLoadTime
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // ***** TEST PROPERTIES *****
        // Target Page
        driver.get("https://www.mercadolibre.com.mx/");
        //Print Current URL
        System.out.println(driver.getCurrentUrl());
        //Check if the page is correct
        assert driver.getCurrentUrl().equals("https://www.mercadolibre.com.mx/") : "correct page";

        // ***** WEB ELEMENTS *****
        WebElement search_bar = driver.findElement(By.name("as_word"));
        WebElement search_button = driver.findElement(By.className("nav-icon-search"));

        // ***** TEST STEPS *****

        search_bar.sendKeys("Selenium");
        search_button.click();

        //Wait for search results
        Thread.sleep(1000);

        //Create a list of Search results
        List<WebElement> results_list = driver.findElements(By.className("main-title"));
        //First Result in the list
        WebElement first_result = results_list.get(0);
        first_result.click();

        //Set a Wait time
        Thread.sleep(5000);
        
        //Close current Window
        driver.close();
    }
}
