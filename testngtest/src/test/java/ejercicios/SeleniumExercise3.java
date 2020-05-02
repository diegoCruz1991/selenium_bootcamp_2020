package ejercicios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.WebDriverFactory;
import java.util.concurrent.TimeUnit;


public class SeleniumExercise3 {

    public static void main (String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.youtube.com");
        System.out.println(driver.getCurrentUrl());
        driver.getTitle();
        WebElement searchElem = driver.findElement(By.xpath("//input[@id='search']"));
        searchElem.sendKeys("Selenium");
        searchElem.submit();
        Thread.sleep(1000);
        driver.quit();

    }


}
