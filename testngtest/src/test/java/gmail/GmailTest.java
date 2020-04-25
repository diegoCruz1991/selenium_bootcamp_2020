package gmail;

import gmail.components.ProfilePanel;
import gmail.components.TopArea;
import gmail.pages.LoginPage;
import gmail.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

public class GmailTest {

    @BeforeClass
    public void setUp() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        LoginPage loginPage = new LoginPage(driver);
        //loginPage.login();
    }

    @Test
    public void test() {
        //MainPage mainPage = new MainPage();
        //TopArea topArea = mainPage.getTopArea();
        //ProfilePanel profilePanel = topArea.clickOnProfile();

        //profilePanel.getName();

    }
}
