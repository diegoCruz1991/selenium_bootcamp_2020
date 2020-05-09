package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class LocatorsExercise2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver chrome = WebDriverFactory.getDriver("chrome");

        chrome.get("https://www.google.com.mx/");

        assert chrome.getCurrentUrl().equals("https://www.google.com.mx/") : "La pagina no es la misma";

        chrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement element = chrome.findElement(By.className("test"));
    }
}
