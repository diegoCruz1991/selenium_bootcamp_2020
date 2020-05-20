package amazon.sections;

import amazon.elements.SearchElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopNavigationMenu extends BaseSection {

    private SearchElement searchElement;

    public TopNavigationMenu(WebDriver driver){
        super(driver);

    }

    private void initElement(){
        WebElement rootElement=this.driver.findElement(By.id("nav-search"));
        this.searchElement=new SearchElement(rootElement);
    }
    public void clickOnSearchButton(){
        this.searchElement.searchButton().click();
    }

    public void enterProductName(String productName){
        this.searchElement.searchButton().sendKeys(productName);
    }
    public void selectSection(String sectionName){
        this.searchElement.SectionsDropdown().selectByVisibleText(sectionName);

    }

    public void selectSections(int index){
        this.searchElement.SectionsDropdown().selectByIndex(index);
    }

}
