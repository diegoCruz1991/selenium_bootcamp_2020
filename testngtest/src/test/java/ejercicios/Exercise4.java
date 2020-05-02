package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

public class Exercise4 {
    public static void main(String[] args) throws InterruptedException {
        File chromeFilePath = new File("src/test/resources/drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver",chromeFilePath.getPath());

        WebDriver myDriver = new ChromeDriver();

        myDriver.get("https://www.youtube.com");
        System.out.println("URL = " + myDriver.getCurrentUrl());

        Thread.sleep(5000);

        WebElement search = myDriver.findElement(By.name("search_query"));

        assert search.isDisplayed():"is not displayed";
        assert search.isEnabled():"no ta enabled";

        search.sendKeys("Selenium");
        Thread.sleep(3000);


        WebElement buttonS = myDriver.findElement(By.id("search-icon-legacy"));
        buttonS.click();

        Thread.sleep(5000);

        myDriver.close();
    }
}
