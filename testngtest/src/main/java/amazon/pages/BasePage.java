package amazon.pages;

import amazon.Sections.Footer;
import amazon.Sections.MainBody;
import amazon.Sections.TopNavMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;
    protected String baseURL;

    protected TopNavMenu topNavigationMenu;
    protected MainBody mainbody;
    protected Footer footer;

    public BasePage(WebDriver driver, String baseURL) {

        this.driver = driver;
        this.baseURL = baseURL;

        PageFactory.initElements(driver,);
        topNavigationMenu = new  TopNavMenu(driver);

        mainbody = new MainBody(driver);

        footer = new Footer(driver);
    }

    public boolean isLoaded() {
        return true;
    }
}
