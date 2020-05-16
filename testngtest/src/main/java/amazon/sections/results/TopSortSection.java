package amazon.sections.results;

import amazon.sections.BaseSection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class TopSortSection extends BaseSection {

    @FindBy(how = How.NAME, using = "s")
    private WebElement sortDropdown;

    @FindBy(how = How.XPATH, using = "//div[@class = 'a-section a-spacing-small a-spacing-top-small']")
    private WebElement allResultsLabel;

    public TopSortSection(WebDriver driver) { super(driver); }

    public void selectSortType(String sortType) {
        Select sortSelect = new Select(sortDropdown);
        sortSelect.selectByVisibleText(sortType);
    }

    public String getAllResultsInfoLabel(){
       return this.allResultsLabel.getText();
    }

}
