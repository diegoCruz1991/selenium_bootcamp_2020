package ejercicios;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class SeleniumExercise3 {

    public static void main(String[] args) throws InterruptedException {
        File chromeFilePath = new File("src/test/resources/drivers/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        WebDriver myDriver = new ChromeDriver();

        myDriver.navigate().to("http://google.com");
        System.out.println("This is the current url of google:" + " " + myDriver.getCurrentUrl());

        myDriver.navigate().to("https://twitter.com");
        System.out.println("This is the current url of facebook:" + " " + myDriver.getCurrentUrl());

        myDriver.navigate().to("https://www.espn.com/");
        System.out.println("This is the current url:" + " " + myDriver.getCurrentUrl());

        myDriver.navigate().back();
        myDriver.navigate().back();
        System.out.println("This is the current url:" + " " + myDriver.getCurrentUrl());
        myDriver.navigate().forward();
        myDriver.navigate().refresh();

        System.out.println("This is the current url:" + " " + myDriver.getCurrentUrl());
        Thread.sleep(4000);

        myDriver.close();

    }


}
