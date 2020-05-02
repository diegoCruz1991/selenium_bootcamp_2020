package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        myDriver.get("https://www.amazon.com.mx");
        Thread.sleep(10000);

        WebElement searchBox = myDriver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("yoda");
        searchBox.submit();

        Thread.sleep(10000);

        myDriver.close();
    }
}
