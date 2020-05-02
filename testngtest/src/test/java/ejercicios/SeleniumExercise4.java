package ejercicios;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class SeleniumExercise4 {
    public static void main (String[] args) throws  InterruptedException{
        File chromeFilePath =new File("src/test/resources/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",chromeFilePath.getPath());
        WebDriver myDriver=new ChromeDriver();
        myDriver.navigate().to("https://www.youtube.com/");
        myDriver.close();
    }
}
