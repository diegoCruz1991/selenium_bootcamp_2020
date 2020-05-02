package Ejercicios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Exercise3 {
    public static void main(String[] args) throws InterruptedException{
        File rootPath = new File("C:\\Users\\josec\\Desktop\\bootCampGit\\selenium_bootcamp_2020-master\\selenium_bootcamp_2020-master\\testngtest\\src\\test\\resources\\drivers");
        File chromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver myDriver = new ChromeDriver();
        myDriver.get("https://www.google.com.mx");
        System.out.println(myDriver.getCurrentUrl());
        Thread.sleep(2000);

        myDriver.navigate().to("https://www.facebook.com/");
        System.out.println(myDriver.getCurrentUrl());
        Thread.sleep(2000);

        myDriver.navigate().to("https://www.espn.com.mx/");
        System.out.println(myDriver.getCurrentUrl());


        myDriver.navigate().back();
        myDriver.navigate().back();
        System.out.println(myDriver.getCurrentUrl());
        Thread.sleep(1000);

        myDriver.navigate().forward();
        System.out.println(myDriver.getCurrentUrl());


        myDriver.navigate().refresh();
        System.out.println(myDriver.getCurrentUrl());


        myDriver.close();



    }
}
