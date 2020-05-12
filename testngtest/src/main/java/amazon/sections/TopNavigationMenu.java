package amazon.sections;

import amazon.elements.SearchElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopNavigationMenu extends BaseSection {

    private SearchElement searchElement;

    public TopNavigationMenu(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        WebElement rootElement = this.driver.findElement(By.id("nav-search"));
        this.searchElement = new SearchElement(rootElement);
    }

    public void clickOnSearchButton() {
        this.searchElement.searchButton().click();
    }

    public void enterProductName(String productName) {
        this.searchElement.searchFieldElement().sendKeys(productName);
    }

    public void selectSection(String sectionName) {
        this.searchElement.sectionsDropdown().selectByVisibleText(sectionName);
    }

    public void selectSection(int index) {
        this.searchElement.sectionsDropdown().selectByIndex(index);
    }
}
