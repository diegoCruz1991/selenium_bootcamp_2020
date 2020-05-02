package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class XPATHEx2 {

    public static void main(String[]args){

        WebDriver driver = new WebDriverFactory().getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://www.amazon.com.mx/");
        List<WebElement> aElements = driver.findElements(By.xpath("//a"));
        System.out.println("Size element with 'a': " + aElements.size());

        for (WebElement i : aElements) {
            System.out.println("Elements with 'a': " + i.getText());
        }

        List<WebElement> childHead = driver.findElements(By.xpath("//head/*"));
        System.out.println("Size element with 'a': " + childHead.size());

        for (WebElement i : childHead) {
            System.out.println("Kids of head: " + i.getText());
        }

    }
}
