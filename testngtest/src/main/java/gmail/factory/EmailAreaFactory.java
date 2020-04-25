package gmail.factory;

import gmail.components.EmailArea;
import gmail.enums.EmailTabs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailAreaFactory {

    private EmailAreaFactory(){}

    public static EmailArea getEmailArea(EmailTabs section, WebDriver driver) {
        EmailArea emailArea = null;
        switch(section) {
            case PRIMARY:
                WebElement primaryTab = driver.findElement(By.id("primary"));
                primaryTab.click();
                break;
            case SOCIAL:
                //socialTab.click();
                break;
            case PROMOTIONS:
                //promotionsTab.click();
                break;
        }
        return new EmailArea(driver);
    }
}
