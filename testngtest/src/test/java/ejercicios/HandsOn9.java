package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn9 {


    public static void main(String[] arg) throws InterruptedException{
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
        WebDriver myDriver = new FirefoxDriver();
        myDriver.navigate().to("https://amazon.com.mx");
        myDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> referencias = myDriver.findElements(By.xpath("//a"));
        List<WebElement> choyas = myDriver.findElements(By.xpath("//head/child::*"));


        for (WebElement valor: referencias) {
            System.out.println(valor.getText());
        }


        for (WebElement valor: choyas) {
            System.out.println(valor.getText());
        }

        myDriver.close();
    }
}
