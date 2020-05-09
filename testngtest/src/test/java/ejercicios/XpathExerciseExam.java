package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class XpathExerciseExam {

    public static void main(String[] args) throws InterruptedException {
        File chromeFilePath = new File("src/test/resources/drivers/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        //Other way to execute the driver
        //WebDriver driver = WebDriverFactory.getDriver("chrome");

        WebDriver myDriver = new ChromeDriver();

        myDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        myDriver.get("https://es.wikipedia.org/wiki/Selenium");

        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> xpathex = myDriver.findElements(By.xpath("//a[contains(text(),'selenium')]"));
        for (WebElement x : xpathex) {
            String text = x.getText();
            System.out.println("Todos los elementos de a: " + x.getText());
        }
        myDriver.close();

    }
}