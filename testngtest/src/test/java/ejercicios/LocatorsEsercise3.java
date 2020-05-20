package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;
import java.util.List;

public class LocatorsEsercise3 {
    public static void main (String[] args) throws  InterruptedException{
        WebDriver myDriver= WebDriverFactory.getDriver("Chrome");
        myDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        //Entramos a nasa
        myDriver.navigate().to("https://www.nasa.gov/");
        // Esperamos 5 segundos
        myDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Buscar hyperlink missions
        WebElement missions=myDriver.findElement(By.linkText("Missions"));
        System.out.println("Missions" + missions.getAttribute( "href"));

        WebElement nasaTV=myDriver.findElement(By.partialLinkText("NASA TV"));
        System.out.println("Nasa TV "+nasaTV.getAttribute("href"));

        WebElement mars=myDriver.findElement(By.partialLinkText("Mars"));
        System.out.println("Mars"+mars.getAttribute("href"));

        List<WebElement> inputs=myDriver.findElements(By.linkText("input"));

        //System.out.println(inputs.length());

        myDriver.close();
    }
}
