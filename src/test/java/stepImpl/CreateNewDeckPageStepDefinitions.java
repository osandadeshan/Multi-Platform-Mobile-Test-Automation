package stepImpl;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.openqa.selenium.support.PageFactory;
import pages.CreateNewDeckPage;
import util.DriverSetup;
import java.io.IOException;
import java.util.List;
import static pages.CreateNewDeckPage.*;
import static pages.MyDecksPage.MY_DECKS;
import static pages.MyDecksPage.MY_DECKS_PAGE;
import static pages.MyDecksPage.MY_DECKS_TITLE_TEXTVIEW;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class CreateNewDeckPageStepDefinitions {

    private CreateNewDeckPage createNewDeckPage;

    public CreateNewDeckPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            createNewDeckPage = PageFactory.initElements(iosDriver, CreateNewDeckPage.class);
            return createNewDeckPage;
        } else {
            createNewDeckPage = PageFactory.initElements(androidDriver, CreateNewDeckPage.class);
            return createNewDeckPage;
        }
    }

    @Step("Navigate back to My Decks page")
    public void navigateBackFromCreateNewDecksPage() throws IOException {
        pageObject().navigateBackFromCreateNewDecksPage();
    }

    @Step("Verify that the Deck title label is <expectedDeckTitleLabel>")
    public void verifyDeckTitleLabel(String expectedDeckTitleLabel) throws IOException {
        pageObject().isElementNameEqualTo(CREATE_NEW_DECK_PAGE, DECK_TITLE_LABEL, expectedDeckTitleLabel);
    }

    @Step("Verify that the Deck title textbox is visible")
    public void verifyDeckTitleTextboxIsVisible() throws IOException {
        pageObject().isElementVisible(CREATE_NEW_DECK_PAGE, DECK_TITLE_TEXTFIELD);
    }

    @Step("Verify that the Exam date label is <expectedExamDateLabel>")
    public void verifyExamDateLabel(String expectedExamDateLabel) throws IOException {
        pageObject().isElementNameEqualTo(CREATE_NEW_DECK_PAGE, EXAM_DATE_LABEL, expectedExamDateLabel);
    }

    @Step("Verify that the Exam date textbox is visible")
    public void verifyExamDateTextboxIsVisible() throws IOException {
        pageObject().isElementVisible(CREATE_NEW_DECK_PAGE, EXAM_DATE_DATE_PICKER);
    }

    @Step("Verify that the 'Remind me daily starting' label is <expectedRemindMeLabel>")
    public void verifyRemindMeLabel(String expectedRemindMeLabel) throws IOException {
        pageObject().isElementNameEqualTo(CREATE_NEW_DECK_PAGE, REMIND_ME_LABEL, expectedRemindMeLabel);
    }

    @Step("Verify that the 'Remind me daily starting' switch is visible")
    public void verifyRemindMeSwitchIsVisible() throws IOException {
        pageObject().isElementVisible(CREATE_NEW_DECK_PAGE, REMIND_ME_SWITCH);
    }

    @Step("Tap on 'Remind me daily starting' switch")
    public void tapRemindMeSwitch() throws IOException {
        pageObject().tapElement(CREATE_NEW_DECK_PAGE, REMIND_ME_SWITCH);
    }

    @Step("Verify that the 'Remind me daily starting' switch is in <status> status")
    public void remindMeSwitchIsEnable(String status) throws IOException {
        pageObject().remindMeSwitchStatus(status);
    }

    @Step("Verify that the enable status of the frequency dropdown is <isEnable>")
    public void frequencyDropdownEnableStatus(String isEnable) throws IOException {
        pageObject().verifyElementIsEnable(CREATE_NEW_DECK_PAGE, FREQUENCY_DROPDOWN, Boolean.valueOf(isEnable));
    }

    @Step("Verify that the enable status of the time picker is <isEnable>")
    public void timePickerEnableStatus(String isEnable) throws IOException {
        pageObject().verifyElementIsEnable(CREATE_NEW_DECK_PAGE, TIMER, Boolean.valueOf(isEnable));
    }

    @Step("Create a new deck using the following details <table>")
    public void createNewDeck(Table table) throws IOException {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        for (TableRow row : rows) {
            pageObject().createNewDeck(row.getCell(columnNames.get(0)), row.getCell(columnNames.get(1)), row.getCell(columnNames.get(2)), row.getCell(columnNames.get(3)), row.getCell(columnNames.get(4)), row.getCell(columnNames.get(5)));
        }
    }

    @Step("Create a new deck <table>")
    public void createDeck(Table table) throws IOException {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        for (TableRow row : rows) {
            pageObject().createDeck(row.getCell(columnNames.get(0)), row.getCell(columnNames.get(1)), row.getCell(columnNames.get(2)), row.getCell(columnNames.get(3)), row.getCell(columnNames.get(4)));
        }
    }

    @Step("Set exam date <examDate>")
    public void setExamDate(String examDate) throws IOException {
        pageObject().setExamDate(examDate);
    }

    @Step("Verify the set time should be <expectedTimeString>")
    public void verifySetTime(String expectedTimeString) throws IOException {
        pageObject().verifySetTime(expectedTimeString);
    }

    @Step("Clear text fields in Create New Deck page")
    public void resetTextFields() throws IOException {
        pageObject().resetTextFields();
    }

    @Step("Verify the deck creation has completed successfully")
    public void verifyDeckCreationSuccess() throws IOException {
        pageObject().isSuccess(MY_DECKS_PAGE, MY_DECKS_TITLE_TEXTVIEW, MY_DECKS);
    }

    @Step("Verify the deck creation has failed")
    public void verifyDeckCreationFailed() throws IOException {
        pageObject().isFailed(CREATE_NEW_DECK_PAGE, CREATE_NEW_DECK_TITLE_TEXTVIEW, CREATE_NEW_DECK);
    }


}
