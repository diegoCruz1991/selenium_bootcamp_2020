package ejercicios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExamenEjercicio {
    public static void main (String[] args){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://es.wikipedia.org/wiki/Selenium");

        List<WebElement> allwords = driver.findElements(By.linkText("Selenium"));

        for (WebElement text:allwords){
            System.out.println(text.getText()+ "_" + text.getAttribute("hrfe"));

        }

        driver.close();



    }


}
