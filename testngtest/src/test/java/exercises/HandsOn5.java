package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn5 {

    public static void main(String[]args){

        WebDriver driver = new WebDriverFactory().getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.amazon.com.mx/");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Nintendo Swith");
        searchBox.submit();

        WebElement checkbox = driver.findElement(By.xpath("//li[@id =  'p_85/9841545011']//i[@class= 'a-icon a-icon-checkbox']"));
        checkbox.click();

        WebElement star4 = driver.findElement(By.xpath("//i[@class= 'a-icon a-icon-star-medium a-star-medium-4']"));
        if (star4.isDisplayed() == true){
            System.out.println("Esta seleccionado");
        }else {
            star4.click();
        }

        WebElement orden = driver.findElement(By.xpath("//span[@class= 'a-dropdown-container']"));
        orden.click();
        WebElement bajo = driver.findElement(By.xpath("//a[@id= 's-result-sort-select_1' and text() = 'Precio: de más bajo a más alto']"));
        bajo.click();
        WebElement masBajo = driver.findElement(By.xpath("//*[@class= 'a-size-medium a-color-base a-text-normal']"));
        System.out.println("El mas bajo es: " +masBajo.getAttribute("href") + masBajo.getText());

//        Select myDropDonwOrden = new Select(orden);
//
//        List<WebElement> allSelections = myDropDonwOrden.getOptions();
//        System.out.println("List size: " + allSelections.size());
//
//        myDropDonwOrden.selectByIndex(1);
//        //div[contains(@class, 'a-checkbox') and following-sibling::i]//input
    }
}
