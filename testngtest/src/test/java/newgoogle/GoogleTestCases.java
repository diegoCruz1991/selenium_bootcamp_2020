package newgoogle;

import googleusersteps.steps.GoogleHomeUserSteps;
import googleusersteps.steps.GoogleResultsUserSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.PropertyReader;

import java.util.List;

public class GoogleTestCases extends BaseTestCase {

    @Test
    public void testSearchContent() {
        this.myDriver.get(PropertyReader.getProperty("test.properties", "GOOGLE_URL"));

        GoogleHomeUserSteps googleUserSteps = new GoogleHomeUserSteps(this.myDriver);

        googleUserSteps.searchContent("Youtube");

        //Verificar si se cargo la pagina de resultados
    }

    @Test
    public void testSearchContentFeelingLucky() {
        this.myDriver.get(PropertyReader.getProperty("test.properties", "GOOGLE_URL"));

        GoogleHomeUserSteps googleUserSteps = new GoogleHomeUserSteps(this.myDriver);

        googleUserSteps.searchContentFeelingLucky("Youtube");

        Assert.assertEquals(5, 5);

        Assert.assertEquals(5, 5);

        //Verificar si se cargo la pagina de Youtube
    }

    @Test
    public void testSearchContentContext() {
        GoogleHomeUserSteps googleUserSteps = new GoogleHomeUserSteps(this.myDriver);

        GoogleResultsUserSteps googleResultsUserSteps = googleUserSteps.searchContent("Youtube");

        List<WebElement> subList = googleResultsUserSteps.getResultsSubList(0, 4);

        SoftAssert softAssert = new SoftAssert();

        for(WebElement webElement : subList) {
            softAssert.assertTrue(webElement.getText().contains("Youtube"));

            webElement.click();

            List<WebElement> tempList = myDriver.findElements(By.xpath("//*[contains(text(), 'youtube')]"));

            softAssert.assertFalse(tempList.isEmpty());
        }

        softAssert.assertAll();



        //Verificar si los primeros 5 resultados tienen que ver con Youtube
            // - Contengan la palabra Youtube
            // - y si se le da click te llevan a algun pagina que contenga la palabra Youtube
    }
}

/*
    Definir un page object para la pagina de resultados de google
    Definir un objeto de tipo user steps para la pagina de resultado de google
    Termina de definir los test cases y definir el nuevo test case testSearchContentContext
 */
