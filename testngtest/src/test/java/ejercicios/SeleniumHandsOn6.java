package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sun.plugin.dom.html.HTMLBodyElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn6 {

    public static void main(String [] args) throws InterruptedException{

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com.mx");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        WebElement searchBox = driver.findElement(By.cssSelector("div > input[id='twotabsearchtextbox']"));

        searchBox.sendKeys("nintendo switch");
        searchBox.submit();

        WebElement primeCheckBox = driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']"));
        //List<WebElement> checkBoxes = driver.findElements(By.("//i[@class='a-icon a-icon-checkbox']"));

        primeCheckBox.click();

        //WebElement threeStarsCheckBox = driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-3']"));
        //section/child::i[contains(@class,'medium-3')]
        WebElement threeStarsCheckBox = driver.findElement(By.xpath("//section/child::i[contains(@class,'medium-3')]"));
        threeStarsCheckBox.click();

        WebElement fourStarsCheckBox = driver.findElement(By.xpath("//section/child::i[contains(@class,'medium-4')]"));
        fourStarsCheckBox.click();

        Thread.sleep(5000);

        List<WebElement>  productPrices = driver.findElements(By.xpath("//div/descendant::span[@class='a-price-whole']"));

        int prev = 0;
        int value;
        WebElement cheapestProduct = null;

        for(WebElement i: productPrices){
            //System.out.println(i.getText());
            value = Integer.parseInt(i.getText().replaceAll("[^a-zA-Z0-9]", ""));
            //System.out.println(value);
            if (prev == 0){
                prev = value;
            }  else if (value < prev){
                cheapestProduct = i;
                prev = value;
            } else{
                prev = value;
            }
        }

        System.out.println("The cheapest Product value is :" + cheapestProduct.getText());

        cheapestProduct.click();

        Thread.sleep(5000);

        driver.close();

    }

}



