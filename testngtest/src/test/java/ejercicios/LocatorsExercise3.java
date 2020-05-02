package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise3 {

    public static void main(String[] args) throws InterruptedException {
        File chromeFilePath = new File("src/test/resources/drivers/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        //Other way to execute the driver
        //WebDriver driver = WebDriverFactory.getDriver("chrome");

        WebDriver myDriver = new ChromeDriver();

        myDriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        myDriver.get("https://www.nasa.gov/");

        WebElement missions = myDriver.findElement(By.linkText("Missions"));
        System.out.println(missions.getAttribute("href"));

        WebElement nasaTv = myDriver.findElement(By.linkText("NASA TV"));
        System.out.println(nasaTv.getAttribute("href"));

        WebElement mars = myDriver.findElement(By.partialLinkText("Moon to Mars"));
        System.out.println(mars.getAttribute("href"));

        List<WebElement> inputs = myDriver.findElements(By.tagName("input"));
        System.out.println(inputs.size());


        Thread.sleep(5000);

        myDriver.close();

    }
}
