package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsE2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        myDriver.get("https://www.nasa.gov");

        WebElement searchBox = myDriver.findElement(By.name("q1"));
        searchBox.sendKeys("Selenium");

        myDriver.close();
    }
}
