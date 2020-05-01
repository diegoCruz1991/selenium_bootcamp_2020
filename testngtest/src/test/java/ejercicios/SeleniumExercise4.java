package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SeleniumExercise4 {

    public static void main(String[] args) throws InterruptedException {
        File chromeFilePath = new File("src/test/resources/drivers/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        WebDriver myDriver = new ChromeDriver();

        myDriver.navigate().to("http://youtube.com");

        //WebElement search_element = myDriver.findElement(By.name("search_query"));
        WebElement search_element = myDriver.findElement(By.id("search"));
        if (search_element.isDisplayed() && search_element.isEnabled()) {
            Thread.sleep(3000);
            search_element.sendKeys("Selnium");
            Thread.sleep(3000);
        }

        WebElement button_element = myDriver.findElement(By.id("search-icon-legacy"));
        button_element.click();

        Thread.sleep(5000);

        myDriver.close();

    }

}
