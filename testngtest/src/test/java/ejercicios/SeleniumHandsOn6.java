package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn6 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        myDriver.get("https://www.wikipedia.org/");
        Thread.sleep(3000);


        WebElement searchBox = myDriver.findElement(By.id("searchInput"));
        searchBox.sendKeys("Selenium");


        List<WebElement> results = myDriver.findElements(By.id("search-results-disclaimers"));

                for (WebElement a : results)
                  System.out.println(a);


        Thread.sleep(10000);

        myDriver.close();
    }
}
