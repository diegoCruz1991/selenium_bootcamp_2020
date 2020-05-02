package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise6 {

    public static void main (String[] args) throws InterruptedException {

        //setting sleep time value for Threads and load time for driver timeout
        int sleepTime =  20000;
        int loadTime = 30;

        //1. create new chrome driver object using WebDriverFactory from utils
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. set up page load time limit
        driver.manage().timeouts().pageLoadTimeout(loadTime, TimeUnit.SECONDS);

        //3. go to Facebook
        driver.get("https://es-la.facebook.com/");

        //4. obtain elements for email and password fields as well as login button
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passField = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.id("loginbutton"));

        //5. entering email, password on their corresponding fields, and click on the Login button
        emailField.sendKeys("correo@gmail.com");
        passField.sendKeys("abcdef");
        loginButton.click();

        //6. putting thread to sleep
        Thread.sleep(sleepTime);

        //7. closing browser.
        driver.close();



    }

}
