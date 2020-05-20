package ejemplosinterfaces;

import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class PrimeraTabla implements Tabla {
    @Override
    public List<WebElement> getColumns() {
        return null;
    }

    @Override
    public List<WebElement> getRows() {
        return null;
    }

    public void metodoCustom() {

    }
}
