package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

public class SeleniumHandsOn5 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver chrome = WebDriverFactory.getDriver("chrome");

        chrome.get("https://www.facebook.com/");

        assert chrome.getCurrentUrl().equals("https://www.facebook.com/") : "La pagina no es la misma";

        WebElement correo = chrome.findElement(By.name("email"));
        WebElement password = chrome.findElement(By.name("pass"));
        WebElement login = chrome.findElement(By.id("u_0_b"));

        correo.sendKeys("armando13mora@hotmail.com");
        password.sendKeys("Test");
        login.click();

        Thread.sleep(10000);

        WebElement searchBox = chrome.findElement(By.name("q"));
        searchBox.sendKeys("QA Minds");
        searchBox.submit();

        Thread.sleep(10000);

        chrome.close();
    }
}
