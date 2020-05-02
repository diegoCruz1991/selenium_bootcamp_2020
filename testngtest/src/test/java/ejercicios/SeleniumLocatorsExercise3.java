package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;

public class SeleniumLocatorsExercise3 {
    public static void main (String[] args) throws InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.get("https://www.nasa.gov");
        WebElement myElement = myDriver.findElement(By.partialLinkText("Missions"));
        System.out.println(myElement.getAttribute("href"));
        myElement = myDriver.findElement(By.partialLinkText("NASA TV"));
        System.out.println(myElement.getAttribute("href"));
        myElement = myDriver.findElement(By.partialLinkText("Mars"));
        System.out.println(myElement.getAttribute("href"));
        List<WebElement> listElements = myDriver.findElements(By.tagName("input"));
        System.out.println(listElements.size());
        Thread.sleep(4000);
        myDriver.close();
    }
}
