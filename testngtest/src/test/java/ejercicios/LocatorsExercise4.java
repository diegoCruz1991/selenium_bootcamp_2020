package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;
import java.util.List;

import java.util.concurrent.TimeUnit;

public class LocatorsExercise4 {
    public static void main (String[] args) throws  InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("Chrome");
        myDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        //Entramos a wikipedia
        myDriver.navigate().to("https://es.wikipedia.org/wiki/Portada");

        //Buscar hyperlink Portada
        WebElement portada=myDriver.findElement(By.linkText("Portada"));
        System.out.println("Portada  " + portada.getAttribute( "href"));

        //Buscar hyperlinks Página
        List<WebElement> pagina=myDriver.findElements(By.partialLinkText("Página"));
        if(pagina.size()>0) {
            for (WebElement i:pagina) {
                System.out.println("Página: "+i.getText() + i.getAttribute("href"));
            }
        }
        //Buscar elementos con el atributo button
        List<WebElement> buttons=myDriver.findElements(By.tagName("button"));
        if(buttons.size()>0) {
            for (WebElement x:buttons) {
                System.out.println("Botones:  "+x.getText() + x.getAttribute("href"));
            }
        }

        myDriver.close();

    }
}
