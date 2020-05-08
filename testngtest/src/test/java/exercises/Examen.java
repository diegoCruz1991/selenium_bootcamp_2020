package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Examen {

    public static void main (String[] args){

        WebDriver driver = new WebDriverFactory().getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        seleiumElement(driver);
        starWars(driver);

        driver.close();
    }
    public static void seleiumElement (WebDriver driver){
        driver.navigate().to("https://es.wikipedia.org/wiki/Selenium");

        List<WebElement> selenium = driver.findElements(By.partialLinkText("selenium"));

        for (WebElement elements : selenium) {
            System.out.println("Links que contengan 'selenium': " + elements.getText() + elements.getAttribute("href"));
        }
    }

    public static void starWars (WebDriver driver){

        driver.navigate().to("https://es.wikipedia.org/wiki/Star_Wars");

        List<WebElement> animacion = driver.findElements(By.xpath("//*[contains (text(), 'animación')]"));
        System.out.println("Animacion - " + animacion.size() + " veces");

        List<WebElement> animacion2 = driver.findElements(By.xpath("//*[text()[contains(., 'animación')]]"));
        System.out.println("Animacion2 - " + animacion2.size() + " veces");

        List<WebElement> animacion3 = driver.findElements(By.xpath("//*[contains (string(), 'animación')]"));
        System.out.println("Animacion3 - " + animacion3.size() + " veces");

        for (WebElement i : animacion) {
            System.out.println("animacion: "+ i.getText());
        }

        for (WebElement i : animacion2) {
            System.out.println("animacion2: "+ i.getText());
        }

//        System.out.println("Animacion3: " + animacion3.get(0).getText());
//        for (WebElement i : animacion3) {
//            System.out.println("animacion3: " + i.getAttribute("href"));
//        }

        List<WebElement> pelicula = driver.findElements(By.xpath("//*[contains (string(), 'película')]"));
        System.out.println("Pelicula - " + pelicula.size() + " veces");

        List<WebElement> george = driver.findElements(By.xpath("//*[contains (string(), 'George')]"));
        System.out.println("George - " + george.size() + " veces");

        List<WebElement> jedi = driver.findElements(By.xpath("//*[contains (string(), 'Jedi')]"));
        System.out.println("Jedi - " + jedi.size() + " veces");

//        for (WebElement i : jedi) {
//            System.out.println("Jedi: " + i.getAttribute("href") + i.getText());
//        }

        List<WebElement> luke = driver.findElements(By.xpath("//*[contains (string(), 'Luke')]"));
        System.out.println("Luke - " + luke.size() + " veces");
    }
}
