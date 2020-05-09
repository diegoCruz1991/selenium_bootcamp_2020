package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.List;

public class Tarea1 {
        public static void main(String[] arg) throws InterruptedException{
            File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");
            System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
            WebDriver myDriver = new FirefoxDriver();
            myDriver.navigate().to("https://www.mercadolibre.com.mx");
            Thread.sleep(10000);
            System.out.println(myDriver.getCurrentUrl());

            if(true){
                WebElement searchtxt =  myDriver.findElement(By.name("as_word"));
                searchtxt.sendKeys("Selenium");
                searchtxt.submit();
                Thread.sleep(10000);
                List <WebElement> first =  myDriver.findElements(By.cssSelector("#searchResults li"));
                first.get(0).click();
                Thread.sleep(10000  );
            }
            else
                System.out.println("No correcto");
            myDriver.close();
    }

}
