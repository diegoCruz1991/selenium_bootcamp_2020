package amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AmazonMainPage extends BasePage {

    private static final String AMAZON_MAIN_PAGE = "https://www.amazon.com.mx/";

    public AmazonMainPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
    }

    //Metodos o acciones de usuario
    public AmazonResultsPage searchProductsBySection(String productName, String sectionName) {
        this.topNavigationMenu.selectSection(sectionName);
        this.topNavigationMenu.enterProductName(productName);
        this.topNavigationMenu.clickOnSearchButton();

        return new AmazonResultsPage(this.driver);
    }

    public AmazonResultsPage searchProductsInAllDepartments(String productName) {
        this.topNavigationMenu.enterProductName(productName);
        this.topNavigationMenu.clickOnSearchButton();

        return new AmazonResultsPage(this.driver);
    }

    public static void open(WebDriver driver) {
        driver.get(AMAZON_MAIN_PAGE);
    }

    @Override
    public boolean isLoaded() {
        try {
            WebDriverWait wait = new WebDriverWait(this.driver, 5);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav-tools")));

            return true;
        } catch(Exception e) {
            return false;
        }
    }
}
