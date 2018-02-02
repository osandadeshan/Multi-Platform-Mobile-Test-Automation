package stepImpl;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.openqa.selenium.support.PageFactory;
import pages.EditMyDeckPage;
import util.DriverSetup;
import java.io.IOException;
import java.util.List;

import static pages.EditMyDeckPage.DECK_INFO;
import static pages.EditMyDeckPage.DECK_INFO_TITLE_TEXTVIEW;
import static pages.EditMyDeckPage.EDIT_MY_DECK_PAGE;
import static pages.MyDecksPage.*;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class EditMyDeckPageStepDefinitions {

    private EditMyDeckPage editMyDeckPage;

    public EditMyDeckPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            editMyDeckPage = PageFactory.initElements(iosDriver, EditMyDeckPage.class);
            return editMyDeckPage;
        } else {
            editMyDeckPage = PageFactory.initElements(androidDriver, EditMyDeckPage.class);
            return editMyDeckPage;
        }
    }

    @Step("Navigate back from Edit My Decks page")
    public void navigateBackFromEditMyDeckPage() throws IOException {
        pageObject().navigateBackFromEditMyDeckPage();
    }

    @Step("Edit my deck using the following details <table>")
    public void editMyDeck(Table table) throws IOException {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        for (TableRow row : rows) {
            pageObject().editMyDeck(row.getCell(columnNames.get(0)), row.getCell(columnNames.get(1)), row.getCell(columnNames.get(2)), row.getCell(columnNames.get(3)), row.getCell(columnNames.get(4)), row.getCell(columnNames.get(5)));
        }
    }

    @Step("Verify that the newly updated <deckTitle> my deck is visible")
    public void verifyDeckIsVisible(String deckTitle) throws IOException {
        pageObject().scrollTo(deckTitle);
        //pageObject().verifyDeckTitleIsVisible(deckTitle);
    }

    @Step("Remove exam date")
    public void removeExamDate() throws IOException {
        pageObject().removeExamDate();
    }

    @Step("Remove deck title")
    public void removeDeckTitle() throws IOException {
        pageObject().removeDeckTitle();
    }

    @Step("Change frequency into <frequency>")
    public void changeFrequency(String frequency) throws IOException {
        pageObject().changeFrequency(frequency);
    }

    @Step("Clear text fields in Edit My Deck page")
    public void resetTextFields() throws IOException {
        pageObject().resetTextFields();
    }

    @Step("Verify the deck info as follows <table>")
    public void verifyTextFieldValues(Table table) throws IOException {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        for (TableRow row : rows) {
            pageObject().verifyInputFieldValue(row.getCell(columnNames.get(0)), row.getCell(columnNames.get(1)));
        }
    }

    @Step("Tap on Save button")
    public void tapSaveButton() throws IOException {
        pageObject().tapSaveButton();
    }

    @Step("Verify the status of Frequency Dropdown is <status>")
    public void verifyFrequencyDropdownIsEnable(String status) throws IOException {
        if (status.toLowerCase().equals("enabled")) {
            pageObject().verifyFrequencyDropdownIsEnable(Boolean.TRUE);
        } else {
            pageObject().verifyFrequencyDropdownIsEnable(Boolean.FALSE);
        }
    }

    @Step("Verify the status of timer is <status>")
    public void verifyTimerIsEnable(String status) throws IOException {
        if (status.toLowerCase().equals("enabled")) {
            pageObject().verifyTimerIsEnable(Boolean.TRUE);
        } else {
            pageObject().verifyTimerIsEnable(Boolean.FALSE);
        }
    }

    @Step("Verify that the deck has successfully updated")
    public void verifyDeckUpdateSuccess() throws IOException {
        pageObject().isSuccess(MY_DECKS_PAGE, MY_DECKS_TITLE_TEXTVIEW, MY_DECKS);
    }

    @Step("Verify that the updating deck has failed")
    public void verifyDeckUpdateFailed() throws IOException {
        pageObject().isFailed(EDIT_MY_DECK_PAGE, DECK_INFO_TITLE_TEXTVIEW, DECK_INFO);
    }

    @Step("Verify that the frequency is <expectedFrequency>")
    public void verifyFrequencyValue(String expectedFrequency) throws IOException {
        pageObject().verifyFrequencyValue(expectedFrequency);
    }


}
