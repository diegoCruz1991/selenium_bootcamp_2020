package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.WebDriverFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SeleniumExercise5 {

    public static void main(String[] args) throws InterruptedException {
        File chromeFilePath = new File("src/test/resources/drivers/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        //WebDriver driver = WebDriverFactory.getDriver("chrome");

        WebDriver myDriver = new ChromeDriver();

        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        myDriver.get("http://google.com.mx");
        System.out.println("This is the Current URL of the page:" + " " + myDriver.getCurrentUrl());

        assert myDriver.getCurrentUrl().equals("http://google.com.mx"): "No es la página de google";

        WebElement searchbox = myDriver.findElement(By.name("q"));

        searchbox.sendKeys("Automatización de pruebas");
        searchbox.submit();

        Thread.sleep(5000);

        myDriver.close();

    }
}
