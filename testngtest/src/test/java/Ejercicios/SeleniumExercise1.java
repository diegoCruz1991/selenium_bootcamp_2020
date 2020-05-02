package Ejercicios;


import com.sun.net.httpserver.HttpContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class SeleniumExercise1 {

    public static void main (String [] args) throws InterruptedException {


        File firefoxFilePath = new File ("src/test/resources/drivers/chromedriver.exe");

        HttpContext chromeFilePath = null;
        System.setProperty ("webdriver.chrome.driver", chromeFilePath.getPath());

        WebDriver myDriver = new ChromeDriver();

        myDriver.navigate().to("https://www.google.com");
        System.out.println(myDriver.getCurrentUrl());

        Thread.sleep(1000);

        myDriver.close();

    }
}

