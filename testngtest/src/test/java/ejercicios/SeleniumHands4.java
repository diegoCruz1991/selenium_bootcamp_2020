package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;
import java.util.concurrent.TimeUnit;

public class SeleniumHands4 {
    public static void main (String[] args) throws  InterruptedException{
        WebDriver myDriver= WebDriverFactory.getDriver("Chrome");
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //Entra a amazon
        myDriver.navigate().to("https://www.amazon.com.mx/");

        //Hace la búsqueda de Selenium
        WebElement searchElement=myDriver.findElement(By.id("twotabsearchtextbox"));
        searchElement.sendKeys("Selenium");
        searchElement.submit();

        //Espera 10 segundos
        Thread.sleep(10000);

        //Cierra driver
        myDriver.close();
    }
}
