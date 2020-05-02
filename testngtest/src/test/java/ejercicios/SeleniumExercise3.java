package ejercicios;
import java.io.File;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class SeleniumExercise3 {
    public static void main (String[] args) throws InterruptedException {

        //define location of firefox driver
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver");

        //Set where to search for firefox driver
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());

        //create new instance of firefox driver

        WebDriver myDriver = new FirefoxDriver();

        //open google in current window
        myDriver.get("https://www.google.com.mx");

        myDriver.navigate().to("https://www.google.com.mx");
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().to("https://www.facebook.com.mx");
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().to("https://www.espn.com.mx");
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().back();
        myDriver.navigate().back();
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().refresh();
        System.out.println(myDriver.getCurrentUrl());



        Thread.sleep(5000);

        myDriver.close();
    }

}
