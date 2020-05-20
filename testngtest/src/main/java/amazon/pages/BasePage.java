package amazon.pages;

import amazon.sections.Footer;
import amazon.sections.MainBodyHome;
import amazon.sections.TopNavigationMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver;

    protected String baseURL;

    protected TopNavigationMenu topNavigationMenu;

    protected MainBodyHome mainBodyHome;

    protected Footer footer;

    public BasePage(WebDriver driver, String baseURL) {
        this.driver = driver;
        this.baseURL = baseURL;
        initSections();
        PageFactory.initElements(driver, this);
    }

    private void initSections() {
        if (this.isLoaded()) {
            topNavigationMenu = new TopNavigationMenu(driver);
            mainBodyHome = new MainBodyHome(driver);
            footer = new Footer(driver);
        }
    }

    public boolean isLoaded() {
        return true;
    }
}
