package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsEx5 {

    public static void main(String[]args){

        WebDriver driver = new WebDriverFactory().getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.amazon.com.mx/");

        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        Select myDropDownSelect = new Select(dropdown);
        System.out.println("Test: " + myDropDownSelect);

        List<WebElement> allSelections = myDropDownSelect.getOptions();
        System.out.println("List size: " + allSelections.size());

        for (WebElement i : allSelections) {
            System.out.println("All selections: " + i.getAttribute("value"));
        }

        System.out.println("First option: " + myDropDownSelect.getOptions().get(0));
        System.out.println(myDropDownSelect.getFirstSelectedOption().getText());
        System.out.println("First option: " + allSelections.get(0).getAttribute("value"));

        myDropDownSelect.selectByIndex(0);
        myDropDownSelect.selectByValue("search-alias=automotive");
    }
}
