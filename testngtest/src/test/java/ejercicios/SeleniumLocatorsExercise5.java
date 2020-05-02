package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;
import java.util.List;

public class SeleniumLocatorsExercise5 {
    public static void main (String[] args) throws InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.get("https://www.amazon.com.mx");
        WebElement myElement = myDriver.findElement(By.id("searchDropdownBox"));
        Select myDropdownSelect = new Select(myElement);
        List<WebElement> myDropdownOptions = myDropdownSelect.getOptions();
        System.out.println(myDropdownOptions.size());
        for(int i =0; i<myDropdownOptions.size(); i++) {
            System.out.println(myDropdownOptions.get(i).getText());
        }
        System.out.println(myDropdownSelect.isMultiple());
        System.out.println(myDropdownSelect.getFirstSelectedOption().getText());
        myDropdownSelect.selectByIndex(4);
        Thread.sleep(3000);
        myDropdownSelect.selectByValue("search-alias=automotive");
        Thread.sleep(3000);
        myDropdownSelect.selectByVisibleText("Tienda Kindle");
        Thread.sleep(4000);
        myDriver.close();
    }
}
