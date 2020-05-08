package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class handsOn3iNaturalist {

    public static void main(String[] args) throws InterruptedException {

        Map< String,String> xpaths = new HashMap< String,String>();
        String str2search = "Colomos, Guadalajara";
        xpaths.put("searchBtn","//button[contains(@class,'show-btn')]");
        xpaths.put("searchTxt","//input[@placeholder = 'Search']");
        xpaths.put("searchOption","//li[contains(@class,'ac-result ui-menu-item') ]//div[contains(@class,'ac-label') and contains(text(),'"+str2search+"')]");
        xpaths.put("tabTitle","//div[@class='stat-title' and contains(text(),'Species')]");
        xpaths.put("showFiltersBtn","//button[@uib-tooltip='Filters']");
        xpaths.put("categoriesBtns","//div[@id='filters-categories']//i");
        xpaths.put("results","//a[@class='display-name comname' or @class='display-name sciname' ]");
        xpaths.put("languageBtn","//*[@id='footer-locale-chooser']/button");


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("https://www.inaturalist.org/");
        driver.manage().window().maximize();

        WebElement languageBtn = driver.findElement(By.xpath(xpaths.get("languageBtn")));
        WebElement searchBtn = driver.findElement(By.xpath(xpaths.get("searchBtn")));
        searchBtn.click();
        WebElement searchTxt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpaths.get("searchTxt"))));
        searchTxt.sendKeys(str2search);
        WebElement searchOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpaths.get("searchOption"))));
        searchOption.click();
        WebElement tabTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpaths.get("tabTitle"))));
        tabTitle.click();
        WebElement showFiltersBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpaths.get("showFiltersBtn"))));
        showFiltersBtn.click();

        List<WebElement> categoriesBtns = driver.findElements(By.xpath(xpaths.get("categoriesBtns")));
        List<WebElement> results;
        //System.out.println(categoriesBtns.size());

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        Actions actions = new Actions(driver);

        int longest = 32;
        int rounded = 0;
        int reslen = 0;
        String tabs[] ={"\t","\t\t","\t\t\t","\t\t\t\t","\t\t\t\t\t","\t\t\t\t\t\t","\t\t\t\t\t\t\t","\t\t\t\t\t\t\t","\t\t\t\t\t\t\t\t"};
        String ln = "";
        String name2print = "";
        for(int i =0; i<categoriesBtns.size();i++){
            if(i>0){
                actions.moveToElement(showFiltersBtn);
                actions.perform();
                showFiltersBtn.click();
                wait.until(ExpectedConditions.visibilityOf(categoriesBtns.get(i-1))).click();
            }
            wait.until(ExpectedConditions.visibilityOf(categoriesBtns.get(i))).click();
            showFiltersBtn.click();
            System.out.println("\nSubcategory: "+categoriesBtns.get(i).getAttribute("class").replaceAll("icon-iconic-","").toUpperCase()+"");
            Thread.sleep(2500);
            scrollDown(driver);

            results = driver.findElements(By.xpath(xpaths.get("results")));
            Thread.sleep(500);
            actions.moveToElement(showFiltersBtn);
            actions.perform();

            int c =1;

            for (WebElement res:results) {
                ln = "";
                reslen = res.getText().length();
                rounded = (reslen-reslen%4)+4;
                if(rounded > longest){
                    rounded = longest;
                }
                if(reslen>0){
                    if(reslen>longest) {
                        name2print = res.getText().substring(0,31);
                    }else{
                        name2print = res.getText();
                    }
                    if(c%5==0){
                        ln = "\n";
                    }
                    c++;
                    System.out.print(name2print+tabs[(longest-rounded)/4]+ln);
                }
            }
            System.out.println("\nSub-Total = "+ (c-1));

        }
        //System.out.println(longest+ "<>"+reslen);
        driver.quit();
    }

    public static void scrollDown(WebDriver driver) throws InterruptedException
    {
        try {
            Object lastHeight = ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");

            while (true) {
                ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
                Thread.sleep(400);

                Object newHeight = ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
                if (newHeight.equals(lastHeight)) {
                    break;
                }
                lastHeight = newHeight;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
