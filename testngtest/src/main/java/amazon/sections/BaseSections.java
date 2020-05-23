package amazon.sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseSections {

    protected WebDriver driver;

    public BaseSections(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
}