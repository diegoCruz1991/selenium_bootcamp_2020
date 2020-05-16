package amazon.sections;

import amazon.sections.results.*;
import org.openqa.selenium.WebDriver;

public class MainBodyResults extends BaseSection implements IsBody{

    private  TopSortSection topSortSection;

    private LeftFilterMenuSection leftFilterMenuSection;

    private MainResultsListSection mainResultsListSection;

    private BottomPageNavigationSection bottomPageNavigationSection;

    public MainBodyResults(WebDriver driver) {
        super(driver);
        topSortSection = new TopSortSection(this.driver);
        leftFilterMenuSection = new LeftFilterMenuSection(this.driver);
        mainResultsListSection = new MainResultsListSection(this.driver);
        bottomPageNavigationSection = new BottomPageNavigationSection(this.driver);
    }

    public TopSortSection getTopSortSection() {
        return topSortSection;
    }

    public LeftFilterMenuSection getLeftFilterMenuSection() {
        return leftFilterMenuSection;
    }

    public MainResultsListSection getMainResultsListSection() {
        return mainResultsListSection;
    }

    public BottomPageNavigationSection getBottomPageNavigationSection() {
        return bottomPageNavigationSection;
    }
}
