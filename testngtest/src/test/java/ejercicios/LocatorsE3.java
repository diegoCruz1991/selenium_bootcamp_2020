package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class LocatorsE3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        myDriver.get("https://www.nasa.gov");

        WebElement hiperLinkM = myDriver.findElement(By.linkText("Missions"));
        System.out.println(hiperLinkM.getAttribute("href"));

        WebElement hiperLinkN = myDriver.findElement(By.linkText("NASA TV"));
        System.out.println(hiperLinkM.getAttribute("href"));

        WebElement hiperLinkMars = myDriver.findElement(By.partialLinkText("Mars"));
        System.out.println(hiperLinkMars.getAttribute("href"));

        WebElement tagnameIn = myDriver.findElement(By.tagName("input"));
        System.out.println(hiperLinkM.getAttribute("href"));

        myDriver.close();
    }
}
