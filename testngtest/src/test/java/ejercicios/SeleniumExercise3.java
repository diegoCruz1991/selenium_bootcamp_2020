package ejercicios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class SeleniumExercise3 {

    public static void main (String[] args) throws InterruptedException {

        //setting sleep time value (customizable)
        int sleepTime = 20000;
        
        /*
        1. state drivers root path
        2. state path and driver file for chrome browser
        3. set up chrome driver
         */

        File rootPath = new File("src/test/resources/drivers");

        File chromeFilePath = new File(rootPath, "chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());


        //Create new driver as chrome driver
        WebDriver myDriver = new ChromeDriver();

        /* 1. Go to google, then facebook, then Wikipedia (print current URL for each)
         2. go backwards twice and print current URL
         3. go forward once and print current URL
         4. Refresh the page and print current URL
         5. Close browser
         */

        //***********Step 1*************
        myDriver.get("https://www.google.com.mx");


        Thread.sleep(sleepTime);

        System.out.println(myDriver.getCurrentUrl());

        myDriver.navigate().to("https://es-la.facebook.com");

        Thread.sleep(sleepTime);

        System.out.println(myDriver.getCurrentUrl());

        myDriver.navigate().to("https://www.wikipedia.org");

        Thread.sleep(sleepTime);

        System.out.println(myDriver.getCurrentUrl());

        //***********Step 2*************

        myDriver.navigate().back();

        Thread.sleep(sleepTime);

        myDriver.navigate().back();

        Thread.sleep(sleepTime);

        System.out.println(myDriver.getCurrentUrl());

        //***********Step 3*************

        myDriver.navigate().forward();

        Thread.sleep(sleepTime);

        System.out.println(myDriver.getCurrentUrl());

        //***********Step 4*************

        myDriver.navigate().refresh();

        Thread.sleep(sleepTime);

        System.out.println(myDriver.getCurrentUrl());

        Thread.sleep(sleepTime);

        //***********Step 5*************

        myDriver.close();

    }


}
