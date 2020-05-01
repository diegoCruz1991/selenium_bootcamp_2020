package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SeleniumEx4 {

    public static void main(String[] args) throws InterruptedException {

        File rootPath = new File("src/test/resources/drivers/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", rootPath.getPath());

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.youtube.com/");
        WebElement searchBar = driver.findElement(By.xpath("//input[@id='search']"));
        searchBar.click();

        if (searchBar.isDisplayed()) {
            System.out.println("Isdisplayed");
        } else {
            System.out.println("IsNOTdisplayed");
        }
        searchBar.sendKeys("Selenium");
        WebElement searchButton = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        searchBar.click();

        Thread.sleep(1000);

        driver.close();
    }
}