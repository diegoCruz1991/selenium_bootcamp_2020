package amazon.pages;

import amazon.sections.Footer;
import amazon.sections.MainBody;
import amazon.sections.TopNavigationMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonMainPage extends BasePage {



    public AmazonMainPage(WebDriver driver){
        super(driver,driver.getCurrentUrl());
        topNavigationMenu= new TopNavigationMenu(driver);
        mainBody=new MainBody(driver);
        footer=new Footer(driver);
    }

    // Métodos de usuario

    public Object searchProductsBySection(String productName, String sectionName){
        this.topNavigationMenu.selectSection(sectionName);
        this.topNavigationMenu.enterProductName(productName);

        return new AmazonResultsPage(this.driver);
    }

    public Object searchProductsInAllDepartments(String productName){
        this.topNavigationMenu.enterProductName(productName);
        this.topNavigationMenu.clickOnSearchButton();

        return new AmazonResultsPage(this.driver);
    }

    @Override
    public void isLoaded(){
    try{
        WebDriverWait wait=new WebDriverWait(this.driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav-tools")));

    } catch (Exception e) {
        e.printStackTrace();
    }
    }

}
