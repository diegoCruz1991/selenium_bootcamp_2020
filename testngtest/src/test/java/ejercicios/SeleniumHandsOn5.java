package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn5 {


    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");

        WebElement emailBox = driver.findElement(By.id("email"));
        WebElement passField = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.id("loginbutton"));
        emailBox.sendKeys("uribenski@gmail.com");
        passField.sendKeys("pass");
        loginButton.click();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        Thread.sleep(30000);

        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys("QA Minds");
        searchTextBox.submit();

        Thread.sleep(10000);

        driver.close();

    }
}
