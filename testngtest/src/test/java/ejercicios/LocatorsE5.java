package ejercicios;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class LocatorsE5 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        myDriver.get("https://www.amazon.com.mx");
        Thread.sleep(3000);

        WebElement searchDropbox = myDriver.findElement(By.id("searchDropdownBox"));
        Select drop = new Select(searchDropbox);


       for(WebElement opt:drop.getOptions()){
           opt.getText();
       }

       System.out.println(drop.isMultiple());
       System.out.println(drop.getFirstSelectedOption());
       drop.selectByIndex(0);
       drop.selectByValue("search-alias=automotive"); //inpect option value

        Thread.sleep(10000);

        myDriver.close();
    }
}
