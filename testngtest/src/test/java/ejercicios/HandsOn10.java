package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.List;

public class HandsOn10 {

    public static void main(String[] arg) throws InterruptedException{
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
        WebDriver myDriver = new FirefoxDriver();
        myDriver.navigate().to("https://www.amazon.com.mx");
        //Thread.sleep(10000);
        System.out.println(myDriver.getCurrentUrl());
        WebElement search = myDriver.findElement(By.cssSelector("input#twotabsearchtextbox"));
        Thread.sleep(10000);

        search.sendKeys("Nintendo Switch");
        search.submit();
        Thread.sleep(1000  );
        WebElement prime = myDriver.findElement(By.cssSelector("div[class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']")
        );
        prime.click();
        WebElement tresEstrellas = myDriver.findElement(By.cssSelector("i.a-star-medium-3"));
        tresEstrellas.click();
        Thread.sleep(4000  );
        WebElement cuatroEstrellas = myDriver.findElement(By.cssSelector("i.a-star-medium-4"));
        cuatroEstrellas.click();
        Thread.sleep(4000  );
        WebElement  bara = myDriver.findElement(By.cssSelector("select#s-result-sort-select"));

        Thread.sleep(10000  );


        myDriver.close();
    }
}
