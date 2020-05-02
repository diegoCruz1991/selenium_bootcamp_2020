package ejercicios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class ByClass {

        public static void main () throws InterruptedException {

            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.get("http://www.mercadolibre.com.mx");
            WebElement searchElem = driver.findElement(By.name("as_word"));
            WebElement searchPro = driver.findElement(By.className("item__info-link item__js-link"));
            searchElem.sendKeys("Selenium");
            searchPro.submit();

            Thread.sleep(9000);
            driver.close();


        }



    }



