package locatorsExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise5 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        //open google in current window
        driver.get("https://www.amazon.com.mx");
        assert driver.getCurrentUrl().equals("https://www.amazon.com.mx"): "No es la pagina de amazon ";

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        WebElement myDropDown = driver.findElement(By.id("searchDropdownBox"));


        Select myDropDownSelect = new Select(myDropDown);

        for(WebElement option:myDropDownSelect.getOptions()){
            System.out.println(option.getText());
        }


        if(!myDropDownSelect.isMultiple()){
            System.out.println("Es multiple");
        }
        System.out.println(myDropDownSelect.getFirstSelectedOption().getText());

        myDropDownSelect.selectByIndex(0);
        myDropDownSelect.selectByValue("search-alias=automotive");


        Thread.sleep(40000);

        driver.close();

    }
}
