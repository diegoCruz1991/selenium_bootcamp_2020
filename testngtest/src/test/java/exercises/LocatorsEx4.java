package exercises;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsEx4 {

    public static void main(String[]args) throws  InterruptedException{

        String wikiURL = "https://es.wikipedia.org/wiki/Portada";
        WebElement portada ;
        List<WebElement> pagina;
        List<WebElement> button;

        WebDriver driver = new WebDriverFactory().getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to(wikiURL);

        portada = driver.findElement(By.linkText("Portada"));
        System.out.println("Portada href: " + portada.getAttribute("href"));

        pagina = driver.findElements(By.partialLinkText("Página"));
        System.out.println("Total de links pagina: " + pagina.size() );

        for (WebElement i :pagina
             ) {
            System.out.println("Print all href: " + i.getAttribute("href"));
        }

        button = driver.findElements(By.tagName("button"));
        System.out.println("Total de links button: " + button.size());

        for (WebElement i:button) {
            System.out.println("Link de button: " + i);
        }

        Thread.sleep(5000);
        driver.close();
    }
}
