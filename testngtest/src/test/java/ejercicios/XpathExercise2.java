package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class XpathExercise2 {

    public static void main(String[] args) throws InterruptedException {
        File chromeFilePath = new File("src/test/resources/drivers/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        //Other way to execute the driver
        //WebDriver driver = WebDriverFactory.getDriver("chrome");

        WebDriver myDriver = new ChromeDriver();

        myDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        myDriver.get("https://www.amazon.com.mx/");

        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> xpathex = myDriver.findElements(By.xpath("//a"));
        for (WebElement x : xpathex) {
            String text = x.getText();
            System.out.println("Todos los elementos de a: " + x.getText());
        }

        List<WebElement> headlist = myDriver.findElements(By.xpath("//head/child::*"));
        for (WebElement list : headlist) {
            String text = list.getText();
            System.out.println("Lista de elementos hijos de head: " + list.getText());
        }

        myDriver.close();

    }
}