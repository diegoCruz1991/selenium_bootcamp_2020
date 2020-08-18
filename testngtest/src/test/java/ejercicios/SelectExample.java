package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelectExample {

    public static void main(String... args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com.mx/");

        //driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement selectDepartments = driver.findElement(By.id("searchDropdownBox"));

        Select selectDropdown = new Select(selectDepartments);

        selectDropdown.selectByIndex(5);

        WebElement selectedOption = selectDropdown.getFirstSelectedOption();

        selectedOption.getText();

        List<WebElement> allOptions = selectDropdown.getOptions();

        for(WebElement element : allOptions) {
            System.out.println(element.getText());
        }

        Thread.sleep(5000);

        assert !selectDropdown.getAllSelectedOptions().isEmpty(): "No se seleccion la opcion";

        driver.close();

        driver.quit();
    }
}
