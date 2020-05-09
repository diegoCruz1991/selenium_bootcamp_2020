package tarea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExamenSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        //open google in current window
        driver.get("https://es.wikipedia.org/wiki/Selenium");
        assert driver.getCurrentUrl().equals("https://es.wikipedia.org/wiki/Selenium"): "No es la pagina de wikipedia ";

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        List<WebElement> elementsList = driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));




        for (WebElement i:elementsList) {
            System.out.println(i.getAttribute("href"));
        }

        Thread.sleep(100000);

        driver.close();

    }

}
