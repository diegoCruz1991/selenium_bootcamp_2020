package ejercicios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;

public class SeleniumExercise3 {
    public static void main (String[] args) throws InterruptedException{
        //Define location of Firefox driver
        File browserFilePath = new File("src/test/resources/drivers/chromedriver.exe"); //geckodriver.exe *-* chromedriver.exe

        //Set where to search for Firefoxdriver
        System.setProperty("webdriver.chrome.driver", browserFilePath.getPath()); //webdriver.gecko.driver *-* webdriver.chrome.driver

        //Create new instance of Firefox driver
        WebDriver myDriver = new ChromeDriver(); //FirefoxDriver() *-* ChromeDriver()

        //Open google in current window
        myDriver.navigate().to("https://www.google.com.mx");
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().to("https://www.w3schools.com");
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().to("https://www.espn.com.mx");
        System.out.println(myDriver.getCurrentUrl());

        myDriver.navigate().back();
        myDriver.navigate().back();
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().forward();
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().refresh();
        System.out.println(myDriver.getCurrentUrl());

        //Wait, keep window open
        Thread.sleep(2000);

        //Close current window
        myDriver.close();
    }
}
