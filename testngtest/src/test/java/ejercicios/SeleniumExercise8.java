package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SeleniumExercise8 {

    public static void main(String[] args) throws InterruptedException {
        File chromeFilePath = new File("src/test/resources/drivers/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        //WebDriver driver = WebDriverFactory.getDriver("chrome");

        WebDriver myDriver = new ChromeDriver();

        myDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        myDriver.get("http://facebook.com");
        System.out.println("This is the Current URL of the page:" + " " + myDriver.getCurrentUrl());

        assert myDriver.getCurrentUrl().equals("http://facebook.com"): "No es la página de Facebook";

        WebElement email = myDriver.findElement(By.id("email"));
        email.sendKeys("aquinoemail@hotmail.com");

        WebElement password = myDriver.findElement(By.id("pass"));
        password.sendKeys("Fakepass@");

        WebElement loginBtn = myDriver.findElement(By.id("loginbutton"));
        loginBtn.click();

        myDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        WebElement searchFbBox = myDriver.findElement(By.cssSelector("input.qypqp5cg"));
        searchFbBox.sendKeys("QA Minds");

        Thread.sleep(10000);

        myDriver.close();

    }
}
