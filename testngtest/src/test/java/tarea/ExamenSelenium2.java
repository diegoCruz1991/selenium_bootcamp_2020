package tarea;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExamenSelenium2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        //open google in current window
        driver.get(" https://es.wikipedia.org/wiki/Star_Wars ");
        assert driver.getCurrentUrl().equals(" https://es.wikipedia.org/wiki/Star_Wars "): "No es la pagina de wikipedia ";

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        List<WebElement> elementsList = driver.findElements(By.xpath("//*[text()[contains(., 'animación')]] "));
        System.out.println("animación - " + elementsList.size() + " veces");

        List<WebElement> elementsList2 = driver.findElements(By.xpath("//*[text()[contains(., 'película')]] "));
        System.out.println("película - " + elementsList2.size() + " veces");
/*
        System.out.println("-------------------------------------------PELICULA-----------");
        for (WebElement i:elementsList2) {
            System.out.println(i.getText());
        }
*/
        List<WebElement> elementsList3 = driver.findElements(By.xpath("//*[text()[contains(., 'George')]] "));
        System.out.println("George - " + elementsList3.size() + " veces ");

        List<WebElement> elementsList4 = driver.findElements(By.xpath("//*[text()[contains(., 'Jedi')]] "));
        System.out.println("Jedi - " + elementsList4.size() + " veces");

        List<WebElement> elementsList5 = driver.findElements(By.xpath("//*[text()[contains(., 'Luke')]] "));
        System.out.println("Luke - " + elementsList5.size() + " veces");

        Thread.sleep(100000);

        driver.close();

    }
}
