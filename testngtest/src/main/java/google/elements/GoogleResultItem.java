package google.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleResultItem extends BaseElement {

    public GoogleResultItem(WebElement rootElement) { super(rootElement); }

    private WebElement title() { return this.rootElement.findElement(By.xpath("//div[@class='r']//h3")); }

    private String description() {
        return this.rootElement.getText();
    }

    public String getTitle() {
        return this.title().getText();
    }

    public void clickOnTitle() {
        this.title().click();
    }

    public String getDescription() {
        return this.description();
    }

    public void click() {
        this.rootElement.click();
    }

    @Override
    public String toString() {
        return String.format("%s\n", this.getDescription());
    }
}
