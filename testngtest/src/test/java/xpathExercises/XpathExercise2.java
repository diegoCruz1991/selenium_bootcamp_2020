package xpathExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.List;
import java.util.SimpleTimeZone;
import java.util.concurrent.TimeUnit;

public class XpathExercise2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        //open google in current window
        driver.get("https://www.amazon.com.mx");
        assert driver.getCurrentUrl().equals("https://www.amazon.com.mx"): "No es la pagina de amazon ";

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> findElementsA = driver.findElements(By.xpath("//a"));

        for (WebElement i: findElementsA){
            System.out.println(i.getText());
        }
        List<WebElement> findElementsHead = driver.findElements(By.xpath("//head/child::"));


        for (WebElement i:findElementsHead) {
            System.out.println(i.getText() + "Esto es head");

        }

        Thread.sleep(40000);

        driver.close();

    }
}
