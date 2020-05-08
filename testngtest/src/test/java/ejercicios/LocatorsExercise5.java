/*package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class LocatorsExercise5 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver chrome = WebDriverFactory.getDriver("chrome");

        chrome.get("https://www.amazon.com.mx");

        assert chrome.getCurrentUrl().equals("https://www.amazon.com.mx") : "La pagina no es la misma";

        chrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement dropDown = chrome.findElement(By.id("searchDropdownBox"));
        Select dropDownSelect = new Select(dropDown);

        dropDownSelect.se

        dropDownSelect.selectByVisibleText();

       /for (Select i: dropDownSelect) {
            System.out.println(i.getAllSelectedOptions());
        }

        //System.out.println(dropDownSelect.getAllSelectedOptions());
        System.out.println(dropDownSelect.getOptions());
        System.out.println(dropDownSelect.getFirstSelectedOption());
        System.out.println(dropDownSelect.isMultiple());
        dropDownSelect.selectByIndex(0);
        System.out.println(dropDownSelect.selectByValue("search-alias=automotive"));
        }


*/


