package amazon.Sections;

import amazon.elements.SearchElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopNavMenu extends BaseSections {

    private SearchElement searchElement;

    public TopNavMenu(WebDriver driver){
        super(driver);
        initElements();
    }

    private void initElements(){
        WebElement rootElement = this.driver.findElement(By.id("nav-search"));
        this.searchElement = new SearchElement(rootElement);
    }

    public void clickOnSearchButton(){
        this.searchElement.SearchButton().click();

    }

    public void enterProductName(String productName){
        this.searchElement.SearchFileE().sendKeys(productName);
    }

    public void selectSection(int index){
        this.searchElement.SectionDropD().selectByIndex(index);
    }

    public void selectSection(String sectionName){
        this.searchElement.SectionDropD().selectByVisibleText(sectionName);
    }

}
