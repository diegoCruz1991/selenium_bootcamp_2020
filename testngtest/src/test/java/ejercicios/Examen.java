package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.List;

public class Examen {


    public static void main(String[] arg) throws InterruptedException{
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
        WebDriver myDriver = new FirefoxDriver();
        myDriver.navigate().to("https://es.wikipedia.org/wiki/Selenium");
        Thread.sleep(10000);
        System.out.println(myDriver.getCurrentUrl());


            List<WebElement>  all =  myDriver.findElements(By.partialLinkText("selenium"));
            for (int i = 0; i < all.size(); i++) {
                System.out.println(all.get(i));
            }
            Thread.sleep(10000  );

        myDriver.close();
    }
}
