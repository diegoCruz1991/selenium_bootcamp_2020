package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class LocatorsExcercise1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.mercadolibre.com.mx/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement searchBoxElement = driver.findElement(By.name("as_word"));

        searchBoxElement.sendKeys("PS4");

        WebDriverWait wait = new WebDriverWait(driver, 15);

        wait.until(ExpectedConditions.and(ExpectedConditions.presenceOfElementLocated(By.className("nav-search-btn")),
                ExpectedConditions.elementToBeClickable(By.className("nav-search-btn"))));

        WebElement searchBtnElement = driver.findElement(By.className("nav-search-btn"));

        searchBtnElement.click();

        WebElement firstProductElement = driver.findElement(By.className("main-title"));

        firstProductElement.click();

        Thread.sleep(3000);

        driver.close();

        driver.quit();
    }
}
