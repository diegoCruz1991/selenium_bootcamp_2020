package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExam {

    public static void main(String[] args) throws InterruptedException {
        File chromeFilePath = new File("src/test/resources/drivers/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        //Other way to execute the driver
        //WebDriver driver = WebDriverFactory.getDriver("chrome");

        WebDriver myDriver = new ChromeDriver();

        myDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        myDriver.get("https://es.wikipedia.org/wiki/Star_Wars");

        List<WebElement> animation = myDriver.findElements(By.xpath("//*[contains(text(),'animación')]"));
        System.out.println("Animación " + animation.size() + " veces");

        List<WebElement> george = myDriver.findElements(By.xpath("//*[contains(text(),'George')]"));
        System.out.println("George: " + george.size() + " veces" );

        List<WebElement> movie = myDriver.findElements(By.xpath("//*[contains(text(),'película')]"));
        System.out.println("Película: " + movie.size() + " veces");

        List<WebElement> jedi = myDriver.findElements(By.xpath("//*[contains(text(),'Jedi')]"));
        System.out.println("Jedi: " + jedi.size() + " veces");

        List<WebElement> luke = myDriver.findElements(By.xpath("//*[contains(text(),'Luke')]"));
        System.out.println("Luke: " + luke.size() + " veces");

        myDriver.close();

    }
}