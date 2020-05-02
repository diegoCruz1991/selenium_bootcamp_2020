package ejercicios;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class SeleniumExercise4 {
    public static void main (String[] args) throws InterruptedException {

        //define location of firefox driver
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver");

        //Set where to search for firefox driver
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());

        //create new instance of firefox driver

        WebDriver myDriver = new FirefoxDriver();


        //open google in current window
        myDriver.get("https://www.youtube.com.mx");

        WebElement myElement = myDriver.findElement(By.xpath("//input[@id='search']"));

        if (myElement.isDisplayed() && myElement.isEnabled()){
            System.out.println("OK");


            myElement.sendKeys("Selenium");

            WebElement myIconElement = myDriver.findElement(By.id("search-icon-legacy"));

            myIconElement.click();

            Thread.sleep(5000);



        }

        myDriver.close();
    }

}
