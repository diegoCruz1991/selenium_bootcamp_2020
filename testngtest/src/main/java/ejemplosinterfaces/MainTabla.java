package ejemplosinterfaces;

import org.openqa.selenium.WebElement;

import java.util.List;

public class MainTabla {

    public Tabla getPrimeraTabla() {
        Tabla departs = new Tabla() {
            @Override
            public List<WebElement> getColumns() {
                return null;
            }

            @Override
            public List<WebElement> getRows() {
                return null;
            }

            @Override
            public void selectRow() {

            }

            public void metodoCustom() {

            }
        };
        return null;
    }

    public Tabla getSegundaTabla() {
        Tabla arrives = new Tabla() {
            @Override
            public List<WebElement> getColumns() {
                return null;
            }

            @Override
            public List<WebElement> getRows() {
                return null;
            }

            @Override
            public void selectRow() {

            }
        };
        return null;
    }

    public void selectByPriceAndFlightNameAndTime(Tabla tabla, int precio, String flightName, String time) {
        tabla.selectRow();
    }

    public void selectByPosition(Tabla tabla, int position) {
        tabla.selectRow();
    }

    public void llamarMetodo() {
        this.selectByPriceAndFlightNameAndTime(this.getPrimeraTabla(), 100, "blabla", "2:15");
        this.selectByPriceAndFlightNameAndTime(this.getSegundaTabla(), 100, "blabla", "2:15");
    }
}
