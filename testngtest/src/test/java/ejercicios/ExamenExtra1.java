package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExamenExtra1 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        myDriver.get("https://es.wikipedia.org/wiki/Star_Wars");
        Thread.sleep(3000);


        List<WebElement> textAni = myDriver.findElements(By.xpath("//*[contains(.,'animacion')]"));
        System.out.println("animacion" + " " + textAni.size());

        List<WebElement> textpali = myDriver.findElements(By.xpath("//*[contains(.,'película')]"));
        System.out.println("pelicula" + " " + textpali.size());

        List<WebElement> textg = myDriver.findElements(By.xpath("//*[contains(.,'George')]"));
        System.out.println("George" + " " + textg.size());

        List<WebElement> textj = myDriver.findElements(By.xpath("//*[contains(.,'Jedi')]"));
        System.out.println("Jedi" + " " + textj.size());

        List<WebElement> textl = myDriver.findElements(By.xpath("//*[contains(.,'Luke')]"));
        System.out.println("Luke" + " " + textl.size());


        myDriver.close();
    }
}
