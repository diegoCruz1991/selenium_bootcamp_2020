package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class XpathExercise2 {
    public static void main(String[] args) throws InterruptedException {
        File rootPath = new File("C:\\Users\\josec\\Desktop\\bootCampGit\\selenium_bootcamp_2020-master\\selenium_bootcamp_2020-master\\testngtest\\src\\test\\resources\\drivers");
        File chromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver myDriver = new ChromeDriver();
        myDriver.get("https://www.amazon.com.mx/");
        System.out.println(myDriver.getCurrentUrl());

        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> links = myDriver.findElements(By.xpath("//a"));
        for(WebElement text:links){
            System.out.println("Hiper Link Text  " + text.getText());
        }
        List<WebElement> head = myDriver.findElements(By.xpath("//head/child::*"));
        for(WebElement text:head){
            System.out.println("Head Text  " + text.getText());
        }
        myDriver.close();
    }
}


