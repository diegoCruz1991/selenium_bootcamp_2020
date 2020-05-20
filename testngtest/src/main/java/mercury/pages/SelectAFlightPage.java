package mercury.pages;


import mercury.commons.DoubleRow;
import mercury.commons.TableElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectAFlightPage {

    private TableElement departTableElement;

    private TableElement returnTableElement;

    public SelectAFlightPage(WebDriver driver) {
        this.departTableElement = new TableElement(driver.findElement(By.xpath("//form/table[1]")));
        this.returnTableElement = new TableElement(driver.findElement(By.xpath("//form/table[2]")));
    }

    public void selectAFlightByTime(String flightType, String time) {
        switch(flightType.toUpperCase()) {
            case "DEPART":
                DoubleRow departRow = this.departTableElement.getRowByTime(time);
                departRow.getCellByColumnFromFirstRow("SELECT").getCellValue().click();
                break;
            case "RETURN":
                DoubleRow returnRow = this.returnTableElement.getRowByTime(time);
                returnRow.getCellByColumnFromFirstRow("SELECT").getCellValue().click();
                break;
            default:
                System.out.println("Bad type");
        }
    }
}
