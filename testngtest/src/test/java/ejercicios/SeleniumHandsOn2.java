package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.WebDriverFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn2 {
    public static void main(String[] args){
       WebDriver myDriver = WebDriverFactory.getDriver("chrome");
       myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        myDriver.navigate().to("https://www.google.com");
        assert myDriver.getCurrentUrl().equals("https://www.google.com"): "No es la página de Google D: ";

        WebElement myElement = myDriver.findElement(By.name("q"));
        myElement.sendKeys("Esperanto");
        myElement.submit();
        myDriver.close();
    }
}
