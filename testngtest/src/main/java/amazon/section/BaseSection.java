package amazon.section;

import org.openqa.selenium.WebDriver;

public class BaseSection {

    protected WebDriver driver;

    public BaseSection(WebDriver driver){
        this.driver = driver;
    }

}
