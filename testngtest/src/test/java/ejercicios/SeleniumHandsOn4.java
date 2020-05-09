package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn4 {

    public static void main(String[] args) throws InterruptedException{
        WebDriver chorme = WebDriverFactory.getDriver("chrome");

        chorme.get("https://www.amazon.com.mx/");

        chorme.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebElement searchBox = chorme.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("Selenium");
        searchBox.submit();

        Thread.sleep(10000);

        chorme.close();

    }
}
