package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.WebDriverFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver chrome = WebDriverFactory.getDriver("chrome");

        chrome.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        chrome.get("https://www.google.com.mx");

        assert chrome.getCurrentUrl().equals("https://www.google.com.mx"): "No es la misma pagina";

        WebElement searchBox = chrome.findElement(By.name("q"));
        searchBox.sendKeys("Testing");
        searchBox.submit();
        chrome.close();
    }
}
