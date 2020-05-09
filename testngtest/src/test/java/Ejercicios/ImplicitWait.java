package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args){
        WebDriver mydriver = WebDriverFactory.getDriver("chrome");
        mydriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        mydriver.get("https://google.com");
        WebElement myID = mydriver.findElement(By.id("fgsa"));
        mydriver.close();


    }

}
