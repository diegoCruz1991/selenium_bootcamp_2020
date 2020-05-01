package ejercicios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class SeleniumExercise1 {

    public static void main(String[] args) throws InterruptedException {
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");

        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());

        WebDriver myDriver = new FirefoxDriver();

        myDriver.get("http://google.com.mx");

        System.out.println("This is the Title of the page:" + " " + myDriver.getTitle());
        System.out.println("This is the Current URL of the page:" + " " + myDriver.getCurrentUrl());
        System.out.println("This is the Source Code of the page:    " + " " + myDriver.getPageSource());


        Thread.sleep(2000);

        myDriver.close();

    }
}
