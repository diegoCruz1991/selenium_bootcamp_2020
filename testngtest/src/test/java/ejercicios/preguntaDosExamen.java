package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.List;

public class preguntaDosExamen {
    public static void main(String[] args) throws InterruptedException {
        getSeleniumLinks();
    }

    public static void getSeleniumLinks(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("https://es.wikipedia.org/wiki/Selenium");

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//a[contains(text(),'elenium')]")); //to incluide Selenium and selenium
        for (WebElement link: listOfLinks){
            System.out.println(link.getAttribute("href"));
        }
        driver.quit();
    }
}
