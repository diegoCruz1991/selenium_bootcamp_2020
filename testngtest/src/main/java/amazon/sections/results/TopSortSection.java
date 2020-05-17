package amazon.sections.results;

import amazon.sections.BaseSection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class TopSortSection extends BaseSection {

    @FindBy(how = How.NAME, using= "s")
    private WebElement sortDropdownElement;

    @FindBy(how = How.XPATH, using= "(//h1[contains(@class,'s-desktop-toolbar')]//div[contains(@class,'a-section')])[1]")
    private WebElement allResultsInfoLabel;

    public TopSortSection(WebDriver driver){ super(driver); }


    public void selectSortType(String sortType){
        Select sortSelect = new Select(sortDropdownElement);
        sortSelect.deselectByVisibleText(sortType);
    }

    public String getAllResultsInfoLabel(){
        return this.allResultsInfoLabel.getText();
    }


}
