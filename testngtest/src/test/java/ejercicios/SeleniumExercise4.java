package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SeleniumExercise4 {

    public static void main(String[] args) throws InterruptedException{

        File chromeFilePath = new File ("src/test/resources/drivers/chromedriver" );
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com");

        WebElement searchBar = driver.findElement(By.xpath("//input[@id='search']"));

        searchBar.isDisplayed();
        searchBar.isEnabled();

        searchBar.sendKeys("Selenium");

        WebElement buttonElement = driver.findElement(By.id("search-icon-legacy"));
        buttonElement.click();

        Thread.sleep(5000);

        driver.close();

    }

}
