package gmail.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EmailArea extends BaseElement {

    private List<EmailItem> emails;

    public EmailArea(WebDriver driver) {
        super(driver);
        initEmails();
    }

    private void initEmails() {
        List<WebElement> emailElemenets = driver.findElements(By.xpath("//table/tbody/tr"));

        for(WebElement emailRow : emailElemenets) {
            emails.add(new EmailItem(emailRow));
        }
    }
}
