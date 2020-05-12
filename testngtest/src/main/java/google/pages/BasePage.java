package google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver;
    protected String baseURL;

    public BasePage(WebDriver driver,String baseURL) {

        this.driver = driver;
        this.baseURL = baseURL;
        PageFactory.initElements(driver,this); //this se refiere asi mismo se va  a convertir al hijo que lo esta heredando
    }

 //   public BasePage(){}

    public boolean isLoaded() {

        return true;
    }

}