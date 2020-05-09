package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class NasaLinks {
    public static void main(String[] args){
        WebDriver myDirver = WebDriverFactory.getDriver("Chrome");
        myDirver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myDirver.get("https://www.nasa.gov/");

        WebElement txtHyperLink = myDirver.findElement(By.linkText("Missions"));
        System.out.println(txtHyperLink.getAttribute("href"));

        WebElement linkNasaTv = myDirver.findElement(By.linkText("NASA TV"));
        System.out.println(txtHyperLink.getAttribute("href"));

        WebElement linkMars = myDirver.findElement(By.partialLinkText("Mars"));
        System.out.println(txtHyperLink.getAttribute("href"));

        List<WebElement> elementsHref = myDirver.findElements(By.tagName("input"));

        System.out.println(elementsHref);

    }
}
