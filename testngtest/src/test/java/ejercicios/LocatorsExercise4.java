package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise4 {


    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement portadaLink = driver.findElement(By.linkText("Portada"));
        System.out.println(portadaLink.getAttribute("href"));

        List<WebElement> webpagesList = driver.findElements(By.partialLinkText("Página"));
        System.out.println(webpagesList.get(0).getText());

        for (WebElement i: webpagesList){
            try {
                System.out.println(i.getText());
                System.out.println(i.getAttribute("href"));
            }
            catch (Exception e){
                System.out.println(" No text found");
            }
        }

        List<WebElement> buttonList = driver.findElements(By.tagName("button"));

        System.out.println(buttonList.get(0).getAttribute("title"));

        driver.close();

    }
}
