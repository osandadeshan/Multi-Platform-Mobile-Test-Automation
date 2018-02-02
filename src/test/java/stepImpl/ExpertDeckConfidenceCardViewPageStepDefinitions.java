package stepImpl;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import pages.ExpertDeckConfidenceCardViewPage;
import util.DriverSetup;
import java.io.IOException;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class ExpertDeckConfidenceCardViewPageStepDefinitions {

    private ExpertDeckConfidenceCardViewPage expertDeckConfidenceCardViewPage;

    public ExpertDeckConfidenceCardViewPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            expertDeckConfidenceCardViewPage = PageFactory.initElements(iosDriver, ExpertDeckConfidenceCardViewPage.class);
            return expertDeckConfidenceCardViewPage;
        } else {
            expertDeckConfidenceCardViewPage = PageFactory.initElements(androidDriver, ExpertDeckConfidenceCardViewPage.class);
            return expertDeckConfidenceCardViewPage;
        }
    }



    @Step("Navigate back from Expert Deck Confidence Card View page")
    public void navigateToExpertDeckCardListPage() throws IOException {
        pageObject().navigateToExpertDeckCardListPage();
    }


}
