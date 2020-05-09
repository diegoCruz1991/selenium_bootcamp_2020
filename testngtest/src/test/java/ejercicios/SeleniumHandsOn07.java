package ejercicios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn07 {
    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.mx");

// Barra de Navegacion
        WebElement searchbar = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        searchbar.sendKeys("Nintendo Switch");
        WebElement buttonbar = driver.findElement(By.className("nav-input"));
        buttonbar.submit();
//Checkbox
        WebElement checkbox = driver.findElement(By.cssSelector("div[class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']"));
        checkbox.click();
//Estrellas
        WebElement star3 = driver.findElement(By.cssSelector("i.a-star-medium-3"));
        star3.click();
        Thread.sleep(1000);
        WebElement star4 = driver.findElement(By.cssSelector("i.a-star-medium-4"));
        star4.click();

 //Seleccionar el precio mas bajo

        driver.findElement(By.xpath("//*[@id='a-autoid-0']")).click();

        List<WebElement> lowprice = driver.findElements(By.xpath("//*[@id='s-result-sort-select_1']"));
            for (WebElement webElement:lowprice){
                if(webElement.getText().trim().equals("Precio: de más bajo a más alto")){
                    webElement.click();
                    break;
                }

            }


    }


}
