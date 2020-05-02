package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.List;

public class ejercicioWikipedia {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("https://es.wikipedia.org/wiki/Portada");
        //driver.manage().window().maximize();
        WebElement linkPortada = driver.findElement(By.linkText("Portada"));
        System.out.println(linkPortada.getAttribute("href"));
        List<WebElement> listLinks = driver.findElements(By.partialLinkText("Página"));
        for(int i=0; i<listLinks.size();i++){
            System.out.println(listLinks.get(i).getAttribute("href"));
        }
        List<WebElement> listbtns = driver.findElements(By.tagName("button"));
        for(int i=0; i<listbtns.size();i++){
            System.out.println(listbtns.get(i).getAttribute("title"));
        }
        driver.quit();
    }
}
