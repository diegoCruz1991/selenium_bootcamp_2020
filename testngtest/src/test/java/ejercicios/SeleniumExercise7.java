package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SeleniumExercise7 {

    public static void main(String[] args) throws InterruptedException {
        File chromeFilePath = new File("src/test/resources/drivers/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        //WebDriver driver = WebDriverFactory.getDriver("chrome");

        WebDriver myDriver = new ChromeDriver();

        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        myDriver.get("http://amazon.com");
        System.out.println("This is the Current URL of the page:" + " " + myDriver.getCurrentUrl());

        assert myDriver.getCurrentUrl().equals("www.amazon.com"): "No es la página de Amazon";

        WebElement searchbox = myDriver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("Selenium");
        searchbox.submit();

        Thread.sleep(10000);

        myDriver.close();

    }
}
