package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

public class SeleniumLocatorsExercise1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.get("https://mercadolibre.com.mx");
        WebElement myElement = myDriver.findElement(By.name("as_word"));
        myElement.sendKeys("Selenium");
        myElement = myDriver.findElement(By.className("nav-search-btn"));
        myElement.click();
        Thread.sleep(4000);
        myElement = myDriver.findElement(By.className("main-title"));
        myElement.click();
        Thread.sleep(4000);
        myDriver.close();
    }
}
