package ejercicios;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise4 {
    public static void main (String[] args){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://es.wikipedia.org/wiki/Portada");
        assert driver.getCurrentUrl().equals("https://es.wikipedia.org/wiki/Portada"): "Pagina Correcta";

        //Buscar Link Portada
        WebElement searchPortada = driver.findElement(By.linkText("Portada"));
        System.out.println(searchPortada.getAttribute("hrfe"));

        List<WebElement> alllinks = driver.findElements(By.linkText("Página"));
        for(WebElement link:alllinks){
            System.out.println(link.getText()+ "_" + link.getAttribute("hrfe"));
        }

        List<WebElement> allbuttonElem = driver.findElements(By.tagName("button"));
        for (WebElement button:allbuttonElem){
            System.out.println(button.getText()+ "_" + button.getAttribute("hrfe"));

        }

        driver.close();
    }

}
