package ejercicios;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

public class SeleniumHandsOn2 {
    public static void main (String[] args) {
        /*System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();*/
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("http://google.com.mx");
        assert driver.getCurrentUrl().equals("http://www.google.com.mx"):"No es Google";
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        WebElement searchElem = driver.findElement(By.name("q"));
        searchElem.sendKeys("Pugs");
        searchElem.submit();
        driver.close();
    }
}
