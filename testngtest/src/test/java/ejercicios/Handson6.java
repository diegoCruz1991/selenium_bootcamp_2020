package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Handson6 {

    public static void main(String[] arg) throws InterruptedException{
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
        WebDriver myDriver = new FirefoxDriver();
        myDriver.navigate().to("https://www.nasa.gov");
        WebElement mission = myDriver.findElement(By.linkText("Missions"));
        System.out.println(mission.getAttribute("href"));
        WebElement tv = myDriver.findElement(By.linkText("NASA TV"));
        System.out.println(tv.getAttribute("href"));
        WebElement mars = myDriver.findElement(By.partialLinkText("Mars"));
        System.out.println(mars.getAttribute("href"));

        myDriver.close();
    }
}
