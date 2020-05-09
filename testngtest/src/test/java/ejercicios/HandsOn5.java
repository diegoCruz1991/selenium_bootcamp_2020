package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn5 {

    public static void main(String[] arg) throws InterruptedException{
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
        WebDriver myDriver = new FirefoxDriver();
        myDriver.navigate().to("https://www.google.com.mx");
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(myDriver.getCurrentUrl());
        WebElement searchtxt =  myDriver.findElement(By.id("as_word"));

        myDriver.close();
    }

}
