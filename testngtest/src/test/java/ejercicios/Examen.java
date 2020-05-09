package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Examen {


    public static void main(String[] args) throws InterruptedException {

        //***Variable que se usara como contador y suma total***//
        int c1 = 0;

        WebDriver chrome = WebDriverFactory.getDriver("chrome");

        chrome.get("https://es.wikipedia.org/wiki/Star_Wars");

        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> p1 = chrome.findElements(By.partialLinkText("animación"));
        List<WebElement> p2 = chrome.findElements(By.partialLinkText("película"));
        List<WebElement> p3 = chrome.findElements(By.partialLinkText("George"));
        List<WebElement> p4 = chrome.findElements(By.partialLinkText("Jedi"));
        List<WebElement> p5 = chrome.findElements(By.partialLinkText("Luke"));

        System.out.println("Las palabras se repiten el siguiente numero de veces: \n");

        //***Funcion que recorre toda la lista y suma la cantidad de veces que se repite la palabra animación e imprime la suma total***//
        for (WebElement i1 : p1) {

            i1.getText().contains("animación");

            if (i1.getText().contains("animación") == true) {
                c1++;
            }
        }
        System.out.println("animación - " + c1 + " veces");

        //***Funcion que recorre toda la lista y suma la cantidad de veces que se repite la palabra película e imprime la suma total***//
        for (WebElement i2 : p2) {

            i2.getText().contains("película");

            if (i2.getText().contains("película") == true) {
                c1++;
            }
        }
        System.out.println("película - " + c1 + " veces");

        //***Funcion que recorre toda la lista y suma la cantidad de veces que se repite la palabra George e imprime la suma total***//
        for (WebElement i3 : p3) {

            i3.getText().contains("George");

            if (i3.getText().contains("George") == true) {
                c1++;
            }
        }
        System.out.println("George - " + c1 + " veces");

        //***Funcion que recorre toda la lista y suma la cantidad de veces que se repite la palabra Jedi e imprime la suma total***//
        for (WebElement i4 : p4) {

            i4.getText().contains("Jedi");

            if (i4.getText().contains("Jedi") == true) {
                c1++;
            }
        }
        System.out.println("Jedi - " + c1 + " veces");

        //***Funcion que recorre toda la lista y suma la cantidad de veces que se repite la palabra Luke e imprime la suma total***//
        for (WebElement i5 : p5) {

            i5.getText().contains("Luke");

            if (i5.getText().contains("Luke") == true) {
                c1++;
            }
        }
        System.out.println("Luke - " + c1 + " veces");

    }
}
//List<WebElement> link1 = chrome.findElements(By.partialLinkText("selenium"));

//for (WebElement i : link1) {
//    System.out.println(i.getText());
//}
