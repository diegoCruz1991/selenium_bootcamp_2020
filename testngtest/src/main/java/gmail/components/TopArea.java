package gmail.components;

import org.openqa.selenium.WebDriver;

public class TopArea extends BaseElement {

    private ProfilePanel profilePanel;

    public TopArea(WebDriver driver) {
        super(driver);
        this.profilePanel = new ProfilePanel(this.driver);
    }
}
