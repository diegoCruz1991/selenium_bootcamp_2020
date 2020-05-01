package Ejercicios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class SeleniumExercise3 {
    public static void main(String[] args) throws InterruptedException {
        //Define ChromeDriver location
        File chromeDriver_path = new File("src/test/resources/drivers/chromedriver.exe");
        //Set where to search ChromeDriver
        System.setProperty("webdriver.chrome.driver", chromeDriver_path.getPath());
        //Create new Instance of Chrome
        WebDriver myDriver = new ChromeDriver();
        //Open Google in Current Window
        myDriver.get("https://google.com.mx");
        System.out.println("Current URL: " + myDriver.getCurrentUrl());
        myDriver.get("https://twitter.com");
        System.out.println("Current URL: " + myDriver.getCurrentUrl());
        myDriver.get("https://espn.com.mx");
        System.out.println("Current URL: " + myDriver.getCurrentUrl());
        System.out.println("First Back");
        myDriver.navigate().back();
        System.out.println("Second Back");
        myDriver.navigate().back();
        System.out.println("Current URL: " + myDriver.getCurrentUrl());
        System.out.println("Primer Fordward");
        myDriver.navigate().forward();
        System.out.println("Refresh");
        myDriver.navigate().refresh();
        System.out.println("Current URL: " + myDriver.getCurrentUrl());
        //Wait
        Thread.sleep(1000);
        //Close current Window
        myDriver.close();
    }
}
