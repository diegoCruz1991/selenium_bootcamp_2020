package ejercicios;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

public class SeleniumHandsOn3 {
    public static void main (String[] args){
        WebDriver driver =  WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("http://wwww.facebook.com");
        driver.findElement(By.id("email")).sendKeys("hitomi_fanel06@hotmail.com");
        driver.findElement(By.id("pass")).sendKeys("Blur");
        WebElement searchElem = driver.findElement(By.id("loginbutton"));
        searchElem.submit();
        driver.close();


    }



}
