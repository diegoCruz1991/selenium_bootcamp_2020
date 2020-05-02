package ejercicios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Exercise2 {
    public static void main(String[] args) throws InterruptedException {
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver");
        System.setProperty("webdriver.gecko.driver",firefoxFilePath.getPath());

        WebDriver myDriver = new FirefoxDriver();

        myDriver.get("https://www.google.com");

        System.out.println("titulo = " + myDriver.getTitle());
        System.out.println("URL = " + myDriver.getCurrentUrl());
        System.out.println("SourceCode = " + myDriver.getPageSource());

        Thread.sleep(1000);

        myDriver.close();


    }
}
