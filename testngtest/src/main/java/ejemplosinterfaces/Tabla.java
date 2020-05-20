package ejemplosinterfaces;

import org.openqa.selenium.WebElement;

import java.util.List;

public interface Tabla {

    List<WebElement> getColumns();

    List<WebElement> getRows();

    void selectRow();
}
