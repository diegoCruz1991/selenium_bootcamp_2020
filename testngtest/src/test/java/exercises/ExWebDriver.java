package exercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class ExWebDriver {

    public static void main(String[] args) throws InterruptedException {

        File rootPath = new File("src/test/resources/drivers/geckodriver.exe");

        System.setProperty("webdriver.gecko.driver", rootPath.getPath());

        WebDriver myDriver = new FirefoxDriver();

        myDriver.get("https://www.google.com.mx");

        System.out.println("MycurrentTitle:" + myDriver.getTitle());
//url
        System.out.println("MycurrentURL:" + myDriver.getCurrentUrl());
//sourcecode
//System.out.println(myDriver.getPageSource());
        Thread.sleep(1000);

        myDriver.close();

    }
}

