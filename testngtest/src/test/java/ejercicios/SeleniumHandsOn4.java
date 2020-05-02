package ejercicios;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

public class SeleniumHandsOn4 {
    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("http://www.amazon.com.mx");
        WebElement searchElem = driver.findElement(By.id("twotabsearchtextbox"));
        searchElem.sendKeys("Selenium");
        searchElem.submit();
        Thread.sleep(1000);
        driver.close();




    }



}
