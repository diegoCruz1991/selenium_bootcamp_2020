package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SelectDropDown {
    public static void main(String[] args) {
        WebDriver myDirver = WebDriverFactory.getDriver("Chrome");
        myDirver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myDirver.get("https://www.amazon.com.mx/");

        WebElement dropDown = myDirver.findElement(By.id("searchDropdownBox"));
        Select selectDropDown = new Select(dropDown);



        for (WebElement options: selectDropDown.getOptions()) {
            System.out.println(options.getText());
        }

        if(selectDropDown.isMultiple() == true){
            System.out.println("El dropdown permite seleccion multiple");
        }
        else {
            System.out.println("El dropdown no permite selección multiple");
        }

        System.out.println(selectDropDown.getFirstSelectedOption().getText());
        selectDropDown.selectByIndex(0);
        selectDropDown.selectByValue("search-alias=automotive");
        selectDropDown.getAllSelectedOptions();
        myDirver.close();




    }
}
