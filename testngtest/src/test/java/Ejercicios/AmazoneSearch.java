package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class AmazoneSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        myDriver.get("https://www.amazon.com.mx/");

        Thread.sleep(10000);
        WebElement txtSearchBox = myDriver.findElement(By.id("twotabsearchtextbox"));

        txtSearchBox.sendKeys("Selenium");
        txtSearchBox.submit();
        Thread.sleep(10000);
        myDriver.close();



    }

}
