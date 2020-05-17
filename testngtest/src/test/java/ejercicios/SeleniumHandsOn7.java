package ejercicios;

import com.sun.xml.internal.bind.v2.runtime.ElementBeanInfoImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn7 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.inaturalist.org");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement dropDown = driver.findElement(By.xpath("//div[@id='header-more-dropdown-toggle']"));
        dropDown.click();

        WebElement placesLink= driver.findElement(By.linkText("Places"));
        placesLink.click();

        WebElement searchPlaceBox= driver.findElement(By.xpath("//input[@id='q']"));
        searchPlaceBox.sendKeys("Colomos, Guadalajara");
        searchPlaceBox.submit();

        List<WebElement> subCategoriesList = driver.findElements(By.xpath("//ul[@class='taxon_links']/descendant::a")); //returns a list with 20 subcategories links

  //      subCategoriesList.get(0).click();
  //      WebElement animal = driver.findElement(By.xpath("//div[@class='info']//span[@class='sciname']"));
  //      System.out.println(animal.getText());


        for (WebElement subcategory: subCategoriesList){
            subcategory.click();
            WebElement animal = driver.findElement(By.xpath("//div[@class='info']//span[@class='sciname']"));
            System.out.println(animal.getText());
        }

        driver.close();

    }
}