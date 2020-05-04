package ejercicios;

import org.omg.CORBA.INTERNAL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class LocatorsExercise5 {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com.mx");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement myDropDown = driver.findElement(By.id("searchDropdownBox"));
        Select myDropDownSelect = new Select(myDropDown);

        for( WebElement i : myDropDownSelect.getOptions()) {
            System.out.println(i.getText());
        }
        System.out.println("is Multiple? " + myDropDownSelect.isMultiple());
        System.out.println("First selected option: "+ myDropDownSelect.getFirstSelectedOption().getText());

        myDropDownSelect.selectByIndex(0);
        myDropDownSelect.selectByValue("search-alias=automotive");

        driver.close();

    }

}
