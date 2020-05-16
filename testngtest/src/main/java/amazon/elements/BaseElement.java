package amazon.elements;

import org.openqa.selenium.WebElement;

public abstract class BaseElement {

    WebElement rootElement;

    public BaseElement(WebElement rootElement) {
        this.rootElement = rootElement;
    }

}
