package amazon.pages;

import amazon.sections.Footer;
import amazon.sections.MainBodyHome;
import amazon.sections.TopNavigationMenu;
import org.openqa.selenium.WebDriver;

public class AmazonMainPage extends BasePage{

    private  TopNavigationMenu topNavigationMenu;
    private MainBodyHome mainBodyHome;
    private  Footer footer;



    public AmazonMainPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
        topNavigationMenu = new TopNavigationMenu();
        MainBodyHome = new MainBodyHome();
        Footer = new Footer();

    }


}
