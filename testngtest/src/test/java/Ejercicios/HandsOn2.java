package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

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
        WebElement search_bar;
        WebElement element;

        // ***** TEST STEPS *****
        //Implicit Wait 10 seconds
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Get dropdown
        dropdown = driver.findElement(By.xpath("//*[@id='header-more-dropdown-toggle']/i[@class='fa fa-angle-down']"));
        //Double click to keep the inside elements active
        dropdown.click();
        dropdown.click();

        //Get Places
        places = driver.findElement(By.xpath("//a[@href='/places']"));
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
            //try catch because if the species has no examples the driver can trigger an exception
            try {
                element = driver.findElement(By.cssSelector("div[class='guide_taxa']>*>*>*>*>*>*"));
                System.out.println("Example: " + element.getText() + "\n");
            }
            catch (Exception e){
                System.out.println("No example for this category\n");
            }
        }

        //Close current Window
        driver.close();
    }
}
