package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class XpathExercise2 {
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
        List<WebElement> lista_a,lista_head;

        // ***** TEST STEPS *****
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);

        lista_a = driver.findElements(By.xpath("//a"));
        System.out.println("All elements from a: \n");
        for (WebElement element:lista_a) {
            System.out.println(element.getText());
        }

        lista_head = driver.findElements(By.xpath("//head/*"));
        System.out.println("\nAll elements from head: \n");
        for (WebElement element:lista_head) {
            System.out.println(element.getTagName());
        }

        //Close current Window
        driver.close();
    }
}
