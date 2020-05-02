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

        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        myDriver.get("https://www.google.com");
        System.out.println("URL = " + myDriver.getCurrentUrl());
        assert myDriver.getCurrentUrl().equals("https://www.google.com"):"no es google";

        Thread.sleep(2000);

        WebElement searchBox = myDriver.findElement(By.name("q"));
        searchBox.sendKeys("Hola que hace");
        searchBox.submit();

        Thread.sleep(5000);

        myDriver.close();
    }
}
