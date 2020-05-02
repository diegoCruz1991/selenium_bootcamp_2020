package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Tarea1 {

    public static void main (String [] arg) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");


        driver.get("https://www.mercadolibre.com.mx");


        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        /*WebElement lenguaje = driver.findElement(By.xpath("//a[@href='/https://www.mercadolibre.com.mx\']"));
        lenguaje.click();*/


        WebElement textField = driver.findElement(By.name("as_word"));
        textField.sendKeys("Selenium");

        WebElement searchField = driver.findElement(By.className("nav-icon-search"));
        searchField.click();

       WebElement Producto = driver.findElement(By.xpath("//a[@href='/html/body/main/div[1]/div/section/ol/li[1]/div/a']"));
       Producto.click();




        Thread.sleep(2000);
        driver.close();
    }



}
