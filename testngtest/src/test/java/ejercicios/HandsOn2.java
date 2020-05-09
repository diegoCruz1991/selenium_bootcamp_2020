package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn2 {

    public static void main(String[] args) throws InterruptedException {

        //Create new Instance of Chrome By WebDriverFactory
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //Set PageLoadTime
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

        driver.get("https://www.inaturalist.org/");
        driver.manage().window().maximize();
        System.out.println("\nThe target page for this test is: "+driver.getCurrentUrl()+"\n");

        Actions actions;

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //Get Dropdown
        WebElement dropdown = driver.findElement(By.cssSelector("div[id='header-more-dropdown-toggle']"));
        actions = new Actions(driver);
        actions.moveToElement(dropdown).perform();

        //Get places
        WebElement lugares = driver.findElement(By.cssSelector("a[href='/places'] "));
        //move mouse to places to click it while is visible
        actions.moveToElement(lugares).perform();
        lugares.click();

        WebElement search_bar = driver.findElement(By.id("q"));
        search_bar.sendKeys("Colomos Guadalajara");
        search_bar.submit();

        // Create a list with all the a elements
        List<WebElement> nombres =  driver.findElements(By.xpath("//a[contains(@class,'taxon')]"));

        int i = 0;

        for(WebElement elementolista : nombres){
            elementolista.click();
            Thread.sleep(1000);
            System.out.println("Tipo de ejemplares: "+nombres.get(i).getText());
            i++;
            try {
                WebElement element = driver.findElement(By.cssSelector("span[class='sciname']"));
                System.out.println("Ejemplar: " + element.getText() + "\n");
            }catch (Exception e){
                System.out.println("No se encontró un ejemplar para esta categoría\n");
            }
        }

        //Close current Window
        driver.close();
    }

}
