package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class AmazonTest {

    public static void main(String... args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

        driver.get("https://www.amazon.com.mx/");

        WebElement amazonSearchInput = driver.findElement(By.id("twotabsearchtextbox"));

        amazonSearchInput.sendKeys("Nintendo Switch");

        Thread.sleep(3000);

        WebElement searchButton = driver.findElement(By.id("nav-search-submit-text"));

        searchButton.click();

        //amazonSearchInput.clear();

        Thread.sleep(2000);

        //Get Text

        driver.get("https://github.com/join?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");

        Thread.sleep(3000);

        WebElement parrafoRaro = driver.findElement(By.xpath("//*[@class = 'my-3 f6']"));

        System.out.println(parrafoRaro.getText());

        driver.close();

        driver.quit();
    }
}
