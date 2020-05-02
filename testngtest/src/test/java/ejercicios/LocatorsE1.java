package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsE1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver myDriver = WebDriverFactory.getDriver("firefox");
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        myDriver.get("https://www.mercadolibre.com.mx");
        Thread.sleep(1000);

        WebElement searchBox = myDriver.findElement(By.name("as_word"));
        searchBox.sendKeys("Selenium");

        WebElement searchButton= myDriver.findElement(By.className("nav-icon-search"));
        searchButton.click();

        Thread.sleep(2000);
// con los tres funciona
       // List<WebElement> result =  myDriver.findElements(By.xpath("/html/body/main/div/div/section/ol/li"));
       // System.out.println(result.size());
       // result.get(0).click();


      //  List<WebElement> result =  myDriver.findElements(By.cssSelector("#searchResults li"));
      //  System.out.println(result.size());
      //  result.get(0).click();

        List<WebElement> result =  myDriver.findElements(By.className("main-title"));
        System.out.println(result.size());
        result.get(6).click();

        Thread.sleep(3000);

        myDriver.close();
    }
}
