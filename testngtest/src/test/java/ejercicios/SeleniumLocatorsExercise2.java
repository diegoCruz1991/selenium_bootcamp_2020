package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumLocatorsExercise2 {
    public static void main(String[] args) {
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.get("https://www.google.com.mx");
        myDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement myElement = myDriver.findElement(By.id("JustAnInvalidID"));
        myDriver.close();
    }
}
