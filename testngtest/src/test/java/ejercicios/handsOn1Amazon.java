package ejercicios;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.List;

public class handsOn1Amazon {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("https://www.amazon.com.mx/");
        WebElement mlSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
        mlSearchBox.sendKeys("Nintendo Switch");
        WebElement serachBtn = driver.findElement(By.xpath("//*[@class=\"nav-input\" and @type=\"submit\"]"));
        serachBtn.click();
        WebElement primeChk = driver.findElement(By.xpath("//*[@id=\"p_85/9841545011\"]/span/a/div/label/i"));
        primeChk.click();

        WebElement stars3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"p_72/7073864011\"]/span/a/section/span")));
        stars3.click();
        WebElement stars4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"p_72/7073863011\"]/span/a/section/span")));
        stars4.click();
        WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"a-autoid-0-announce\"]")));
        menu.click();
        WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_1\"]"));
        menuOption.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]")));
        List<WebElement> listOfProducts = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
        listOfProducts.get(0).click();

    }
}

/*
for(int i =0; i<categoriesBtns.size();i++){
            if(i>0){
                showFiltersBtn.click();
                categoriesBtns.get(i-1).click();
            }
            categoriesBtns.get(i).click();
           // showFiltersBtn.click();
            Thread.sleep(4000);
           // results = driver.findElements(By.xpath(xpaths.get("results")));
           // System.out.println(results.size());
        }

        Thread.sleep(4000);
            results = driver.findElements(By.xpath(xpaths.get("results")));
            System.out.println(results.size());
            int c =1;
            for (WebElement res:results) {
                if(res.getText().length()>0){
                    System.out.println(i++ + " - " +res.getText());
                }

            }
        */