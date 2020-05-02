package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SeleniumExercise5 {

    public static void main (String[] args){

        //setting sleep time value for Threads and load time for driver timeout
        //int sleepTime =  --NOT USED ON THIS SCRIPT
        int loadTime = 20;

    // ************** Selenium Hands On 2 ***************

        //1. create new chrome driver object using WebDriverFactory from utils
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. set up page load time limit
        driver.manage().timeouts().pageLoadTimeout(loadTime, TimeUnit.SECONDS);

        //3. go to google
        driver.get("https://www.google.com");

        //4. find search field element
        WebElement myElement = driver.findElement(By.name("q"));

        //5. enter search string in element
        myElement.sendKeys("Luis Miguel");

        //6. enter ENTER key stroke on element
        myElement.sendKeys(Keys.ENTER);

        //7. close browser
        driver.close();



    }

}
