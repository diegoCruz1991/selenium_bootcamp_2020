package seleniumHandsOnTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise5 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //open google in current window
        driver.get("https://www.facebook.com");
        assert driver.getCurrentUrl().equals("https://www.facebook.com"): "No es la pagina de facebook";

        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passField = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.id("loginbutton"));

        emailField.sendKeys("alexfuser@hotmail.com");

        passField.sendKeys("password");

        loginButton.click();

        Thread.sleep(30000);

        WebElement searchTextbox = driver.findElement(By.name("q"));

        searchTextbox.sendKeys("QA Minds");

        searchTextbox.submit();


        Thread.sleep(10000);


        driver.close();

    }
}
