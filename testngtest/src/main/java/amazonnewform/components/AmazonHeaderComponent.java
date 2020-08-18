package amazonnewform.components;

import amazonnewform.pageobjects.header.AmazonAuthenticationMenuPageObject;
import amazonnewform.pageobjects.header.AmazonDirectAccessTabsPageObject;
import amazonnewform.pageobjects.header.AmazonSearchPageObject;
import amazonnewform.pageobjects.header.AmazonShoppingCartPageObject;
import org.openqa.selenium.WebDriver;

public class AmazonHeaderComponent {

    private AmazonSearchPageObject amazonSearchPageObject;

    private AmazonShoppingCartPageObject amazonShoppingCartPageObject;

    private AmazonDirectAccessTabsPageObject amazonDirectAccessTabsPageObject;

    private AmazonAuthenticationMenuPageObject amazonAuthenticationMenuPageObject;

    public AmazonHeaderComponent(WebDriver driver) {
        this.amazonSearchPageObject = new AmazonSearchPageObject(driver, driver.getCurrentUrl());
        this.amazonDirectAccessTabsPageObject = new AmazonDirectAccessTabsPageObject(driver, driver.getCurrentUrl());
        this.amazonAuthenticationMenuPageObject = new AmazonAuthenticationMenuPageObject(driver, driver.getCurrentUrl());
        this.amazonShoppingCartPageObject = new AmazonShoppingCartPageObject(driver, driver.getCurrentUrl());
    }

    public AmazonSearchPageObject getAmazonSearchPageObject() {
        return amazonSearchPageObject;
    }

    public AmazonShoppingCartPageObject getAmazonShoppingCartPageObject() {
        return amazonShoppingCartPageObject;
    }

    public AmazonDirectAccessTabsPageObject getAmazonDirectAccessTabsPageObject() {
        return amazonDirectAccessTabsPageObject;
    }

    public AmazonAuthenticationMenuPageObject getAmazonAuthenticationMenuPageObject() {
        return amazonAuthenticationMenuPageObject;
    }
}
