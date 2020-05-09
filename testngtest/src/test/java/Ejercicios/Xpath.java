package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Xpath {
    public static void main(String[] args) {
        WebDriver myDirver = WebDriverFactory.getDriver("Chrome");
        //espera a que la pagina termine de cargar
        myDirver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //Espera a que todos los elementos de la pagina terminen de cargar
        myDirver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myDirver.get("https://www.amazon.com.mx/");

       //crea una lista de elementos con todos los que coincidan con el xpath "<a>"
       List<WebElement> xPath = myDirver.findElements(By.xpath("//a"));

        for(WebElement a: xPath){
            System.out.println(a.getText());

        }

        List<WebElement> xPath2 = myDirver.findElements(By.xpath("//head/*"));
        for(WebElement head: xPath2){
            System.out.println(head.getText());

        }

        myDirver.close();


        }
    }
