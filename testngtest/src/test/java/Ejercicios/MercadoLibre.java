package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class MercadoLibre {
    public static void main(String[] args) throws InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        myDriver.get("https://www.mercadolibre.com.mx/");

        Thread.sleep(5000);
        WebElement txtSearchBox = myDriver.findElement(By.name("as_word"));
        WebElement btnSearch = myDriver.findElement(By.className("nav-icon-search"));

        txtSearchBox.sendKeys("Selenium");
        btnSearch.click();
        Thread.sleep(5000);
        WebElement firstProduct = myDriver.findElement(By.className("main-title"));
        firstProduct.click();
        Thread.sleep(10000);
        myDriver.close();



    }
}
