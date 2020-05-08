package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CssEx1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        myDriver.get("https://es.wikipedia.org/wiki/Selenium");
        Thread.sleep(3000);


        List<WebElement> linksSelAll = myDriver.findElements(By.cssSelector("div div"));
        System.out.println(linksSelAll.size());




        myDriver.close();
    }
}
