package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class SeleniumExcersice3 {

        public static void main(String[] args) throws InterruptedException {
            File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");
            System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());

            WebDriver myDriver = new FirefoxDriver();
            myDriver.get("https://www.youtube.com/");
            Thread.sleep(4000);
            WebElement myElement = myDriver.findElement(By.xpath("//input[@id='search']"));
            WebElement myButton = myDriver.findElement(By.id("search-icon-legacy"));


            if(myElement.isDisplayed() && myElement.isEnabled()){

                myElement.click();
                Thread.sleep(1000);
                myElement.sendKeys("Selenium");
                myButton.click();

                Thread.sleep(5000);
                myDriver.close();


            }







        }
}
