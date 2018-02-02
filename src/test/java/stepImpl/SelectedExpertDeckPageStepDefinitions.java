package stepImpl;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import pages.SelectedExpertDeckPage;
import util.DriverSetup;
import java.io.IOException;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class SelectedExpertDeckPageStepDefinitions {

    private SelectedExpertDeckPage selectedExpertDeckPage;

    public SelectedExpertDeckPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            selectedExpertDeckPage = PageFactory.initElements(iosDriver, SelectedExpertDeckPage.class);
            return selectedExpertDeckPage;
        } else {
            selectedExpertDeckPage = PageFactory.initElements(androidDriver, SelectedExpertDeckPage.class);
            return selectedExpertDeckPage;
        }
    }

    @Step("Verify that the Practice Button is visible after selecting a Expert Deck")
    public void isPracticeButtonVisible() throws IOException {
        pageObject().isPracticeButtonVisible();
    }

    @Step("Verify that the View/Edit Cards Button is visible after selecting a Expert Deck")
    public void isViewCardsButtonVisible() throws IOException {
        pageObject().isViewCardsButtonVisible();
    }

    @Step("Verify that the Expert Deck title showing here is <deckTitle>")
    public void verifyDeckTitle(String deckTitle) throws IOException {
        pageObject().verifyDeckTitle(deckTitle);
    }

    @Step("Navigate to cards list view of the Expert Deck")
    public void navigateToCardsList() throws IOException {
        pageObject().navigateToCardsList();
    }

    @Step("Verify that the user can navigate back from Selected Expert Deck page")
    public void navigateBackFromSelectedExpertDeckPage() throws IOException {
        pageObject().navigateBackFromSelectedExpertDeckPage();
    }

    @Step("Navigate to Practice of Expert Deck")
    public void navigateToPractice() throws IOException {
        pageObject().navigateToPractice();
    }


}
