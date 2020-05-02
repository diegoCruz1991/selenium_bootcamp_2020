package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.List;

public class MercadoLibre {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("https://www.mercadolibre.com.mx/");
        driver.manage().window().maximize();
        WebElement mlSearchBox = driver.findElement(By.name("as_word"));
        mlSearchBox.sendKeys("Selenium");
        WebElement mlSearchButton = driver.findElement(By.className("nav-search-btn"));
        mlSearchButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("main-title")));
        List<WebElement> listOfProducts = driver.findElements(By.className("main-title"));
        System.out.println(listOfProducts.get(0).getText());
        listOfProducts.get(0).click();
        driver.quit();
    }
}
