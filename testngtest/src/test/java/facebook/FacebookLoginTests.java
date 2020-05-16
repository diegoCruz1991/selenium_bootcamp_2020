package facebook;

import ejemplos.BaseTest;
import facebook.pages.FacebookLoginPage;
import org.testng.annotations.Test;
import utils.PropertyReader;

public class FacebookLoginTests extends BaseTest {

    @Test()
    public void validateLoginPage() {
        this.driver.get(PropertyReader.getProperty("test.properties", "TEST_URL"));

        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(this.driver);

        //facebookLoginPage.goToLoginPage().getBaseURL();
    }
}
