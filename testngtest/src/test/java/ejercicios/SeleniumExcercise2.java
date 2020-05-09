package ejercicios;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

import java.io.File;

public class SeleniumExcercise2 {

    public static void main(String[] args) throws InterruptedException {

        File chromeFilePath = new File("src/test/resources/drivers/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        WebDriver chrome = new ChromeDriver();

        chrome.navigate().to("https://www.google.com.mx");
        System.out.println(chrome.getCurrentUrl());
        chrome.navigate().to("https://www.facebook.com.mx");
        System.out.println(chrome.getCurrentUrl());
        chrome.navigate().to("https://www.espn.com.mx");
        System.out.println(chrome.getCurrentUrl());
        chrome.navigate().back();
        chrome.navigate().back();
        System.out.println(chrome.getCurrentUrl());
        chrome.navigate().forward();
        System.out.println(chrome.getCurrentUrl());
        chrome.navigate().refresh();
        System.out.println(chrome.getCurrentUrl());
        System.out.println(chrome.getPageSource()) ;

        chrome.close();
    }
}
