package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.io.File;
import java.util.concurrent.TimeUnit;

public class HandsOn4 {

    public static void main(String[] arg) throws InterruptedException{
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
        WebDriver myDriver = new FirefoxDriver();
        myDriver.navigate().to("https://www.facebook.com");

        System.out.println(myDriver.getCurrentUrl());

        if(true){
            WebElement email =  myDriver.findElement(By.id("email"));
            email.sendKeys("jofaga@netscape.net");
            WebElement pass =  myDriver.findElement(By.id("pass"));
            pass.sendKeys("");
            WebElement log =  myDriver.findElement(By.id("loginbutton"));
            log.click();
            Thread.sleep(45000);
            WebElement searchbox = myDriver.findElement(By.name("q"));
            searchbox.findElement(By.name("q"));
            searchbox.sendKeys("QA Minds");
            searchbox.submit();
            Thread.sleep(10000);
            myDriver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
        }
        else
            System.out.println("No correcto");
        myDriver.close();
    }
}
