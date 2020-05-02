package ejercicios;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class SeleniumExercise1 {
    public static void main (String[] args) throws  InterruptedException{
        File chromeFilePath =new File("src/test/resources/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",chromeFilePath.getPath());
        WebDriver myDriver=new ChromeDriver();
        myDriver.get("https://www.google.com");
        Thread.sleep(1000);
        System.out.println(myDriver.getTitle());
        System.out.println(myDriver.getCurrentUrl());
        System.out.println(myDriver.getPageSource());
        myDriver.close();
    }
}