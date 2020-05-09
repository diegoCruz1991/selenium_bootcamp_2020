package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args){
        WebDriver myDirver = WebDriverFactory.getDriver("Chrome");
        myDirver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myDirver.get("https://es.wikipedia.org/wiki/Star_Wars");

        //WebElement divChilds = myDirver.findElement(By.xpath());

       /* WebElement txtHyperLink = myDirver.findElement(By.linkText("Portada"));
        System.out.println(txtHyperLink.getAttribute("href"));*/





        List<WebElement> txtanimacion = myDirver.findElements(By.partialLinkText("animacion"));
        for(WebElement btn:txtanimacion) {
            System.out.println(btn.getText());
        }

        List<WebElement> txtLuke = myDirver.findElements(By.partialLinkText("Luke"));
        for(WebElement btn:txtLuke) {
            System.out.println(btn.getText());
        }

        myDirver.close();

    }

}
