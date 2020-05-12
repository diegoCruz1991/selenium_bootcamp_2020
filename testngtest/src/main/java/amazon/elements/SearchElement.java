package amazon.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchElement extends BaseElement{


    //propieda es un elemnto que tien geter y seter implicito

    public SearchElement(WebElement rootElement){
        super(rootElement);

    }

    public WebElement SearchFileE(){
        return this.rootElement.findElement(By.id("teotabsearchtestbox"));
    }

    public Select SectionDropD(){
        return new Select(this.rootElement.findElement(By.id("searchDropdownBox"))); //solo cuando el elemento es select
    }

    public WebElement SearchButton(){
        return this.rootElement.findElement(By.xpath("//div[@id = 'nav-search']//input[@type = 'submit' and @class = 'nav-input']"));
    }
}
