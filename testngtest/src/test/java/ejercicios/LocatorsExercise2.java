package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise2 {

    public static void main (String[] args) throws  InterruptedException{
        WebDriver myDriver= WebDriverFactory.getDriver("Chrome");
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //Entramos a google
        myDriver.navigate().to("https://www.google.com.mx/");
        // Esperamos 5 segundos
        //myDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        //Buscar un elemento que no exista
        WebElement boxSearch=myDriver.findElement(By.name("as_word"));

        myDriver.close();
    }
}
