package locatorsExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        //open google in current window
        driver.get("https://www.nasa.gov");
        assert driver.getCurrentUrl().equals("https://www.nasa.gov"): "No es la pagina de nasa ";

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement searchText = driver.findElement(By.linkText("Missions"));

        System.out.println(searchText.getAttribute("href"));

        WebElement searchNasaText = driver.findElement(By.linkText("NASA TV"));

        System.out.println(searchNasaText.getAttribute("href"));

        WebElement searchMarsText = driver.findElement(By.partialLinkText("Mars"));

        System.out.println(searchMarsText.getAttribute("href"));

        List<WebElement> searchTagName = driver.findElements(By.tagName("input"));
        System.out.println(searchTagName.size());


        Thread.sleep(40000);

        driver.close();

    }

}
