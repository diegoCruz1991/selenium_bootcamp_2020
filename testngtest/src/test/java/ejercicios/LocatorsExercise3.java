package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class LocatorsExercise3 {
    public static void main (String[] args){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.nasa.gov");
        assert driver.getCurrentUrl().equals("http://www.nada.gov"): "Pagina Correcta";

        //Web Elements

        WebElement searchhypermission = driver.findElement(By.linkText("Missions"));
        System.out.println(searchhypermission.getAttribute("hrfe"));

        WebElement searchhypertext = driver.findElement(By.linkText("NASA TV"));
        System.out.println(searchhypertext.getAttribute("hrfe"));

        WebElement searchhypermars = driver.findElement(By.partialLinkText("Mars"));
        System.out.println(searchhypermars.getAttribute("hrfe"));

        WebElement searchtagelem = driver.findElement(By.tagName("input"));
        System.out.println(searchtagelem.getAttribute("hrfe"));

        driver.close();




    }



}
