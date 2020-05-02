package Ejercicios;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class Exercise4 {
    public static void main(String[] args) throws InterruptedException {
        File rootPath = new File("C:\\Users\\josec\\Desktop\\bootCampGit\\selenium_bootcamp_2020-master\\selenium_bootcamp_2020-master\\testngtest\\src\\test\\resources\\drivers");
        File chromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver myDriver = new ChromeDriver();
        myDriver.get("https://www.google.com.mx");
        System.out.println(myDriver.getCurrentUrl());
        Thread.sleep(2000);

        myDriver.navigate().to("https://www.youtube.com/");

       Boolean isPresent = myDriver.findElements(By.id("search")).size() > 0;
        if (isPresent == true) {
            WebElement search = myDriver.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div/div[1]/input"));
            search.sendKeys("Selenium");
            Thread.sleep(2000);
        } else myDriver.navigate().refresh();

        WebElement lupa = myDriver.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/button"));
        lupa.click();

        Thread.sleep(5000);

        myDriver.close();
    }
}
