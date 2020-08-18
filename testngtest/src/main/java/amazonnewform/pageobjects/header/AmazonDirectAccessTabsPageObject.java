package amazonnewform.pageobjects.header;

import amazonnewform.pageobjects.AmazonBasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AmazonDirectAccessTabsPageObject extends AmazonBasePageObject {

    @FindBy(how =How.XPATH, using = "//a[child::div[@id = 'glow-ingress-block']]")
    private WebElement chooseAddressButton;

    @FindBy(how = How.XPATH, using = "//div[@id, 'nav-xshop']/a")
    private List<WebElement> directAccesses;

    public AmazonDirectAccessTabsPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnChooseAddressButton() {
        this.chooseAddressButton.click();
    }

    public WebElement getDirectAccessButton(String daOption) {
        for (WebElement directAccess : this.directAccesses) {
            if ((directAccess.isEnabled() && directAccess.isDisplayed())
                    && directAccess.getText().equalsIgnoreCase(daOption)) {
                return directAccess;
            }
        }

        return null;
    }
}
