package ejercicios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class LocatorsExercise1 {
    public static void main (String[] args){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("http://www.mercadolibre.com.mx");
        WebElement searchElem = driver.findElement(By.className("nav-search-input"));
        searchElem.sendKeys("Selenium");
        searchElem.submit();






    }



}
