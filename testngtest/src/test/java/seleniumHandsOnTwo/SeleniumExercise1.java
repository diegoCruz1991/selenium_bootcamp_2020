package seleniumHandsOnTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class SeleniumExercise1 {

    public static void main (String[] args) throws InterruptedException {

        //define location of firefox driver
        File chromeFilePath = new File("src/test/resources/drivers/chromedriver");

        //Set where to search for chrome driver
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        //create new instance of firefox driver
        WebDriver myDriver = new ChromeDriver();

        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //open google in current window
        myDriver.get("https://www.google.com");

        assert myDriver.getCurrentUrl().equals("https://www.google.com"): "No es la pagina de google";

        WebElement searchElement = myDriver.findElement(By.name("q"));

        searchElement.sendKeys("kimetsu no yaiba");

        searchElement.submit();

        Thread.sleep(2000);




        myDriver.close();
    }
}
