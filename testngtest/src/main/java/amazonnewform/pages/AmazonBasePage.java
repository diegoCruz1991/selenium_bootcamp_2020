package amazonnewform.pages;

import amazonnewform.components.AmazonFooterComponent;
import amazonnewform.components.AmazonHeaderComponent;
import amazonnewform.components.AmazonMainAreaComponent;
import org.openqa.selenium.WebDriver;

public class AmazonBasePage {

    private AmazonHeaderComponent amazonHeaderComponent;

    private AmazonMainAreaComponent amazonMainAreaComponent;

    private AmazonFooterComponent amazonFooterComponent;

    public AmazonBasePage(WebDriver driver) {
        this.amazonHeaderComponent = new AmazonHeaderComponent(driver);
        this.amazonMainAreaComponent = new AmazonMainAreaComponent(driver);
        this.amazonFooterComponent = new AmazonFooterComponent(driver);
    }

    public AmazonHeaderComponent getAmazonHeaderComponent() {
        return amazonHeaderComponent;
    }

    public AmazonMainAreaComponent getAmazonMainAreaComponent() {
        return amazonMainAreaComponent;
    }

    public AmazonFooterComponent getAmazonFooterComponent() {
        return amazonFooterComponent;
    }
}
