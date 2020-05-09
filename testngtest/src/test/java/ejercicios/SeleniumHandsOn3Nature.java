package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn3Nature {

    public static void main(String[] args) throws InterruptedException{

        //tony de la torre

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        Random ranGen = new Random();
        int resSize = 0;
        int index = 0;


        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.inaturalist.org");

        WebElement elem = driver.findElement(By.cssSelector("li[class ~= 'moretab'] > div"));

        Actions a = new Actions(driver);
        a.moveToElement(elem).perform();
        WebElement opt = driver.findElement(By.cssSelector("ul[aria-labelledby='header-more-dropdown-toggle'] li a[href='/places']"));
        a.moveToElement(opt).perform();
        a.click().build().perform();

        WebElement search = driver.findElement(By.cssSelector("input[class = 'text']"));
        search.sendKeys("Colomos, Guadalajara");
        search.sendKeys(Keys.ENTER);

        //Menus
        List <WebElement> taxonMenu = driver.findElements(By.cssSelector("a[class ~= 'taxon'][href ^= '/places/colomos?']"));

        for(WebElement e : taxonMenu) {
            System.out.println("********* Category: "+e.getText()+"**********");
            e.click();


            Thread.sleep(3000);

            //printing random name
            List<WebElement> res = driver.findElements(By.cssSelector("span[class ~= 'comname']"));
            if(res.size() > 0){

                resSize = res.size();
                index = ranGen.nextInt(resSize);
                System.out.println(res.get(index).getText());

            } else{
                System.out.println("No elements listed for this category...");
            }
        }

       Thread.sleep(3000);

        driver.close();


    }


}
