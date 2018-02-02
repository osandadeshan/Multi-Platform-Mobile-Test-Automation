package stepImpl;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import pages.SelectedMyDeckPage;
import util.DriverSetup;

import java.io.IOException;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class SelectedMyDeckPageStepDefinitions {

    private SelectedMyDeckPage selectedMyDeckPage;

    public SelectedMyDeckPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            selectedMyDeckPage = PageFactory.initElements(iosDriver, SelectedMyDeckPage.class);
            return selectedMyDeckPage;
        } else {
            selectedMyDeckPage = PageFactory.initElements(androidDriver, SelectedMyDeckPage.class);
            return selectedMyDeckPage;
        }
    }

    @Step("Verify that the Practice Button is visible after selecting a My Deck")
    public void isPracticeButtonVisible() throws IOException {
        pageObject().isPracticeButtonVisible();
    }

    @Step("Verify that the View/Edit Cards Button is visible after selecting a My Deck")
    public void isViewCardsButtonVisible() throws IOException {
        pageObject().isViewCardsButtonVisible();
    }

    @Step("Verify that the My Deck title showing here is <deckTitle>")
    public void verifyDeckTitle(String deckTitle) throws IOException {
        pageObject().verifyDeckTitle(deckTitle);
    }

    @Step("Navigate to cards list view of the My Deck")
    public void navigateToCardsList() throws IOException {
        pageObject().navigateToCardsList();
    }

    @Step("Verify that the user can navigate back from Selected My Deck page")
    public void navigateBackFromSelectedMyDeckPage() throws IOException {
        pageObject().navigateBackFromSelectedMyDeckPage();
    }

    @Step("Navigate to Practice of My Deck")
    public void navigateToPractice() throws IOException {
        pageObject().navigateToPractice();
    }


}
