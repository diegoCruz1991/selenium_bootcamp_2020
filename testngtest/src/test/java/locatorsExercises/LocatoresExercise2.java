package locatorsExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class LocatoresExercise2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        //open google in current window
        driver.get("https://www.google.com");
        assert driver.getCurrentUrl().equals("https://www.google.com"): "No es la pagina de facebook";

        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        WebElement searchId = driver.findElement(By.id("JustAnInvalidadID"));

        //Thread.sleep(40000);

        driver.close();

    }
}
