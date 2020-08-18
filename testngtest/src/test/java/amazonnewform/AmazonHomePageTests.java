package amazonnewform;

import amazonnewform.usersteps.AmazonHomePageUserSteps;
import org.testng.annotations.Test;

public class AmazonHomePageTests extends BaseTestCase {

    @Test
    public void validateHomePage() {
        this.myDriver.get("https://www.amazon.com.mx/");

        AmazonHomePageUserSteps amazonHomePageUserSteps = new AmazonHomePageUserSteps(this.myDriver);

        amazonHomePageUserSteps.searchAProduct("PS4");
    }
}
