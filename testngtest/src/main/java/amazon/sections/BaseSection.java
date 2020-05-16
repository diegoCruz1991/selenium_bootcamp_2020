package amazon.sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseSection {

    protected WebDriver driver;

    public BaseSection(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
