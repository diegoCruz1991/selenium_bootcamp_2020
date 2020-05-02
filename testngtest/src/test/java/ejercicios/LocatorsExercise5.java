package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise5 {

    public static void main(String[] args) throws InterruptedException {
        File chromeFilePath = new File("src/test/resources/drivers/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        //Other way to execute the driver
        //WebDriver driver = WebDriverFactory.getDriver("chrome");

        WebDriver myDriver = new ChromeDriver();

        myDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        myDriver.get("https://www.amazon.com.mx/");

        WebElement myDropDown = myDriver.findElement(By.id("searchDropdownBox"));
        Select myDropDownSelect = new Select(myDropDown);
        for (WebElement options : myDropDownSelect.getOptions()) {
            System.out.println(options.getText());
        }

        System.out.println("Multiple:" + myDropDownSelect.isMultiple());
        System.out.println("First Option: " + myDropDownSelect.getFirstSelectedOption().getText());
        myDropDownSelect.selectByIndex(1);
        myDropDownSelect.selectByVisibleText("Auto");

        myDriver.close();

    }
}