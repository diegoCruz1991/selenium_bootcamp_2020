package amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonMainPage extends BasePage {

    private static final String AMAZON_MAIN_PAGE = "https://www.amazon.com.mx/";

    public AmazonMainPage(WebDriver driver){
        super(driver, driver.getCurrentUrl());
    }

    //User Methods

    public static void open(WebDriver driver) {
        driver.get(AMAZON_MAIN_PAGE);
    }

    public AmazonResultsPage searchProductsBySection(String sectionName, String productName) {
        topNavigationMenu.selectSection(sectionName);
        topNavigationMenu.enterProductName(productName);
        topNavigationMenu.clickOnSearchButton();
        return new AmazonResultsPage(this.driver);
    }

    public AmazonResultsPage searchProductsByAllDepartments(String productName) {
        this.topNavigationMenu.enterProductName(productName);
        this.topNavigationMenu.clickOnSearchButton();
        return new AmazonResultsPage(this.driver);
    }

    @Override
    public boolean isLoaded() {
        try {
            WebDriverWait wait = new WebDriverWait(this.driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav-tools")));
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

}
