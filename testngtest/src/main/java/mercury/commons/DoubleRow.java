package mercury.commons;

import google.elements.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DoubleRow extends BaseElement {

    //Esto puede ser un Map para facilitar la busqueda de celdas por columna
    private List<Cell> firstRowCells;
    //Esto puede ser un Map para facilitar la busqueda de celdas por columna
    private List<Cell> secondRowCells;
    private List<String> columns;
    private WebElement secondaryElement;

    public DoubleRow(WebElement rootElement, WebElement secondaryElement, List<String> columns) {
        super(rootElement);
        this.secondaryElement = secondaryElement;
        this.columns = columns;
        this.init();
    }

    private void init() {
        this.firstRowCells = new ArrayList<>();
        this.secondRowCells = new ArrayList<>();

        List<WebElement> firstCellElements = this.rootElement.findElements(By.xpath("./td"));

        for (int index = 0; index < firstCellElements.size(); index++) {
            this.firstRowCells.add(new Cell(this.columns.get(index), firstCellElements.get(0)));
        }

        List<WebElement> secondCellElements = this.secondaryElement.findElements(By.xpath("./td"));

        for (int index = 0; index < secondCellElements.size(); index++) {
            this.secondRowCells.add(new Cell(this.columns.get(1), secondCellElements.get(0)));
        }
    }

    public Cell getCellByColumnFromFirstRow(String column) {
        for(Cell cell : this.firstRowCells) {
            if(cell.getColumnName().equals(column)) {
                return cell;
            }
        }

        return null;
    }

    public Cell getCellByColumnFromSecondRow(String column) {
        for(Cell cell : this.secondRowCells) {
            if(cell.getColumnName().equals(column)) {
                return cell;
            }
        }

        return null;
    }
}
