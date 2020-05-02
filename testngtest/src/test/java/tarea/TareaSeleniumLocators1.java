package tarea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TareaSeleniumLocators1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //open google in current window
        driver.get("https://www.mercadolibre.com.mx");
        assert driver.getCurrentUrl().equals("https://www.mercadolibre.com.mx"): "No es la pagina de mercadolibre";

        WebElement searchTextbox = driver.findElement(By.name("as_word"));

        searchTextbox.sendKeys("Selenium");

        WebElement searchButton = driver.findElement(By.className("nav-search-btn"));

        searchButton.click();


        Thread.sleep(10000);

        WebElement product = driver.findElement(By.className("main-title"));

        product.click();

        Thread.sleep(30000);

        driver.close();

    }
}
