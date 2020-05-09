package seleniumHandsOnTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.WebDriverFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn6 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,20);
        //open google in current window
        driver.get("https://www.amazon.com.mx");
        assert driver.getCurrentUrl().equals("https://www.amazon.com.mx"): "No es la pagina de facebook";

        WebElement searchTextbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
        searchTextbox.sendKeys("Nintendo Switch");
        searchTextbox.submit();

        WebElement checkbox = driver.findElement(By.cssSelector("a.a-link-normal.s-navigation-item div.a-checkbox.a-checkbox-fancy.s-navigation-checkbox.aok-float-left label i.a-icon.a-icon-checkbox"));
        checkbox.click();

        /*

       Para seleccionar el checkbox div+i[class="a-icon a-icon-prime a-icon-medium"] o este div+i[aria-label="Amazon Prime"]
         */
        Thread.sleep(10000);

        WebElement stars3 = driver.findElement(By.cssSelector("i.a-star-medium-3"));
        stars3.click();
        WebElement stars4 = driver.findElement(By.cssSelector("i.a-star-medium-4"));
        stars4.click();
        WebElement selectMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"a-autoid-0-announce\"]")));
        selectMenu.click();
        WebElement selectOption = driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_1\"]"));
        selectOption.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]")));
        List<WebElement> listOfProducts = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
        listOfProducts.get(0).click();



        Thread.sleep(10000);

        driver.close();

    }


}
