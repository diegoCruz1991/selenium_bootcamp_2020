package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class XpathExercise2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver chrome = WebDriverFactory.getDriver("chrome");

        chrome.get("https://www.amazon.com.mx");

        assert chrome.getCurrentUrl().equals("https://www.amazon.com.mx") : "La pagina no es la misma";

        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> xpath1 =chrome.findElements(By.xpath("//a"));

        for (WebElement i: xpath1) {
            System.out.println(i.getText());
        }

        List<WebElement> xpath2 = chrome.findElements(By.xpath("//head/child::*"));

        for (WebElement j: xpath2) {
            System.out.println(j.getText());
        }
    }
}
