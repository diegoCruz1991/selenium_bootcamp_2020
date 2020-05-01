package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class HandsOn2 {

    public static void main(String[] args) throws InterruptedException {

        String googleURL = "https://www.google.com/";
        String facebookURL = "https://www.facebook.com/";
        String amazonURL = "https://www.amazon.com.mx/";

        WebDriver driver = WebDriverFactory.getDriver("chrome");

//google(driver,googleURL);
        facebook(driver, facebookURL);
//amazon(driver,amazonURL);

        driver.close();
    }

    public static void google(WebDriver driver, String url) throws InterruptedException {
        driver.navigate().to(url);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

        String currentUrl = driver.getCurrentUrl();
        assert driver.getCurrentUrl().equals(url) : "Noesigual";
        System.out.println("CurrentUrl:" + currentUrl);

        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("Breakinginbad");
        searchBar.sendKeys(Keys.ENTER);

        Thread.sleep(1000);
    }

    public static void facebook(WebDriver driver, String url) throws InterruptedException {
        driver.navigate().to(url);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

        WebElement correo = driver.findElement(By.id("email"));
        WebElement pass = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.id("loginbutton"));
        WebElement searchBox;

        correo.sendKeys("brandock4@gmail.com");
        pass.sendKeys("F4c3b00ck");
        loginButton.click();


        Thread.sleep(10000);

        searchBox = driver.findElement(By.xpath("//input[@type='search']"));
        searchBox.sendKeys("QAMinds");
        searchBox.sendKeys(Keys.ENTER);

        Thread.sleep(10000);

    }

    public static void amazon(WebDriver driver, String url) throws InterruptedException {

        driver.navigate().to(url);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();

        Thread.sleep(10000);
    }
}