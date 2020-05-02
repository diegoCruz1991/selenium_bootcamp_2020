package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumExercise10 {

    public static void main (String[] args) throws InterruptedException{

        //setting sleep time value for Threads and load time for driver timeout
        int sleepTime = 20000;
        int loadTime = 20;

        //1. create new chrome driver object using WebDriverFactory from utils
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. set up page load time limit
        driver.manage().timeouts().pageLoadTimeout(loadTime, TimeUnit.SECONDS);

        //3. go to Mercado Libre
        driver.get("https://www.mercadolibre.com.mx");

        //4. obtain element for search field by name
        WebElement searchField = driver.findElement(By.name("as_word"));

        //5. entering search string and keying in enter
        searchField.sendKeys("alcohol en gel");
        searchField.sendKeys(Keys.ENTER);

        //6. putting thread to sleep
        Thread.sleep(sleepTime);

        //7. obtain element for search field by classname
        searchField = driver.findElement(By.className("nav-search-input"));

        //8. clearing search field
        searchField.clear();

        //9. obtain element for search field by name
        searchField.sendKeys("alcohol en gel");
        searchField.sendKeys(Keys.ENTER);

        //10. putting thread to sleep
        Thread.sleep(sleepTime);

        //11. Saving entire list of search results from element container by FULL xpath in a WebElement list
        List<WebElement> searchResults = driver.findElements(By.xpath("/html/body/main/div[1]/div/section/ol/li"));

        //12. Printing out the list size
        System.out.println(searchResults.size());

        //13. emulating click on 1st search result (any can be selected by changing the index)
        searchResults.get(0).click();

        //14. putting thread to sleep
        Thread.sleep(sleepTime);

        //15. closing browser.
        driver.close();


    }

}
