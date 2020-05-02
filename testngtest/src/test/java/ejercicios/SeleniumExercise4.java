package ejercicios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.io.File;

public class SeleniumExercise4 {

    public static void main(String[] args) throws InterruptedException{

        //setting sleep time value (customizable)
        int sleepTime = 20000;

        /*
        1. state drivers root path
        2. state path and driver file for chrome browser
        3. set up chrome driver

         */

        File rootPath = new File("src/test/resources/drivers");

        File chromeFilePath = new File(rootPath, "chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        /*
          1. Create Browser object
          2. Go to Youtube.com
          3. Find search field element and validate it is displayed and enabled
          4. Enter search word "Selenium"
          5. Find search button element and click on it
          6. Close the browser

         */

        //*********** Step 1 ***************
        WebDriver myDriver = new ChromeDriver();

        //*********** Step 2 ***************
        myDriver.get("https://www.youtube.com");

        Thread.sleep(sleepTime);

        //*********** Step 3 ***************
        WebElement myElement = myDriver.findElement(By.xpath("//input[@id='search']"));

        System.out.println("Is search field displayed?: "+myElement.isDisplayed());

        System.out.println("Is search field enabled?: "+myElement.isEnabled());

        //*********** Step 4 ***************
        myElement.sendKeys("Selenium");

        //*********** Step 5 ***************
        WebElement myElement2 = myDriver.findElement(By.id("search-icon-legacy"));

        myElement2.click();

        Thread.sleep(sleepTime);

        //*********** Step 6 ***************
        myDriver.close();


    }

}
