package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class CountStarWarsWords {
    public static void main(String[] args) throws InterruptedException {

        //Create new Instance of Chrome By WebDriverFactory
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //Set PageLoadTime
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // ***** TEST PROPERTIES *****
        // Target Page
        driver.get("https://es.wikipedia.org/wiki/Star_Wars");

        // ***** WEB ELEMENTS *****

        // ***** TEST STEPS *****
        //Print method
        System.out.println(countWords(driver));

        //Close current Window
        driver.close();
    }

    public static String countWords(WebDriver driver){
        StringBuilder sb = new StringBuilder();

        int cont_animacion = driver.findElements(By.xpath("//*[contains(text(),'animación')]")).size();
        int cont_pelicula = driver.findElements(By.xpath("//*[contains(text(),'película')]")).size();
        int cont_George = driver.findElements(By.xpath("//*[contains(text(),'George')]")).size();
        int cont_jedi = driver.findElements(By.xpath("//*[contains(text(),'jedi')]")).size();
        int cont_luke = driver.findElements(By.xpath("//*[contains(text(),'Luke')]")).size();

        sb.append("animación - "+cont_animacion+" times\n");
        sb.append("película - "+cont_pelicula+" times\n");
        sb.append("George - "+cont_George+" times\n");
        sb.append("Jedi - "+cont_jedi+" times\n");
        sb.append("Luke - "+cont_luke+" times\n");

        String response = sb.toString();
        return response;
    }

}
