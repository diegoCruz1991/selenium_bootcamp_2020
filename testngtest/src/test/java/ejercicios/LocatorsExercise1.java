package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise1 {
    public static void main (String[] args) throws  InterruptedException{
        WebDriver myDriver= WebDriverFactory.getDriver("Chrome");
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //Entramos a mercado libre
        myDriver.navigate().to("https://www.mercadolibre.com.mx/");

        myDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        //Introducimos el texto de Selenium en el box de búsqueda
        WebElement boxSearch=myDriver.findElement(By.name("as_word"));
        boxSearch.sendKeys("Selenium");

        //Dar click en buscar
        WebElement buttonSearch=myDriver.findElement(By.className("nav-icon-search"));
        buttonSearch.click();

        Thread.sleep(1000);

        WebElement olElement=myDriver.findElement(By.id("searchResults"));
        List<WebElement> liElements = olElement.findElements(By.tagName("li"));
        liElements.get(0).click();

        Thread.sleep(2000);
        myDriver.close();
    }
}
