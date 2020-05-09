package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsEx4 {
    public static void main(String[] args){
        WebDriver myDirver = WebDriverFactory.getDriver("Chrome");
        myDirver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myDirver.get("https://es.wikipedia.org/wiki/Portada");

        WebElement txtHyperLink = myDirver.findElement(By.linkText("Portada"));
        System.out.println(txtHyperLink.getAttribute("href"));

        List<WebElement> txtPagina = myDirver.findElements(By.partialLinkText("Página"));

        for(WebElement pagina:txtPagina) {
            System.out.println(pagina.getText());
            System.out.println(pagina.getAttribute("href"));

        }

        List<WebElement> allButtons = myDirver.findElements(By.tagName("button"));
        for(WebElement btn:allButtons) {
            System.out.println(btn.getText());
        }

        myDirver.close();

    }
}
