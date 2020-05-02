package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise3 {

    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.nasa.gov");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement missionLink = driver.findElement(By.linkText("Missions"));
        System.out.println(missionLink.getAttribute("href"));
        System.out.println("Hello");

        WebElement nasaTvLink = driver.findElement(By.linkText("NASA TV"));
        System.out.println(nasaTvLink.getAttribute("href"));

        WebElement marsLink = driver.findElement(By.partialLinkText("Moon to Mars"));
        System.out.println(marsLink.getAttribute("href"));

        List<WebElement> inputList = driver.findElements(By.tagName("input"));
        System.out.println(inputList);

        List<WebElement> linkList = driver.findElements(By.tagName("a"));

        for (WebElement i: linkList){
            try {
                System.out.println(i.getAttribute("href"));
            }
            catch (Exception e){
                System.out.println(" hyperlink not found");
            }
        }


        driver.close();

    }
}
