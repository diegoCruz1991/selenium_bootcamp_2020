package amazon.pages;

import amazon.sections.Footer;
import amazon.sections.MainBody;
import amazon.sections.TopNavigationMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver;
    protected String baseURL;
    protected TopNavigationMenu topNavigationMenu;
    protected MainBody mainBody;
    protected Footer footer;

    public BasePage(WebDriver driver, String baseURL){
        this.driver=driver;
        this.baseURL=baseURL;
        PageFactory.initElements(driver,this);
    }
    public void isLoaded(){
        //return true;
    }
}
