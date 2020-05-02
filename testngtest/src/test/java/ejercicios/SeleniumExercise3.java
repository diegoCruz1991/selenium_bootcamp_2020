package ejercicios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class SeleniumExercise3 {

    public static void main(String [] args) throws InterruptedException{
        //Define location of Chrome driver
        File chromeFilePath = new File ("src/test/resources/drivers/chromedriver" );

        //Set where to search for Chrome driver
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        // Create new instance of Chrome Driver
        WebDriver myDriver = new ChromeDriver();

        myDriver.navigate().to("https://www.google.com");

        System.out.println(myDriver.getCurrentUrl());

        myDriver.navigate().to("https://www.facebook/com");
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

        myDriver.close();


    }

}
