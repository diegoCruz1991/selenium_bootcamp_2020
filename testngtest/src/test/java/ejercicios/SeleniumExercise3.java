package ejercicios;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExercise3 {

    public static void main (String[] args){

        File chromeFilePath = new File ("src/test/resources/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.youtube.com");
        System.out.println(driver.getCurrentUrl());
        WebElement WebElement myElement = driver.findElement(By.xpath("//input[@id='search']"));
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Selenium");

    }


}
