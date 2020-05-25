package amazon.pages;

import amazon.section.Footer;
import amazon.section.MainBody;
import amazon.section.TopNavMenu;
import org.openqa.selenium.WebDriver;

public class AmazonMainPage extends BasePage {
    private TopNavMenu topnavmenu;
    private MainBody mainbody;
    private Footer footer;
    public AmazonMainPage(WebDriver driver){

        super(driver, driver.getCurrentUrl());
        topnavmenu = new TopNavMenu(driver);



    }



}
