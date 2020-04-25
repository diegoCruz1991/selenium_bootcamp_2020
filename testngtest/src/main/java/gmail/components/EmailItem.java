package gmail.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailItem extends BaseElement {

    private WebElement rootItem;

    public EmailItem(WebElement rootItem) {
        this.rootItem = rootItem;
    }


    public WebElement email() {
        //rootItem.findElement();
        return null;
    }
}
