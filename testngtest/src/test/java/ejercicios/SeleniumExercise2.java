package ejercicios;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumExercise2  {

    public static void main (String[] args) throws InterruptedException {

        File chromeFilePath = new File ("src/test/resources/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com.mx");
        System.out.println(driver.getTitle());
        driver.get("http://facebook.com");
        System.out.println(driver.getCurrentUrl());
        driver.get("http://www.espn.com.mx");
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        driver.navigate().forward();






    }



}
