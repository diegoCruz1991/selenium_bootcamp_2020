package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class LocatorsEx2 {

    public static void main(String[]args) throws InterruptedException{

        String googlePath = "https://www.google.com.mx/";
        String elementPath = "invalid";

        WebDriver driver = new WebDriverFactory().getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to(googlePath);
        WebElement element = driver.findElement(By.id(elementPath));

        Thread.sleep(1000);

        driver.close();
    }
}
