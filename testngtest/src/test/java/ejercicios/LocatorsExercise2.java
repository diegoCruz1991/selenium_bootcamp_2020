package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise2 {

    public static void main(String[] args) throws InterruptedException {
        File chromeFilePath = new File("src/test/resources/drivers/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        //Other way to execute the driver
        //WebDriver driver = WebDriverFactory.getDriver("chrome");

        WebDriver myDriver = new ChromeDriver();

        myDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        myDriver.get("https://www.google.com.");

        myDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        WebElement invalidelement = myDriver.findElement(By.id("JustAnInvalidID"));

        Thread.sleep(5000);

        myDriver.close();

    }
}
