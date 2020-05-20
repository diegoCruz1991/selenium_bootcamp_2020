package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class XPathExercise2 {
    public static void main (String[] args) throws  InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("Chrome");

        //Entramos a amazon
        myDriver.navigate().to("https://www.amazon.com.mx");

        myDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        List<WebElement> xPathA= myDriver.findElements(By.xpath("//a"));
        for (WebElement i:xPathA)
        {
            System.out.println("A: "+i.getText());
        }

        List<WebElement> xPathHead= myDriver.findElements(By.xpath("//head/child::*"));
        for (WebElement x:xPathHead)
        {
            System.out.println("HEAD: "+x.getText());
        }

        myDriver.close();

    }
}
