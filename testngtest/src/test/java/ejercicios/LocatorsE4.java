package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsE4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        myDriver.get("https://es.wikipedia.org/wiki/Portada");
        Thread.sleep(3000);


        WebElement portLink = myDriver.findElement(By.linkText("Portada"));
        System.out.println("un elemento =  \n" + portLink.getAttribute("href"));

        List<WebElement> pagLinkAll = myDriver.findElements(By.partialLinkText("página"));

        for (WebElement a : pagLinkAll)
            System.out.println("todos elementos = \n" + a.getAttribute("href") + " " + a.getText());


        Thread.sleep(10000);

        List<WebElement> buttonkAll = myDriver.findElements(By.tagName("button"));
        for (WebElement b : buttonkAll)
            System.out.println("boton = \n" + b.getText());

        myDriver.close();
    }
}
