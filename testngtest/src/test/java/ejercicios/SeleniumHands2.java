package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;
import java.util.concurrent.TimeUnit;

public class SeleniumHands2 {
    public static void main (String[] args) throws  InterruptedException{
        // Da de alta el driver
        WebDriver myDriver= WebDriverFactory.getDriver("Chrome");
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //Entra a Google
        myDriver.navigate().to("https://www.google.com.mx/");

        //Revisa que la URL sea la que se pidió accesar
        assert myDriver.getCurrentUrl().equals("https://www.google.com.mx/"): "La dirección está mal";

        //Busca el elemento donde se pone el  texto para buscar y le asigna el valor de Selenium en la búsqueda.
        WebElement searchElement=myDriver.findElement(By.name("q"));
        searchElement.sendKeys("Selenium");
        searchElement.submit();

        // Cierra el driver
        myDriver.close();
    }
}
