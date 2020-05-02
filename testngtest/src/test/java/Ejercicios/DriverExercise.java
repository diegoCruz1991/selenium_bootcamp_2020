package Ejercicios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;

public class DriverExercise {
    public static void main(String[] args) throws InterruptedException{
    File rootPath = new File("C:\\Users\\josec\\Desktop\\bootCampGit\\selenium_bootcamp_2020-master\\selenium_bootcamp_2020-master\\testngtest\\src\\test\\resources\\drivers");
    File firefoxFilePath = new File(rootPath, "geckodriver.exe");
    System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
    WebDriver myDriver = new FirefoxDriver();
    myDriver.get("https://www.google.com.mx");
        Thread.sleep(5000);
        System.out.println(myDriver.getCurrentUrl());
        System.out.println(myDriver.getTitle());
        System.out.println(myDriver.getPageSource());
    myDriver.close();



    }

}
