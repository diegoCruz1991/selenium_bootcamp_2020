package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;

public class SeleniumExercise4 {
    public static void main(String[] args) throws InterruptedException {
        //Define Chrome geckoDriver location
        File chromeDriver_path = new File("src/test/resources/drivers/chromedriver.exe");
        //Set where to search ChromeDriver
        System.setProperty("webdriver.chrome.driver", chromeDriver_path.getPath());
        //Create new Instance of Chrome
        WebDriver myDriver = new ChromeDriver();
        //Open Youtube in Current Window
        myDriver.get("https://youtube.com");
        //Print Current URL
        System.out.println("Current URL: " + myDriver.getCurrentUrl());
        WebElement barra = myDriver.findElement(By.xpath("//input[@id='search']\n"));
        System.out.println("Is the element enable? "+barra.isEnabled());
        if(barra.isEnabled()){
            barra.sendKeys("Selenium");
            WebElement button = myDriver.findElement(By.id("search-icon-legacy"));
            button.click();
            Thread.sleep(5000);
        }
        else {
            System.out.println("Element not available");
        }

        //Close current Window
        myDriver.close();
    }
}
