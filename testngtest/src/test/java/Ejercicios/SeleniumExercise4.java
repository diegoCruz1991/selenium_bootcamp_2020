package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.WebDriverFactory;

import java.io.File;

public class SeleniumExercise4 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverFactory.getDriver("chrome");


        WebDriver myDriver = new ChromeDriver();
        myDriver.get("https://www.google.com/");
        WebElement mySearch = myDriver.findElement(By.name("q"));

        Thread.sleep(1000);
        if(myDriver.getCurrentUrl().equals("https://www.google.com/") )
        {
            mySearch.sendKeys("Selenium");
            mySearch.submit();
        }
        Thread.sleep(2000);
        myDriver.close();
    }
}
