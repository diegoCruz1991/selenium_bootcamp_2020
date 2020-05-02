package Ejercicios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class SeleniumExercise {

    public static void main(String[] args) throws InterruptedException {
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());

        WebDriver myDriver = new FirefoxDriver();

        myDriver.get("http://www.google.com");
        System.out.println(myDriver.getTitle());
        System.out.println(myDriver.getCurrentUrl());
        System.out.println(myDriver.getPageSource());


        Thread.sleep(1000);

        myDriver.close();


    }

}
