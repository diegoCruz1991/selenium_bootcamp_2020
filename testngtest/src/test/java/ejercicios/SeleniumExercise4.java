package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SeleniumExercise4 {
    public static void main (String[] args) throws InterruptedException {
        //Define location of Firefox driver
        File browserFilePath = new File("src/test/resources/drivers/chromedriver.exe"); //geckodriver.exe *-* chromedriver.exe

        //Set where to search for Firefoxdriver
        System.setProperty("webdriver.chrome.driver", browserFilePath.getPath()); //webdriver.gecko.driver *-* webdriver.chrome.driver

        //Create new instance of Firefox driver
        WebDriver myDriver = new ChromeDriver(); //FirefoxDriver() *-* ChromeDriver()

        myDriver.navigate().to("https://youtube.com");

        WebElement myElement = myDriver.findElement(By.xpath("//input[@id='search']"));
        if (myElement.isDisplayed())
            System.out.println("Search Container is Displayed");
        else
            System.out.println(("Search Container is Not Displayed"));

        if (myElement.isEnabled())
            System.out.println("Search Container is Enable");
        else
            System.out.println("Search Container is Not Enable");

        myElement.sendKeys("Selenium");
        myElement = myDriver.findElement(By.id("search-icon-legacy"));
        myElement.click();
        Thread.sleep(5000);
        myDriver.close();
    }
}
