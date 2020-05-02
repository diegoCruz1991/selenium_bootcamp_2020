package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class xpathEx1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        myDriver.get("https://www.amazon.com.mx");
        Thread.sleep(3000);

        List<WebElement> allelemA = myDriver.findElements(By.xpath("//a"));
        for(WebElement hl : allelemA){
            System.out.println("E1: " + hl.getText());
        }

        List<WebElement> allelemH = myDriver.findElements(By.xpath("//head/child::*"));
        for(WebElement hl : allelemH){
            System.out.println("E2: " + hl.getText());
        }

        myDriver.close();
    }
}
