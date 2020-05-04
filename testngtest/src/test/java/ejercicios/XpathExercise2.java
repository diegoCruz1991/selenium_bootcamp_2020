package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class XpathExercise2 {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com.mx");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> links = driver.findElements(By.xpath("//a"));

        for (WebElement i : links){
            System.out.println(i.getText());
        }

        List<WebElement> headElementsChildren = driver.findElements(By.xpath("//head/*"));

        for (WebElement i : headElementsChildren){
            System.out.println(i.getText());
        }

        driver.close();

    }
}
