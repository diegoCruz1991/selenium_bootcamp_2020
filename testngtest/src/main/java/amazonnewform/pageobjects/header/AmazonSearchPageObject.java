package amazonnewform.pageobjects.header;

import amazonnewform.pageobjects.AmazonBasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AmazonSearchPageObject extends AmazonBasePageObject {

    @FindBy(how = How.ID, using = "searchDropdownBox")
    private WebElement filterDropdown;

    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(how = How.ID, using = "nav-search-submit-text")
    private WebElement searchButton;

    public AmazonSearchPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnSearchButton() {
        this.searchButton.click();
    }

    public void sendKeysSearchBox(String word) {
        this.searchBox.clear();
        this.searchBox.sendKeys(word);
    }

    public Select getSelectDropdown() {
        Select dropdown = new Select(this.filterDropdown);

        return dropdown;
    }
}
