package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class LocatorsExercise2 {


        public static void main(String[] args) throws InterruptedException{
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.get("https://www.google.com.mx");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            WebElement searchBox = driver.findElement(By.id("as_word"));

            driver.close();

        }


    }
