package amazon.sections;

import amazon.sections.results.*;
import org.openqa.selenium.WebDriver;

public class MainBodyResults extends BaseSections implements IsBody {

    private TopSortSection topSortSection;
    private LeftFilterMenuSection leftFilterMenuSection;
    private MainResultsListerSection mainResultsListerSection;
    private BottomPageNavigationSection bottomPageNavigationSection;

    public MainBodyResults(WebDriver driver) {
        super(driver);
        topSortSection = new TopSortSection(this.driver);
        mainResultsListerSection = new MainResultsListerSection(this.driver);
        leftFilterMenuSection = new LeftFilterMenuSection(this.driver);
        bottomPageNavigationSection = new BottomPageNavigationSection(this.driver);
    }

    public TopSortSection getTopSortSection() {
        return topSortSection;
    }

    public LeftFilterMenuSection getLeftFilterMenuSection() {
        return leftFilterMenuSection;
    }

    public MainResultsListerSection getMainResultsListerSection() {
        return mainResultsListerSection;
    }

    public BottomPageNavigationSection getBottomPageNavigationSection() {
        return bottomPageNavigationSection;
    }
}
