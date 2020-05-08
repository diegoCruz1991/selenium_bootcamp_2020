package ejercicios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn07 {
    public static void main (String[] args){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Abre browser
        driver.get("https://www.amazon.com.mx");
        assert driver.getCurrentUrl().equals("https://www.amazon.com.mx");

        WebElement searchbar = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        searchbar.sendKeys("Nintendo Switch");
        searchbar.click();

        WebElement checkbox = driver.findElement(By.cssSelector("div[class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']"));
        checkbox.click();

        WebElement startselect = driver.findElement(By.cssSelector(""));
        checkbox.click();

    }


}
