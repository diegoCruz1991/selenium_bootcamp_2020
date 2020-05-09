package ejercicios;
import com.sun.media.sound.WaveFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;

public class SeleniumExercise1 {

    public static void main (String[] args) throws InterruptedException{

        File firefoxFilePath= new File ("src/test/resources/drivers/geckodriver.exe");
       //firefoxPath =new File (rootPath, pathname:"geckodriver.exe");

        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
        WebDriver myDriver = new FirefoxDriver();
        myDriver.get("http://google.com.mx");
        System.out.println(myDriver.getTitle());
        System.out.println(myDriver.getCurrentUrl());
        myDriver.get("http://yahoo.com");
        myDriver.navigate().back();
        myDriver.navigate().forward();
        Thread.sleep(1000);

        myDriver.close();

    }



}
