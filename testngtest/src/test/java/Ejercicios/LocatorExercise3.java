package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorExercise3 {
    public static void main(String[] args) throws InterruptedException {

        //Create new Instance of Chrome By WebDriverFactory
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //Set PageLoadTime
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // ***** TEST PROPERTIES *****
        // Target Page
        driver.get("https://www.nasa.gov");
        //Print Current URL
        System.out.println(driver.getCurrentUrl());
        //Check if the page is correct
        assert driver.getCurrentUrl().equals("https://www.nasa.gov/") : "correct page";

        // ***** WEB ELEMENTS *****
        WebElement link_mission;
        WebElement link_NasaTV;
        WebElement link_mars;
        List<WebElement> input;

        // ***** TEST STEPS *****

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        link_mission = driver.findElement(By.linkText("Missions"));
        System.out.println(link_mission.getAttribute("href"));

        link_NasaTV = driver.findElement(By.linkText("NASA TV"));
        System.out.println(link_NasaTV.getAttribute("href"));

        link_mars = driver.findElement(By.partialLinkText("Mars"));
        System.out.println(link_mars.getAttribute("href"));

        input = driver.findElements(By.tagName("input"));
        System.out.println(input.size());


        //Set a Wait time
        Thread.sleep(5000);

        //Close current Window
        driver.close();
    }
}
