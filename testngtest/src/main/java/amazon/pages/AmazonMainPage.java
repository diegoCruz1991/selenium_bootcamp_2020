package amazon.pages;

import amazon.Sections.Footer;
import amazon.Sections.MainBody;
import amazon.Sections.TopNavMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonMainPage extends BasePage {


    public AmazonMainPage(WebDriver driver){
        super(driver,driver.getCurrentUrl());
    }

    //metodos de usuario - esto es por la metodologia de page object o steps que simulan pasos a seguir a hacer algo

    public AmazonResultsPage searchProductsBySection(String productNam, String sectionName){
        this.topNavigationMenu.selectSection(sectionName);
        this.topNavigationMenu.enterProductName(productNam);
        this.topNavigationMenu.clickOnSearchButton();

        return new AmazonResultsPage(this.driver);

    }

    public AmazonResultsPage searchProductsAllDepartments(String productName){
        this.topNavigationMenu.enterProductName(productName);
        this.topNavigationMenu.clickOnSearchButton();
        return new AmazonResultsPage(this.driver);

    }

    @Override
    public boolean isLoaded(){
        try{
            WebDriverWait wait = new WebDriverWait(this.driver,10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav-tools")));
            return true;

        }catch (Exception e){
            return false;
        }

    }


}
