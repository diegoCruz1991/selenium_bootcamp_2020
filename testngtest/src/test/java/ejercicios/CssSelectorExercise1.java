package ejercicios;

import javafx.scene.control.CheckBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.WebDriverFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CssSelectorExercise1 {

    public static void main(String[] args) throws InterruptedException {
        //Create new Instance of Chrome By WebDriverFactory
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //Set PageLoadTime
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        driver.get("https://www.amazon.com.mx/");

        List<Float> prices_float = new ArrayList<Float>();

        WebElement search_bar = driver.findElement(By.cssSelector("*[id='twotabsearchtextbox']"));
        search_bar.sendKeys("nintendo switch");
        search_bar.submit();

        Thread.sleep(3000);
        WebElement checkboxprime = driver.findElement(By.cssSelector("i[class='a-icon a-icon-checkbox']"));
        checkboxprime.click();

        Thread.sleep(3000);
        WebElement three_stars = driver.findElement(By.cssSelector("i[class='a-icon a-icon-star-medium a-star-medium-3'"));
        three_stars.click();

        Thread.sleep(3000);
        WebElement four_stars = driver.findElement(By.cssSelector("i[class='a-icon a-icon-star-medium a-star-medium-4'"));
        four_stars.click();

        List<WebElement> div_list = driver.findElements(By.cssSelector("div[class='s-result-list s-search-results sg-row'] > div > div"));
        System.out.println("\nTotal products = "+div_list.size()+"\n");

        for(int i = 0; i < div_list.size() - 1; i++ ) {
            WebElement price = driver.findElement(By.xpath("//span[contains(@class, 'a-price-whole')]"));
            if(prices_float.get(i) <= 189) {
                System.out.println(price.getAttribute("textContent"));
                prices_float.add( Float.parseFloat(price.getAttribute("textContent").replace("$","").replace(",","")));
                System.out.println("\nThe lower price is: $" + prices_float.get(i));
            }
        }

        /*if(prices_float.isEmpty()==false) {
            Collections.sort(prices_float);
            System.out.println("\nSorted List:\n");
            for (Float sortedPrice : prices_float)
                System.out.println(sortedPrice);
            System.out.println("\nThe lower price is: $" + prices_float.get(0));
        }
        else {
            System.out.println("The list of prices is empty");
            System.out.println("Trying again");
        }*/

        driver.close();
    }

}