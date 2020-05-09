package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn7 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver chrome = WebDriverFactory.getDriver("chrome");

        chrome.get("https://www.amazon.com.mx");
        chrome.manage().window().maximize();

        chrome.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        WebElement searchBox = chrome.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        WebElement searchButton = chrome.findElement(By.xpath("//input[@type='submit']"));

        searchBox.sendKeys("Nintendo Switch");
        searchButton.click();

       WebElement checkBox = chrome.findElement(By.xpath("//div[contains(@class, 'a-checkbox') and following-sibling::i[contains(@class,'a-icon-prime')]]//i"));
        checkBox.click();

       WebElement stars3 = chrome.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-3']"));
        stars3.click();

        WebElement stars4 = chrome.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']"));
        stars4.click();

        WebElement dropDown = chrome.findElement(By.xpath("//select[@id='s-result-sort-select']"));

        Select dropDownSelect = new Select(dropDown);

        dropDownSelect.selectByValue("price-asc-rank");

        WebElement precio = chrome.findElement(By.xpath("//div[@data-asin='B07CSNPN2D']/descendant-or-self::span[@class='a-price-whole']"));

        System.out.println(precio.getText());

        chrome.close();

    }
}
