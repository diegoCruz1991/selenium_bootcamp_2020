package ejercicios;
import java.io.File;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import sun.lwawt.macosx.CSystemTray;

public class SeleniumExercise1 {
    public static void main (String[] args) throws InterruptedException {

        //define location of firefox driver
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver");

        //Set where to search for firefox driver
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());

        //create new instance of firefox driver

        WebDriver myDriver = new FirefoxDriver();

        //open google in current window
        myDriver.get("https://www.google.com.mx");

        System.out.println(myDriver.getTitle());
        System.out.println(myDriver.getCurrentUrl());
        System.out.println(myDriver.getPageSource());



        Thread.sleep(1000);

        myDriver.close();
    }

}
