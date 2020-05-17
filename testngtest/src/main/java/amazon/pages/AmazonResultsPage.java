package amazon.pages;


import amazon.sections.MainBodyResults;
import org.openqa.selenium.WebDriver;

public class AmazonResultsPage extends BasePage {

    private MainBodyResults mainBodyResults;


    public AmazonResultsPage(WebDriver driver){
        super(driver, driver.getCurrentUrl());
        this.mainBodyResults = new MainBodyResults(this.driver);
    }

    public void orderResultsBySortType(String sortType){


    }
}
