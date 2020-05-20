package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class LocatorsExercise5 {
    public static void main (String[] args) throws  InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("Chrome");
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Entramos a amazon
        myDriver.navigate().to("https://www.amazon.com.mx");

        WebElement dropSearch=myDriver.findElement(By.id("searchDropdownBox"));
        Select myDropSearchSelect=new Select(dropSearch);
        for (WebElement x:myDropSearchSelect.getOptions()) {
            System.out.println(x.getText());
            
        }
        System.out.println("Multiple  "+myDropSearchSelect.isMultiple());
        System.out.println("Primero " + myDropSearchSelect.getFirstSelectedOption().getText());
        myDropSearchSelect.selectByIndex(0);
        myDropSearchSelect.selectByValue("search-alias=automotive");

        myDriver.close();
    }

}
