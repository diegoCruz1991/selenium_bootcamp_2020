package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn2 {
    public static void main(String[] args) throws InterruptedException {

        //Create new Instance of Chrome By WebDriverFactory
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //Set PageLoadTime
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

        // ***** TEST PROPERTIES *****

        // Target Page
        driver.get("https://www.inaturalist.org/");
        //Print Current URL
        System.out.println("\nThe target page for this test is: "+driver.getCurrentUrl()+"\n");
        //Check if the page is correct
        assert driver.getCurrentUrl().equals("https://www.inaturalist.org/") : "correct page";

        // ***** WEB ELEMENTS *****
        WebElement dropdown;
        WebElement places;
        Actions actions;
        WebElement search_bar;
        WebElement element;

        // ***** TEST STEPS *****
        //Implicit Wait 10 seconds
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //Get Dropdown
        dropdown = driver.findElement(By.cssSelector("li[class='navtab moretab menutab'] > div[class='dropdown']"));
        //create Actions Object
        actions = new Actions(driver);
        //move the mouse to the dropdown to make visible the inside elements
        actions.moveToElement(dropdown).perform();

        //Get places
        places = driver.findElement(By.xpath("//a[contains(text(),'Places')]"));
        //move mouse to places to click it while is visible
        actions.moveToElement(places).perform();
        places.click();

        //Get search bar
        search_bar = driver.findElement(By.id("q"));
        search_bar.sendKeys("Colomos, Guadalajara");
        search_bar.sendKeys(Keys.ENTER);

        // Create a list with all the a elements
        List<WebElement> list_names =  driver.findElements(By.xpath("//a[contains(@class,'taxon')]"));
        //index of a elements
        int i = 0;

        //Iterate the list
        for(WebElement current_element:list_names){
            //Clicking the current_element will refresh the page with the new species
            current_element.click();
            //Wait until the page is loading
            Thread.sleep(1000);
            //Print the text of the current element
            System.out.println("Type: "+list_names.get(i).getText());
            //increment the index to get the next element
            i++;
            //try catch because if the specias has no examples the driver can trigger an exception
            try {
                element = driver.findElement(By.cssSelector("div[class='guide_taxa']>*>*>*>*>*>*"));
                System.out.println("Example: " + element.getText() + "\n");
            }catch (Exception e){
                System.out.println("No example for this category\n");
            }
        }

        //Close current Window
        driver.close();
    }
}