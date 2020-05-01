package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class HandsOn4 {

    public static void main(String[] args) throws InterruptedException {

        String mercadoLibreURL = "https://www.mercadolibre.com.mx/";
        String searchBoxPath = "as_word";
        String searchButtonPath = "nav-search-btn";
        String postalCodePath = "//span[@class='andes-tooltip-button-close']";
        String firstProductPath = "//*[contains(text(),'SelenioSelenium200Mcg90CapsulasAnticancerigenoEgS3')]";
//ol[@id='searchResults']//li//div[@id='MLM770829615']";

//li[@class='results-itemhighlightedarticlegriditem-info-height-185']/div[@class="rowItemitemhighlighteditem--gridnewto-item"]/div[@class="item__imageitem__image--grid"]

        WebDriver driver = new WebDriverFactory().getDriver("chrome");

        driver.navigate().to(mercadoLibreURL);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

        WebElement searchBox;
        WebElement searchButton;
        WebElement postalCode;
        WebElement firstProduct;


        searchBox = driver.findElement(By.name(searchBoxPath));
        searchBox.sendKeys("Selenium");

        searchButton = driver.findElement(By.className(searchButtonPath));
        searchButton.click();

        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

        Thread.sleep(1000);

        postalCode = driver.findElement(By.xpath(postalCodePath));
        postalCode.click();

        Thread.sleep(10000);

        if (driver.findElement(By.id(firstProductPath)).isDisplayed()) {
            System.out.println("Thefistproductispresent");
        } else {
            System.out.println("Thepathisnotpresent");
        }

        Thread.sleep(1000);

        firstProduct = driver.findElement(By.className(firstProductPath));
        firstProduct.sendKeys(Keys.ENTER);

        Thread.sleep(1000);

        driver.close();
    }
}
