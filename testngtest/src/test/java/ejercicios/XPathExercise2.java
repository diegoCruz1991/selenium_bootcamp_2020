package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class XPathExercise2 {
    public static void main (String[] args) throws InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        myDriver.get("https://www.amazon.com.mx");
        List <WebElement> myElements = myDriver.findElements(By.xpath("//a"));  //los tipo "a" son links
        System.out.println("Todos los tipo a");
        for (WebElement oneElement:myElements) {
            System.out.println(oneElement.getText());
        }

        myElements = myDriver.findElements(By.xpath("//head/*")); //Busca todos los hijos de head
        System.out.println("Todos los hijos de head");
        for (WebElement oneElement:myElements) {
            System.out.println(oneElement.getText());
        }

        Thread.sleep(4000);
        myDriver.close();
    }
}
