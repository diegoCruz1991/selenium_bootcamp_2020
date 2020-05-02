package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.List;

public class amazonEjercicio {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("https://www.amazon.com.mx/");

        WebElement selDepartamento = driver.findElement(By.id("searchDropdownBox"));
        Select dropdown = new Select(selDepartamento);
        for (WebElement option:dropdown.getOptions()) {
            System.out.println(option.getText());
        }
        System.out.println("Multiple? "+dropdown.isMultiple());
        System.out.println("First: "+dropdown.getFirstSelectedOption().getText());
        dropdown.selectByIndex(0);
        dropdown.selectByValue("search-alias=automotive");
        driver.quit();
    }
}
