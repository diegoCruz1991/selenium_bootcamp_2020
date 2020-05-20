package amazon.elements;

import org.openqa.selenium.WebElement;

public abstract class BaseElement {
    protected WebElement rootElement;

    public BaseElement(WebElement rootElement){
        this.rootElement=rootElement;
    }
}
