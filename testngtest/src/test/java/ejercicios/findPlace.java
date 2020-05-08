package ejercicios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class findPlace {
    public static void main (String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.inaturalist.org/places");
        assert driver.getCurrentUrl().equals("https://www.inaturalist.org/places") : "No es la Misma Pagina";


        WebElement searchPlace = driver.findElement(By.id("q"));
        searchPlace.sendKeys("Colomos, Guadalajara");
        Thread.sleep(1000);

        WebElement searchButton = driver.findElement(By.name("commit"));
        searchButton.submit();
        Thread.sleep(1000);

        WebElement elemenone = driver.findElement(By.cssSelector("#browsingtaxa > ul > li > ul > li > ul > li:nth-child(1) > a"));
        elemenone.click();





    }




}
