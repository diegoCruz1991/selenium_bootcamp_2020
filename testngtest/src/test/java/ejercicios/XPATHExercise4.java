package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;

public class XPATHExercise4 {

    public static void main(String... args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://es.wikipedia.org/wiki/Selenium");

        List<WebElement> listHyperlinks = driver.findElements(By.xpath("//a[contains(text(), 'Selenium')]"));

        int totalSize = listHyperlinks.size();

        int lastIndex = 0;

        while(lastIndex < totalSize) {

            //forma1
            WebElement listHyperlink = driver.findElement(By.xpath("//a[contains(text(), 'Selenium')][" + lastIndex+1 + "]"));

            listHyperlink.click();

            //forma2
            listHyperlinks = driver.findElements(By.xpath("//a[contains(text(), 'Selenium')]"));

            listHyperlinks.get(lastIndex).click();

            //forma1
            driver.findElement(By.xpath("//body/descendant::a/following-sibling::*"));

            //forma2
            /*List<WebElement> descendantsA = driver.findElements(By.xpath("//body/descendant::a"));

            for (WebElement webElement : descendantsA) {
               webElement.findElements(By.xpath("following-sibling::*"));
            }*/
            lastIndex++;

            driver.navigate().back();
        }
    }
}
