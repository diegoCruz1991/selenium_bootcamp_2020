package ejercicios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class SeleniumExercise1 {

    //Exercises 1 and 2

    public static void main (String[] args) throws InterruptedException{

        //setting sleep time value (customizable)
        int sleepTime = 4000;

        //determine root path for drivers
        File rootPath = new File("src/test/resources/drivers");

        //determine path and file name for chrome driver inside root path
        File chromeFilePath = new File(rootPath, "chromedriver.exe");


        //set up webdriver as chrome
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

            //create new webdriver object
            WebDriver myDriver = new ChromeDriver();

            //go to google.com
            myDriver.get("https://www.google.com.mx");

            //print page title
            System.out.println(myDriver.getTitle());

            //print current URL
            System.out.println(myDriver.getCurrentUrl());

            //print page source code
            System.out.println(myDriver.getPageSource());

            //put thread to sleep 1 sec
            Thread.sleep(sleepTime);

            //close driver
            myDriver.close();

    }

}
