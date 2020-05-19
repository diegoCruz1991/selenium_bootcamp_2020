package amazon.pages;

import org.openqa.selenium.WebDriver;

public class AmazonResultsPage extends BasePage {



    public AmazonResultsPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
    }

}
