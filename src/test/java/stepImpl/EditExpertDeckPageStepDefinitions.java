package stepImpl;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.openqa.selenium.support.PageFactory;
import pages.EditExpertDeckPage;
import pages.EditMyDeckPage;
import util.DriverSetup;

import java.io.IOException;
import java.util.List;

import static pages.EditMyDeckPage.*;
import static pages.ExpertDecksPage.EXPERT_DECKS;
import static pages.ExpertDecksPage.EXPERT_DECKS_PAGE;
import static pages.ExpertDecksPage.EXPERT_DECKS_TITLE_TEXTVIEW;
import static pages.MyDecksPage.*;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class EditExpertDeckPageStepDefinitions {

    private EditExpertDeckPage editExpertDeckPage;

    public EditExpertDeckPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            editExpertDeckPage = PageFactory.initElements(iosDriver, EditExpertDeckPage.class);
            return editExpertDeckPage;
        } else {
            editExpertDeckPage = PageFactory.initElements(androidDriver, EditExpertDeckPage.class);
            return editExpertDeckPage;
        }
    }

    @Step("Edit expert deck using the following details <table>")
    public void editExpertDeck(Table table) throws IOException {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        for (TableRow row : rows) {
            pageObject().editExpertDeck(row.getCell(columnNames.get(0)), row.getCell(columnNames.get(1)), row.getCell(columnNames.get(2)), row.getCell(columnNames.get(3)), row.getCell(columnNames.get(4)), row.getCell(columnNames.get(5)));
        }
    }

    @Step("Verify that the newly updated <deckTitle> expert deck is visible")
    public void verifyDeckIsVisible(String deckTitle) throws IOException {
        pageObject().scrollTo(deckTitle);
        //pageObject().verifyDeckTitleIsVisible(deckTitle);
    }

    @Step("Set expert deck title as <examDate>")
    public void setDeckTitle(String deckTitle) throws IOException {
        pageObject().setDeckTitle(deckTitle);
    }

    @Step("Set exam date as <examDate>")
    public void setExamDate(String examDate) throws IOException {
        pageObject().setExamDate(examDate);
    }

    @Step("Clear text fields in Edit Expert Deck page")
    public void resetTextFields() throws IOException {
        pageObject().resetTextFields();
    }

    @Step("Verify that the expert deck has successfully updated")
    public void verifyDeckUpdateSuccess() throws IOException {
        pageObject().isSuccess(EXPERT_DECKS_PAGE, EXPERT_DECKS_TITLE_TEXTVIEW, EXPERT_DECKS);
    }

    @Step("Navigate back to Expert Decks page")
    public void navigateBackFromEditExpertDeckPage() throws IOException {
        pageObject().navigateBackFromEditExpertDeckPage();
    }


}
