package ejercicios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Exercise3 {
    public static void main(String[] args) throws InterruptedException {
        File chromeFilePath = new File("src/test/resources/drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver",chromeFilePath.getPath());

        WebDriver myDriver = new ChromeDriver();

        myDriver.get("https://www.google.com.mx");
        System.out.println("URL = " + myDriver.getCurrentUrl());

        Thread.sleep(2000);

        myDriver.navigate().to("http://www.facebook.com");
        System.out.println("URL = " + myDriver.getCurrentUrl());

        Thread.sleep(2000);

        myDriver.navigate().to("http://www.espn.com.mx");
        System.out.println("URL = " + myDriver.getCurrentUrl());


        Thread.sleep(2000);

        myDriver.navigate().back();
        myDriver.navigate().back();
        System.out.println("URL = " + myDriver.getCurrentUrl());

        Thread.sleep(2000);

        myDriver.navigate().forward();
        System.out.println("URL = " + myDriver.getCurrentUrl());

        Thread.sleep(2000);

        myDriver.navigate().refresh();
        System.out.println("URL = " + myDriver.getCurrentUrl());

        Thread.sleep(2000);

        myDriver.close();
    }
}
