package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CountSeleniumWords {
    public static void main(String[] args) throws InterruptedException {

        //Create new Instance of Chrome By WebDriverFactory
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //Set PageLoadTime
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // ***** TEST PROPERTIES *****
        // Target Page
        driver.get("https://es.wikipedia.org/wiki/Selenium");

        // ***** WEB ELEMENTS *****
        List<WebElement> lista_href;

        // ***** TEST STEPS *****
        //get all href

        System.out.println(countSelenium(driver));




        //Close current Window
        driver.close();
    }

    public static String countSelenium(WebDriver driver){
        String response="";

        int list = driver.findElements(By.xpath("//*[attribute::href and text()='selenium']")).size();

        response = "selenium - "+list+" times";
        return response;
    }

}
