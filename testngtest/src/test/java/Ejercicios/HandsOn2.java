package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class HandsOn2 {
    public static void main(String[] args) throws InterruptedException {
    File rootPath = new File("C:\\Users\\josec\\Desktop\\bootCampGit\\selenium_bootcamp_2020-master\\selenium_bootcamp_2020-master\\testngtest\\src\\test\\resources\\drivers");
    File chromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver myDriver = new ChromeDriver();
        myDriver.get("https://www.google.com.mx");
        System.out.println(myDriver.getCurrentUrl());
        assert myDriver.getCurrentUrl().equals("\"https://www.google.com.mx\""):"No son Iguales";
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebElement buscar = myDriver.findElement(By.name("q"));
        buscar.sendKeys("Simple");
        buscar.submit();

        Thread.sleep(2000);



        myDriver.close();
    }
  }

