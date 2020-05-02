package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SeleniumExercises4 {
    public static void main(String[] args) throws InterruptedException {

        File chromeFilePath = new File("src/test/resources/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        WebDriver chrome = new ChromeDriver();

        chrome.navigate().to("https://www.youtube.com.mx");
        Thread.sleep(5000);
        WebElement container = chrome.findElement(By.xpath("//input[@id='search']"));
        //chrome.findElements(By.id())
        System.out.println(container.isDisplayed());
        System.out.println(container.isEnabled());
        container.sendKeys("Selenium");
        WebElement icon = chrome.findElement(By.id("search-icon-legacy"));
        icon.click();
        Thread.sleep(5000);
        chrome.close();
    }


}
