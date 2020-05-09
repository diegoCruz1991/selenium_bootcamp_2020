package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise4 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver chrome = WebDriverFactory.getDriver("chrome");

        chrome.get("https://es.wikipedia.org/wiki/Portada");

        assert chrome.getCurrentUrl().equals("https://es.wikipedia.org/wiki/Portada") : "La pagina no es la misma";

        chrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement element1 = chrome.findElement(By.linkText("Portada"));
        System.out.println("Link Portada: " + element1.getAttribute("href"));

        List<WebElement> links = chrome.findElements(By.partialLinkText("Página"));

        System.out.println("Número de links: " + links.size());

        for (WebElement temp: links) {
            System.out.println("Link Página:" + temp.getAttribute("href"));
        }

        WebElement tags = chrome.findElement(By.partialLinkText("button"));
        System.out.println(tags.getText());


    }
}
