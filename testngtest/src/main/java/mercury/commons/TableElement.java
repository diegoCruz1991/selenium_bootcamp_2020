package mercury.commons;

import google.elements.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class TableElement extends BaseElement {

    private Hashtable<Integer, DoubleRow> table;
    private List<String> columns;

    public TableElement(WebElement root) {
        super(root);
        this.table = new Hashtable<>();
        this.init();
    }

    private void init() {
        //Columnas
        this.columns = new ArrayList<>();
        List<WebElement> columnElements = this.rootElement.findElements(By.xpath(".//td[contains(@class, '_header_')]"));

        for(WebElement column : columnElements) {
            this.columns.add(column.getText());
        }

        //Rows
        List<WebElement> mainRowElements = this.rootElement.findElements(By.xpath(".//tr[child::td[@class = 'frame_action_xrows']]"));
        List<WebElement> priceRowElements = this.rootElement.findElements(By.xpath(".//tr[child::td[@class = 'data_verb_xcols']]"));

        for(int index = 0; index < mainRowElements.size(); index++) {
            this.table.put(index + 1, new DoubleRow(mainRowElements.get(index), priceRowElements.get(index), this.columns));
        }
    }

    public List<String> getColumnNames() {
        return null;
    }

    public DoubleRow getRowByIndex(Integer index) {
        return this.table.get(index);
    }

    public DoubleRow getRowByTime(String time) {
        List<DoubleRow> rows = new ArrayList<>(this.table.values());

        for (DoubleRow row : rows) {
            if(row.getCellByColumnFromFirstRow("Depart").getCellValue().getText().equals(time)) {
                return row;
            }
        }
        return null;
    }

    public String getTopInformation() {
        return null;
    }
}
