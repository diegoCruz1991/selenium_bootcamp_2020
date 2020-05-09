package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;

public class Handson8 {

    public static void main(String[] arg) throws InterruptedException{
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
        WebDriver myDriver = new FirefoxDriver();
        myDriver.navigate().to("https://amazon.com.mx");
        WebElement dropdown = myDriver.findElement(By.id("searchDropdownBox"));
        Select dropdownSelect = new Select(dropdown);

        for (WebElement valor: dropdownSelect.getOptions()) {
            System.out.println(valor.getText());
        }

        if(dropdownSelect.isMultiple()){
            System.out.println("Es multiple");
        }



        System.out.println(dropdownSelect.getFirstSelectedOption());



        myDriver.close();
    }


}
