package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn1 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        myDriver.get("https://www.amazon.com.mx");
        Thread.sleep(3000);

        WebElement search = myDriver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Nintendo Switch");
        search.submit();


        WebElement prime = myDriver.findElement(By.cssSelector("div[class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']"));
        prime.click();
        Thread.sleep(3000);

        WebElement star3 = myDriver.findElement(By.xpath("//i[contains(@class,'a-icon a-icon-star-medium a-star-medium-3')]"));
        star3.click();
        Thread.sleep(3000);

        WebElement star4 = myDriver.findElement(By.xpath("//i[contains(@class,'a-icon a-icon-star-medium a-star-medium-4')]"));
        star4.click();
        Thread.sleep(3000);

        WebElement dropd = myDriver.findElement(By.cssSelector("span[id='a-autoid-0-announce']"));
        dropd.click();
        Thread.sleep(3000);

        WebElement optLow = myDriver.findElement(By.cssSelector("li a[id='s-result-sort-select_1']"));
        optLow.click();
        Thread.sleep(3000);


        List<WebElement> masba = myDriver.findElements(By.cssSelector("div[class='s-main-slot s-result-list s-search-results sg-row']"));
        System.out.println(masba.get(0).getText());

        myDriver.close();
    }
}
