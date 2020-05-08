package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class xpathEx2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        myDriver.get("https://www.amazon.com.mx");
        Thread.sleep(3000);

        List<WebElement> firstDiv= myDriver.findElements(By.xpath("//body/div[1]"));
        System.out.println(firstDiv.size());
        List<WebElement> lastDiv= myDriver.findElements(By.xpath("//body/div[last()]"));
        System.out.println(lastDiv.size());
        List<WebElement> atriRole= myDriver.findElements(By.xpath("//*[@role='navigation']"));
        System.out.println(atriRole.size());
        List<WebElement> navclass= myDriver.findElements(By.xpath("//*[contains(@class, 'nav')]"));
        System.out.println(navclass.size());
        // List<WebElement> typenavclass= myDriver.findElements(By.xpath("//*[contains(@type, 'submit') and [@class, 'nav-input'])]"));
        // System.out.println(typenavclass.size());

        myDriver.close();
    }
}
