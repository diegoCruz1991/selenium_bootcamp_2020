package ejercicios;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class LocatorsExercise2 {
    public static void main (String[] args){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("MY ID")));
        // Abre Browser
        driver.get("http://www.google.com.mx");
        assert driver.getCurrentUrl().equals("http://www.google.com.mx"): "Pagina Correcta";
        WebElement searchElem = driver.findElement(By.id("JustAnInvalidID"));
        searchElem.click();
        driver.close();




    }

}
