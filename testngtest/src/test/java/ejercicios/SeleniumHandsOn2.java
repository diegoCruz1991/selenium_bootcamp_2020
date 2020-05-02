package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.WebDriverFactory;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn2 {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        String URL= "https://www.google.com";
        driver.get(URL);

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");
        searchBox.submit();

        Thread.sleep(5000);
        driver.close();

    }

}
