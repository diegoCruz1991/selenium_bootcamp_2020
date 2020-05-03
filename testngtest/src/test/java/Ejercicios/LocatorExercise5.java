package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorExercise5 {
    public static void main(String[] args) throws InterruptedException {

        //Create new Instance of Chrome By WebDriverFactory
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //Set PageLoadTime
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // ***** TEST PROPERTIES *****
        // Target Page
        driver.get("https://amazon.com.mx");
        //Print Current URL
        System.out.println(driver.getCurrentUrl());
        //Check if the page is correct
        assert driver.getCurrentUrl().equals("https://amazon.com.mx") : "correct page";

        // ***** WEB ELEMENTS *****
        WebElement dropDown;

        // ***** TEST STEPS *****
        dropDown = driver.findElement(By.id("searchDropdownBox"));
        Select selector = new Select(dropDown);

        System.out.println("Todas las opciones\n");

        for (WebElement elementos:selector.getOptions()) {
            System.out.println(elementos.getText());
        }

        System.out.println("\n");
        System.out.println("Is multiple? "+selector.isMultiple()+"\n");
        System.out.println("first option: "+selector.getFirstSelectedOption().getText()+"\n");
        System.out.println("Option at index 0 "+selector.getOptions().get(0).getText()+"\n");
        selector.selectByValue("search-alias=automotive");

        //Set a Wait time
        Thread.sleep(5000);

        //Close current Window
        driver.close();
    }
}
