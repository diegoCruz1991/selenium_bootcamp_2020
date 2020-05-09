package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

public class LocatorsExercise1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver chrome = WebDriverFactory.getDriver("chrome");

        chrome.get("https://www.mercadolibre.com.mx");

        assert chrome.getCurrentUrl().equals("https://www.mercadolibre.com.mx") : "La pagina no es la misma";

        //WebElement searchBox = chrome.findElement(By.xpath("//input[@class=nav-search-input]")); as_word
        WebElement searchBox = chrome.findElement(By.name("as_word"));
        WebElement button = chrome.findElement(By.className("nav-search-btn"));

        searchBox.sendKeys("Selenium");
        button.click();
    }
}
