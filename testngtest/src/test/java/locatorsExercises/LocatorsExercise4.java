package locatorsExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise4 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        //open google in current window
        driver.get("https://es.wikipedia.org/wiki/Portada");
        assert driver.getCurrentUrl().equals("https://es.wikipedia.org/wiki/Portada"): "No es la pagina de nasa ";

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement searchText = driver.findElement(By.linkText("Portada"));

        System.out.println(searchText.getAttribute("href"));

        List<WebElement> searchNasaText = driver.findElements(By.partialLinkText("Página"));

        for (WebElement i:searchNasaText) {
            System.out.println(i.getText() + i.getAttribute("href"));
        }



        List<WebElement> searchTagName = driver.findElements(By.tagName("button"));

        for (WebElement i:searchTagName) {

            System.out.println(i.getText() );
        }
        System.out.println(searchTagName.size());


        Thread.sleep(40000);

        driver.close();

    }
}
