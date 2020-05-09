package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn1 {
    public static void main(String[] args) throws InterruptedException {
        //Create new Instance of Chrome By WebDriverFactory
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //Set PageLoadTime
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        // ***** TEST PROPERTIES *****
        // Target Page
        driver.get("https://www.amazon.com.mx/");
        //Print Current URL
        System.out.println("The target page for this test is: "+driver.getCurrentUrl());
        //Check if the page is correct
        assert driver.getCurrentUrl().equals("https://www.amazon.com.mx/") : "correct page";

        // ***** WEB ELEMENTS *****
        WebElement search_bar;
        WebElement checkbox_prime;
        WebElement button_three_stars;
        WebElement button_four_stars;

        String xpath_product_base;
        String xpath_price_row;
        WebElement price = null;
        List<Float> prices_float = new ArrayList<Float>();

        // ***** TEST STEPS *****

        //Search Nintendo Switch
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        search_bar = driver.findElement(By.cssSelector("*[id='twotabsearchtextbox']"));
        search_bar.sendKeys("nintendo switch");
        search_bar.sendKeys(Keys.ENTER);

        //Select Products with 3 or more stars
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        button_three_stars = driver.findElement(By.cssSelector("i[class='a-icon a-icon-star-medium a-star-medium-3"));
        button_three_stars.click();
        System.out.println("presioné 3 estrellas");

        //Select Products with 4 or more stars
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        button_four_stars = driver.findElement(By.cssSelector("i[class='a-icon a-icon-star-medium a-star-medium-4'"));
        button_four_stars.click();
        System.out.println("presioné 4 estrellas");

        //Select Checkbox Prime
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        checkbox_prime = driver.findElement(By.cssSelector("i[class='a-icon a-icon-checkbox']"));
        checkbox_prime.click();
        System.out.println("presioné prime");

        //Wait 5 seconds
        Thread.sleep(5000);
        //This xpath retrieve a List with all divs that contains the search results products
        List<WebElement> div_list = driver.findElements(By.xpath("//div[contains(@class,'s-result-list s-search-results')]/div/div"));
        //the size of the list is the total amount of products
        System.out.println("\nTotal products = "+div_list.size()+"\n");

        //xpath for all elements grid $x("//div[contains(@class,'s-search-results')][2]/div/div")
        //xpath for prices grid  $x("//div[@data-index='2']//span[@class='a-offscreen']")

        //xpath for all elements list $x("//div[contains(@class,'s-result-list')][2]/div/div/*")
        //xpath for price list $x("//div[@data-index='2']//span[@class='a-offscreen']")

        //base css
        xpath_product_base = "//div[@data-index='";
        //css to locate the price row
        xpath_price_row = "']//span[@class='a-offscreen']";

        //This loop iterates the product list
        for(int i = 0; i < div_list.size() - 1; i++ ) {
            //Try because some products don't have price
            try{
                //price = css_base + i + css_row
                price = driver.findElement(By.xpath(xpath_product_base + i + xpath_price_row));
            }
            catch (Exception e){
                //this just will ignore the product without price
                price = null;
            }
            //List of Strings to sort in order to get the cheaper product
            //Validate if the string is not empty
            if(price != null && !price.getAttribute("textContent").isEmpty()) {
                //print price
                System.out.println(price.getAttribute("textContent"));
                //save the price into a list of floats using replace to delete useless characters
                prices_float.add( Float.parseFloat(price.getAttribute("textContent").replace("$","").replace(",","")));
            }
        }

        //Validate if the list of floats is not empty
        if(!prices_float.isEmpty()) {
            //Use the Collection.sort(List) to re-order the prices
            Collections.sort(prices_float);
            System.out.println("\nSorted List:\n");
            //Iterate the float list
            for (Float sortedPrice : prices_float)
                System.out.println(sortedPrice);

            //Print product with lowest price => first element in the list
            System.out.println("\nThe lower price is: $" + prices_float.get(0));
        }
        else {
            System.out.println("The list of prices is empty");
            System.out.println("Trying again");
        }

        //Close current Window
        driver.close();
    }
}