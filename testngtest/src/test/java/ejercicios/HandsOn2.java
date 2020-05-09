package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn2 {

    public static void main(String[] args) throws InterruptedException {


        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        myDriver.get("https://www.inaturalist.org");
        Thread.sleep(3000);

        WebElement moreB = myDriver.findElement(By.cssSelector("li[class='navtab moretab menutab']"));
        moreB.click();
        moreB.click();

        WebElement places = myDriver.findElement(By.cssSelector("li a[href='/places']"));
        places.click();
        Thread.sleep(3000);

       // WebElement sbutton = myDriver.findElement(By.xpath("//button[@class='btn btn-default btn-inat btn-focus show-btn']"));
        //sbutton.click();
        //WebElement search = myDriver.findElement(By.xpath("//input[contains(@class,'form-control ui-autocomplete-input')]"));
        //search.sendKeys("Colomos");
        //search.submit();

        WebElement searchc = myDriver.findElement(By.xpath("//input[@class='text']"));
        searchc.sendKeys("Colomos, Guadalajara");
        searchc.sendKeys(Keys.ENTER); //Para simular entergit

        Thread.sleep(6000);


        List<WebElement> submenu = myDriver.findElements(By.xpath("//a[contains(@class,'taxon')][starts-with(@href,'/places/colomos')]"));
        System.out.println(submenu.size());

        for(WebElement a : submenu) {
            System.out.println("menu opcion " +a.getText());
            a.click();

            List<WebElement> birdopt = myDriver.findElements(By.xpath("//span[contains(@class,'comname')]"));
            System.out.println("pajarito " + birdopt.get(0).getText());

        }


        myDriver.close();
    }
}
