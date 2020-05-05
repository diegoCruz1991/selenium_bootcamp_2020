package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchSeleniumWord {

    public static void main(String [] args) throws InterruptedException{

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://es.wikipedia.org/wiki/Selenium");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        List<WebElement> seleniumLinks = driver.findElements(By.xpath("//a[contains(text(),'selenium')]"));

        for (WebElement i : seleniumLinks){
            System.out.println(i.getText());
        }

        driver.close();

    }
}
