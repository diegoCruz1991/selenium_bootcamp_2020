package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise7 {

    public static void main (String[] args) throws InterruptedException{

        //setting sleep time value for Threads and load time for driver timeout
        int sleepTime =  20000;
        int loadTime = 20;

        //1. create new chrome driver object using WebDriverFactory from utils
        WebDriver driver = WebDriverFactory.getDriver("firefox");

        //2. set up page load time limit
        driver.manage().timeouts().pageLoadTimeout(loadTime, TimeUnit.SECONDS);

        //3. go to Amazon Mexico
        driver.get("https://www.amazon.com.mx");

        //4. find search field element
        WebElement field = driver.findElement(By.id("twotabsearchtextbox"));

        //5. enter search string in element and key in Enter
        field.sendKeys("Selenium");
        field.sendKeys(Keys.ENTER);

        //6. Put thread to sleep
        Thread.sleep(sleepTime);

        //7. closing browser
        driver.close();

    }
}
