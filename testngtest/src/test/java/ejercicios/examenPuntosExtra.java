package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.List;

public class examenPuntosExtra {
    public static void main(String[] args) throws InterruptedException {
        countWords();
    }

    public static void countWords(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("https://es.wikipedia.org/wiki/Star_Wars");
        List<WebElement> listOfWords = driver.findElements(By.cssSelector("//*[contains(text(),'animación') or contains(text(),'película') or contains(text(),'George') or  contains(text(),'Jedi') or  contains(text(),'Luke') ]")); //to incluide Selenium and selenium
        //List<WebElement> listOfWords = driver.findElements(By.xpath("//*[contains(text(),'animación') or contains(text(),'película') or contains(text(),'George') or  contains(text(),'Jedi') or  contains(text(),'Luke') ]")); //to incluide Selenium and selenium
        int animacion =0, pelicula = 0, george = 0, jedi=0, luke = 0;
        for (WebElement word: listOfWords){
            if(word.getText().contains("animación")){
                animacion++;
            }
            if(word.getText().contains("película")){
                pelicula++;
            }
            if(word.getText().contains("George")){
                george++;
            }
            if(word.getText().contains("Jedi")){
                jedi++;
            }
            if(word.getText().contains("Luke")){
                luke++;
            }

        }
        System.out.println("animación - " + animacion + " veces");
        System.out.println("película - " + pelicula + " veces");
        System.out.println("George - " + george + " veces");
        System.out.println("Jedi - " + jedi + " veces");
        System.out.println("Luke - " + luke + " veces");
        driver.quit();
    }
}
