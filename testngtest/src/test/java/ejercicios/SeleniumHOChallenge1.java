package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumHOChallenge1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver chrome = WebDriverFactory.getDriver("chrome");

        chrome.get("https://www.inaturalist.org");
        chrome.manage().window().maximize();

        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement dropDown1 = chrome.findElement(By.xpath("//ul[contains(@class, 'navtabs')]/li[3]//i[@class='fa fa-angle-down']"));
        Thread.sleep(7000);
        dropDown1.click();
        dropDown1.click();

        WebElement places = chrome.findElement(By.xpath("//ul[contains(@class, 'navtabs')]/li[3]//ul/li[3]/a[@href='/places']"));
        places.click();

        WebElement searchBox1 = chrome.findElement(By.xpath("//input[@name='q']"));
        searchBox1.sendKeys("Colomos, Guadalajara");

        WebElement searchButton1 = chrome.findElement(By.xpath("//input[@name='commit']"));
        searchButton1.click();

        List<WebElement> category = chrome.findElements(By.xpath("//a[contains(@class,'taxon')]"));

        for (WebElement i : category) {
            i.click();
            System.out.println("Category: " + i.getText());
            Thread.sleep(2000);

            try {
                WebElement categoryElement = chrome.findElement(By.xpath("//a[@class='name comname']"));
                System.out.println("Element: " + categoryElement.getText() + "\n");
            }

            catch (Exception e) {
                System.out.println("No elements displayed\n");
            }
        }
        chrome.close();
    }
}
