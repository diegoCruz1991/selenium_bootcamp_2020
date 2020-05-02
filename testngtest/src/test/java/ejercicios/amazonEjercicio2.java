package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class amazonEjercicio2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("https://www.amazon.com.mx/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> listOfLinks =  driver.findElements(By.xpath("//body//a"));
        for (WebElement link: listOfLinks){
            System.out.println(link.getAttribute("href"));
        }
        List<WebElement> child =  driver.findElements(By.xpath("//head/*"));
        int count=0;
        for (WebElement c: child){
            System.out.println(count++ +" <> " +c.getAttribute("text"));
        }


    }
}
