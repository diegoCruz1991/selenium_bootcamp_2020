package Ejercicios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;

public class SeleniumExercise1 {
    public static void main(String[] args) throws InterruptedException {
        //Define FireFox geckoDriver location
        File firefox_path = new File("src/test/resources/drivers/geckodriver.exe");
        //Set where to search GeckoDriver
        System.setProperty("webdriver.gecko.driver", firefox_path.getPath());
        //Create new Instance of FireFox
        WebDriver myDriver = new FirefoxDriver();
        //Open Google in Current Window
        myDriver.get("https://google.com.mx");
        //Wait
        Thread.sleep(1000);
        //
        System.out.println("Page Title "+myDriver.getTitle());
        System.out.println("Current URL: " +myDriver.getCurrentUrl());
        System.out.println("Source Code\n"+myDriver.getPageSource());
        //Close current WIndow
        myDriver.close();

    }

}
