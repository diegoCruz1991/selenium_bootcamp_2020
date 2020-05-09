package seleniumHandsOnTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //open google in current window
        driver.get("https://www.amazon.com");
        assert driver.getCurrentUrl().equals("https://www.amazon.com"): "No es la pagina de facebook";

        WebElement searchTextbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchTextbox.sendKeys("Selenium");
        searchTextbox.submit();

        Thread.sleep(10000);

        driver.close();

    }
}
