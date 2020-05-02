package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;

public class SeleniumLocatorsExercise4 {
    public static void main (String[] args) throws InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.get("https://es.wikipedia.org/wiki/Portada");
        WebElement myElement = myDriver.findElement(By.partialLinkText("Portada"));
        System.out.println(myElement.getAttribute("href"));
        List<WebElement> listElements = myDriver.findElements(By.partialLinkText("Página"));
        System.out.println(listElements.size());
        for(int i=0; i<listElements.size(); i++) {
            System.out.println(listElements.get(i).getAttribute("href"));
        }
        listElements = myDriver.findElements(By.tagName("button"));
        System.out.println(listElements.size());
        for(int i=0; i<listElements.size(); i++) {
            System.out.println(listElements.get(i).getText());
        }

        Thread.sleep(4000);
        myDriver.close();
    }
}
