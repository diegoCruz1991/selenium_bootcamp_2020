package mercury.commons;

import org.openqa.selenium.WebElement;

public class Cell {

    private String columnName;
    private WebElement cellValue;

    public Cell(String columnName, WebElement cellValue) {
        this.columnName = columnName;
        this.cellValue = cellValue;
    }

    public String getColumnName() {
        return columnName;
    }

    public WebElement getCellValue() {
        return cellValue;
    }
}
