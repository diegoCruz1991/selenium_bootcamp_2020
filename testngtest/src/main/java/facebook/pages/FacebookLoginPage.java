package facebook.pages;

import facebook.components.login.LoginBodyComponent;
import facebook.components.login.LoginFooterComponent;
import facebook.components.login.LoginHeaderComponent;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPage extends BasePage{

    private LoginHeaderComponent loginHeaderComponent;

    private LoginBodyComponent loginBodyComponent;

    private LoginFooterComponent loginFooterComponent;

    public FacebookLoginPage(WebDriver driver) {
        super(driver);
        this.loginHeaderComponent = new LoginHeaderComponent(driver);
    }

    public FacebookLoginPage goToLoginPage() {
        this.loginHeaderComponent.clickOnFacebookIcon();
        return new FacebookLoginPage(this.driver);
    }
}
