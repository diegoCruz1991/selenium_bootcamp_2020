package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn1CSS {

    public static void main(String[] args) throws InterruptedException{


        //Tony De La Torre

        //CSS
        //search box = document.querySelector("input[id='twotabsearchtextbox'");
        //prime checkbox = document.querySelector("i[class='a-icon a-icon-checkbox']");
        //3+ starts checkbox = document.querySelector("i[class='a-icon a-icon-star-medium a-star-medium-3']");
        //4+ starts checkbox = document.querySelector("i[class='a-icon a-icon-star-medium a-star-medium-4']");
        //drop down sorting = document.querySelector("span[class='a-button-text a-declarative']");
        //drop down option lowest price = document.querySelector("a[id='s-result-sort-select_1'");
        //search results = document.querySelector("span[class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results']");


        WebDriver driver = WebDriverFactory.getDriver("chrome");


        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.amazon.com.mx");

        WebElement searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox'"));
        searchBox.sendKeys("Nintendo Switch");
        searchBox.sendKeys(Keys.ENTER);

        WebElement primeBox = driver.findElement(By.cssSelector("i[class='a-icon a-icon-checkbox']"));
        primeBox.click();

        WebElement starRating = driver.findElement(By.cssSelector("i[class='a-icon a-icon-star-medium a-star-medium-3']"));
        starRating.click();

        starRating = driver.findElement(By.cssSelector("i[class='a-icon a-icon-star-medium a-star-medium-4']"));
        starRating.click();

        WebElement dropdown = driver.findElement(By.cssSelector("span[class='a-button-text a-declarative']"));
        dropdown.click();
        WebElement lowestPriceOption = driver.findElement(By.cssSelector("a[id='s-result-sort-select_1']"));
        lowestPriceOption.click();

        Thread.sleep(5000);

        String s = driver.findElements(By.cssSelector("span[class ~= 'a-text-normal']")).get(0).getText();

        String s1 = driver.findElement(By.cssSelector("span[class = 'a-price-symbol']")).getText();
        String s2 = driver.findElement(By.cssSelector("span[class = 'a-price-whole']")).getText();
        String s3 = driver.findElement(By.cssSelector("span[class = 'a-price-fraction']")).getText();

        s1 = s1+s2+"."+s3;
        System.out.println("Cheapest Product: "+s);
        System.out.println("Price: "+s1);

        driver.close();

    }


}
