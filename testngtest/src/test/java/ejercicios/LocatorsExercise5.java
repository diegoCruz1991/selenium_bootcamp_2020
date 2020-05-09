package ejercicios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise5 {

    public static void main (String[] args){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.amazon.com.mx");
        assert driver.getCurrentUrl().equals("http://www.amazon.com.mx"): "Es Amazon";

        WebElement selectDep = driver.findElement(By.id("searchDropdownBox"));
        Select dropdown = new Select(selectDep);
        for (WebElement option:dropdown.getOptions()){
            System.out.println(option.getText());
        }

        System.out.println("Multiple:" + dropdown.isMultiple());
        System.out.println("Primer Opcion:" + dropdown.getFirstSelectedOption().getText());
        dropdown.selectByIndex(0);
        dropdown.selectByValue("search-alias=automotive");

        driver.close();

    }

}
