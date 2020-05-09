package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        WebDriverWait wait = new WebDriverWait(myDriver,20);
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myDriver.get("https://www.inaturalist.org/places");

        WebElement txtSearch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("q")));
        WebElement btnSearch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='last default button']")));
        txtSearch.sendKeys("Colomos Guadalajara");
        btnSearch.click();

        List<WebElement> links = myDriver.findElements(By.cssSelector("#browsingtaxa > ul > li a"));


        System.out.println(links.size());
        for(int i = 1; i<= links.size()-1; i++) {
            //System.out.println(links.get(i).getAttribute("href"));

            List<WebElement> species = myDriver.findElements(By.cssSelector("span[class='comname ']"));
            //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span[class='comname ']")));
            //System.out.println(species.size());
            if (species.size() <= 0) {
                System.out.println("No hay especies para mostrar");
            } else {
                if (species.size() < i && species.size() > 0) {
                    System.out.println(species.get(0).getText());
                } else {
                    System.out.println(species.get(i).getText());
                    Thread.sleep(600);
                }
                // myDriver.get(links.get(i).getAttribute("href"));
            }
            links.get(i).getAttribute("href");
            links.get(i).click();
            Thread.sleep(2000);
        }

        myDriver.close();

       /* for (WebElement a: links) {
            String subCat = a.getAttribute("href");
            Thread.sleep(3000);
            myDriver.navigate().to(subCat);
            myDriver.navigate().back();

            //System.out.println(a.getAttribute("href"));


        }*/
    }
}
