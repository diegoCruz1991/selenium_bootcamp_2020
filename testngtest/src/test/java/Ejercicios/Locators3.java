package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Locators3 {
    public static void main(String[] args) throws InterruptedException {
        File rootPath = new File("C:\\Users\\josec\\Desktop\\bootCampGit\\selenium_bootcamp_2020-master\\selenium_bootcamp_2020-master\\testngtest\\src\\test\\resources\\drivers");
        File chromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver myDriver = new ChromeDriver();
        myDriver.get("https://www.nasa.gov/");
        System.out.println(myDriver.getCurrentUrl());

        WebElement search = myDriver.findElement(By.linkText("Missions"));
        String href = search.getAttribute("href");
        System.out.println(href);

        WebElement search2 = myDriver.findElement(By.linkText("NASA TV"));
        String href2 = search2.getAttribute("href");
        System.out.println(href2);

        WebElement search3 = myDriver.findElement(By.partialLinkText("Mars"));
        String href3 = search3.getAttribute("href");
        System.out.println(href3);

        List<WebElement> search4 = myDriver.findElements(By.tagName("input"));
        System.out.println(search4.size());




        myDriver.close();

    }
}
