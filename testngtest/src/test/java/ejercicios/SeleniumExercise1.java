package ejercicios;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;

public class SeleniumExercise1 {
    public static void main (String[] args) throws InterruptedException{
        //Define location of Firefox driver
        File browserFilePath = new File("src/test/resources/drivers/geckodriver.exe"); //geckodriver.exe *-* chromedriver.exe

        //Set where to search for Firefoxdriver
        System.setProperty("webdriver.gecko.driver", browserFilePath.getPath()); //webdriver.gecko.driver *-* webdriver.chrome.driver

        //Create new instance of Firefox driver
        WebDriver myDriver = new FirefoxDriver(); //FirefoxDriver() *-* ChromeDriver()

        //Open google in current window
        myDriver.get("https://www.google.com.mx");
        System.out.println(myDriver.getPageSource());
        System.out.println(myDriver.getTitle());
        System.out.println(myDriver.getCurrentUrl());

        //Wait, keep window open
        Thread.sleep(2000);

        //Close current window
        myDriver.close();
    }
}
