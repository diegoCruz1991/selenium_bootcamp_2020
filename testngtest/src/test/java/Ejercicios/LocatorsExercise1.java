package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise1 {
    public static void main(String[] args) throws InterruptedException {
        File rootPath = new File("C:\\Users\\josec\\Desktop\\bootCampGit\\selenium_bootcamp_2020-master\\selenium_bootcamp_2020-master\\testngtest\\src\\test\\resources\\drivers");
        File chromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver myDriver = new ChromeDriver();
        myDriver.get("https://www.mercadolibre.com.mx/");
        System.out.println(myDriver.getCurrentUrl());
        myDriver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

        WebElement search = myDriver.findElement(By.name("as_word"));
        search.sendKeys("Selenium");


        WebElement submit = myDriver.findElement(By.className("nav-search-btn"));
        submit.click();


        WebDriverWait wait = new WebDriverWait(myDriver, 3);
        WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("main-title")));
        WebElement elemnt [] = myDriver.findElements(By.className("main-title")).toArray(new WebElement[0]);
        elemnt[0].click();

        Thread.sleep(5000);
        myDriver.close();

    }

}

