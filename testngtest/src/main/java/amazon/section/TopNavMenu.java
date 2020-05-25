package amazon.section;

import amazon.elements.SearchElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopNavMenu extends BaseSection{

    private SearchElement searchElement;

    public TopNavMenu(WebDriver driver) {
    super(driver);
    initElements();
    }

    private void initElements(){
        WebElement rootElement = this.driver.findElement(By.id("nav-search"));
        this.searchElement = new SearchElement(rootElement);
    }

    public void clickOnSearchButton(){
        this.searchElement.searchButton().click();
    }
    }

