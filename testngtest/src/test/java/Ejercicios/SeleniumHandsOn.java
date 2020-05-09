package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn {
    public static void main(String[] args) throws InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(myDriver,20);
        myDriver.get("https://www.amazon.com.mx/");


        WebElement txtSearchBox = myDriver.findElement(By.cssSelector("input[name='field-keywords']"));

        txtSearchBox.sendKeys("Nintendo switch");
        txtSearchBox.submit();

        //Searching the Checkbox Prime element by Css Selector
        WebElement chkBoxPrime = myDriver.findElement(By.cssSelector("div+i[class='a-icon a-icon-prime a-icon-medium']"));
        chkBoxPrime.click();
        Thread.sleep(3000);

        //Searching the 3 stars element by Css Selector and using an explicit wait
        WebElement lnk3Stars = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("i[class='a-icon a-icon-star-medium a-star-medium-3']")));
        lnk3Stars.click();

        //Searching the 4 stars element by Css Selector and using an explicit wait
        WebElement lnk4Stars = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("i[class='a-icon a-icon-star-medium a-star-medium-3']")));
        lnk4Stars.click();

        Thread.sleep(2000);
        WebElement sortList = myDriver.findElement(By.cssSelector("span[class='a-dropdown-prompt']"));
        sortList.click();

        WebElement sortPrice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s-result-sort-select_1")));
        sortPrice.click();
       Thread.sleep(5000);
        List<WebElement> lowestPrice = myDriver.findElements(By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']"));
        lowestPrice.get(0).click();

        WebElement price = myDriver.findElement(By.id("priceblock_ourprice"));

        System.out.println(price.getText());

        Thread.sleep(5000);




        myDriver.close();



    }

}
