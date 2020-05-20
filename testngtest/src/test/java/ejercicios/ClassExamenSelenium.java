package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;
import java.util.List;

public class ClassExamenSelenium {
    public static void main (String[] args) throws  InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("Chrome");
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        myDriver.navigate().to("https://es.wikipedia.org/wiki/Selenium");

        List<WebElement> listaTextos=myDriver.findElements(By.xpath("//*[contains(text(),'selenium')]"));

        for (WebElement x:listaTextos) {
            if(x.getAttribute("href")!=null) {
                System.out.println(x.getAttribute("href"));
            }
        }
        myDriver.close();

    }
}
