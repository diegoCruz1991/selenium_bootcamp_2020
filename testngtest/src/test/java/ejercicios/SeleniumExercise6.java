package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SeleniumExercise6 {

    public static void main(String[] args) throws InterruptedException {
        File chromeFilePath = new File("src/test/resources/drivers/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        //WebDriver driver = WebDriverFactory.getDriver("chrome");

        WebDriver myDriver = new ChromeDriver();

        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        myDriver.get("http://facebook.com");
        System.out.println("This is the Current URL of the page:" + " " + myDriver.getCurrentUrl());

        assert myDriver.getCurrentUrl().equals("www.facebook.com"): "No es la página de Facebook";

        WebElement email = myDriver.findElement(By.id("email"));
        email.sendKeys("luis@gmail.com");

        WebElement password = myDriver.findElement(By.id("pass"));
        password.sendKeys("Luis123Fake");

        WebElement loginBtn = myDriver.findElement(By.id("loginbutton"));
        loginBtn.click();

        Thread.sleep(5000);

        myDriver.close();

    }
}
