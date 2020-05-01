package exercises;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;
import java.util.Set;

public class SeleniumEx3 {

    public static void main(String[] args) {

        File rootPath = new File("src/test/resources/drivers/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", rootPath.getPath());

        WebDriver newDriver = new ChromeDriver();

        newDriver.navigate().to("https://www.google.com.mx");
        newDriver.navigate().to("https://www.facebook.com");
        System.out.println("FirstURL:" + newDriver.getCurrentUrl());
        newDriver.navigate().to("https://www.espn.com.mx");
        System.out.println("SecondURL:" + newDriver.getCurrentUrl());
        newDriver.navigate().back();
        newDriver.navigate().back();
        System.out.println("ThirdURL:" + newDriver.getCurrentUrl());
        newDriver.navigate().forward();
        System.out.println("ForthURL:" + newDriver.getCurrentUrl());
        newDriver.navigate().refresh();
        System.out.println("LastURL:" + newDriver.getCurrentUrl());

        newDriver.close();

    }
}