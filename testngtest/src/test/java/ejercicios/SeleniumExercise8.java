package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise8 {

    public static void main(String[] args) throws InterruptedException{

        //setting sleep time value for Threads and load time for driver timeout
        int sleepTime =  20000;
        int loadTime = 20;

        //1. create new chrome driver object using WebDriverFactory from utils
        WebDriver driver = WebDriverFactory.getDriver("firefox");

        //2. set up page load time limit
        driver.manage().timeouts().pageLoadTimeout(loadTime, TimeUnit.SECONDS);

        //3. go to Facebook
        driver.get("https://es-la.facebook.com");

        //4. obtain elements for email and password fields as well as login button
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passField = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.id("loginbutton"));

        //5. entering email, password on their corresponding fields, and click on the Login button
        emailField.sendKeys("mail@gmail.com");
        passField.sendKeys("pass");
        loginButton.click();

        //6. putting thread to sleep
        Thread.sleep(sleepTime);

        //6. obtain element for search field
        WebElement searchField = driver.findElement(By.name("q"));

        //7. entering search string and key in ENTER
        searchField.sendKeys("QA Minds");
        searchField.sendKeys(Keys.ENTER);

        //8. putting thread to sleep
        Thread.sleep(sleepTime);

        //9. closing browser.
        driver.close();


    }

}
