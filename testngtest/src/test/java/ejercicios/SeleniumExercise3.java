package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

public class SeleniumExercise3 {

    public static void main(String... args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.youtube.com/");

        Thread.sleep(1000);

        WebElement searchElement = driver.findElement(By.xpath("//input[@id = 'search']"));
        //WebElement searchElement = driver.findElement(By.name("search_query"));

        if (searchElement.isDisplayed() && searchElement.isEnabled()) {
            searchElement.sendKeys("Selenium");
            WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
            searchButton.click();
            Thread.sleep(5000);
        }

        driver.close();
        driver.quit();
    }
}
