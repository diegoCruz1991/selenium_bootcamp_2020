package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver chrome = WebDriverFactory.getDriver("chrome");

        chrome.get("https://www.nasa.gov/");

        assert chrome.getCurrentUrl().equals("https://www.nasa.gov/") : "La pagina no es la misma";

        chrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement h1 = chrome.findElement(By.partialLinkText("Missions"));
        WebElement h2 = chrome.findElement(By.partialLinkText("NASA TV"));
        WebElement h3 = chrome.findElement(By.partialLinkText("Mars"));

        System.out.println(h1.getAttribute("href"));
        System.out.println(h2.getAttribute("href"));
        System.out.println(h3.getAttribute("href"));

        List<WebElement> inputs = chrome.findElements(By.tagName("input"));
        System.out.println(inputs.size());




    }
}
