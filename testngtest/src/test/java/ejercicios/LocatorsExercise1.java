package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class LocatorsExercise1 {

    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.mercadolibre.com.mx");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        WebElement searchBox = driver.findElement(By.name("as_word"));
        searchBox.sendKeys("Selenium");

        WebElement searchButton = driver.findElement(By.className("nav-search-btn"));
        searchButton.click();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement firstProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("lazy-load")));
        firstProduct.click();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        Thread.sleep(5000);
        driver.close();

    }


}
