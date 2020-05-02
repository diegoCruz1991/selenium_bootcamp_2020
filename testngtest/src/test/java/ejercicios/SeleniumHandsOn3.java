package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

public class SeleniumHandsOn3 {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.facebook.com");

        WebElement emailBox = driver.findElement(By.id("email"));
        WebElement passField = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.id("loginbutton"));
        emailBox.sendKeys("uribenski@gmail.com");
        passField.sendKeys("pass");
        loginButton.click();

        Thread.sleep(5000);
        driver.close();

    }
}
