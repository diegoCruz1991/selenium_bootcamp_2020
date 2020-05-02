package ejercicios;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class SeleniumExercise3 {
    public static void main (String[] args) throws  InterruptedException{
        File chromeFilePath =new File("src/test/resources/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",chromeFilePath.getPath());
        WebDriver myDriver=new ChromeDriver();
        myDriver.navigate().to("https://www.google.com");
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().to("https://www.facebook.com/");
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().to("https://www.espn.com.mx");
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().back();
        myDriver.navigate().back();
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().forward();
        System.out.println(myDriver.getCurrentUrl());

        myDriver.close();
    }

}
