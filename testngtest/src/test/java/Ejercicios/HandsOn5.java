package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class HandsOn5 {
    public static void main(String[] args) throws InterruptedException {
        File rootPath = new File("C:\\Users\\josec\\Desktop\\bootCampGit\\selenium_bootcamp_2020-master\\selenium_bootcamp_2020-master\\testngtest\\src\\test\\resources\\drivers");
        File chromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver myDriver = new ChromeDriver();
        myDriver.get("https://www.facebook.com/");
        System.out.println(myDriver.getCurrentUrl());
        assert myDriver.getCurrentUrl().equals("https://www.facebook.com/"):"No son Iguales";
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebElement email = myDriver.findElement(By.id("email"));
        email.sendKeys("jose_ch@hotmail.com");

        WebElement password = myDriver.findElement(By.id("pass"));
        password.sendKeys("cccc");
        password.submit();

        Thread.sleep(10000);
        WebElement searchbox = myDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div/div[1]/div/div[3]/label/input"));
        searchbox.sendKeys("QA Minds",Keys.ENTER);

        Thread.sleep(10000);





        myDriver.close();
    }
}
