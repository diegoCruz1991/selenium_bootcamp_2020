package gmail.pages;

import gmail.components.EmailArea;
import gmail.components.LeftArea;
import gmail.components.TopArea;
import gmail.enums.EmailTabs;
import gmail.factory.EmailAreaFactory;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    private TopArea topArea;
    private LeftArea leftArea;
    private EmailArea emailArea;

    public MainPage(WebDriver driver) {
        super(driver);
        this.topArea = new TopArea(this.driver);
        this.emailArea = EmailAreaFactory.getEmailArea(EmailTabs.PRIMARY, driver);
        this.leftArea = new LeftArea(this.driver);
    }

    public TopArea getTopArea() {
        return topArea;
    }

    public LeftArea getLeftArea() {
        return leftArea;
    }

    public EmailArea getEmailArea() {
        return emailArea;
    }
}
