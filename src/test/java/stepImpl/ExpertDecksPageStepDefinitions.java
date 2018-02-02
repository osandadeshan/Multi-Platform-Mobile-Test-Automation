package stepImpl;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import pages.ExpertDecksPage;
import util.DriverSetup;
import java.io.IOException;
import java.util.List;

import static pages.ExpertDecksPage.ANDROID_ALL_EXPERT_DECKS_CONTAINER;
import static pages.ExpertDecksPage.ANDROID_DECK_TITLE_ID;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class ExpertDecksPageStepDefinitions {

    private ExpertDecksPage expertDecksPage;

    public ExpertDecksPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            expertDecksPage = PageFactory.initElements(iosDriver, ExpertDecksPage.class);
            return expertDecksPage;
        } else {
            expertDecksPage = PageFactory.initElements(androidDriver, ExpertDecksPage.class);
            return expertDecksPage;
        }
    }

    @Step("Verify that the <deckTitle> expert deck is visible")
    public void verifyExpertDeckIsVisible(String deckTitle) throws IOException {
        pageObject().scrollTo(deckTitle);
        pageObject().freeze(2);
        pageObject().verifyExpertDeckTitleIsVisible(deckTitle);
        pageObject().getWebElementsNameList(ANDROID_ALL_EXPERT_DECKS_CONTAINER, ANDROID_DECK_TITLE_ID);
    }

    @Step("Verify that the below expert decks are visible <deckTitleTable>")
    public void verifyExpertDecksAreVisible(Table deckTitleTable) throws IOException {
        pageObject().freeze(2);
        List<TableRow> rows = deckTitleTable.getTableRows();
        List<String> columnNames = deckTitleTable.getColumnNames();
        for (TableRow row : rows) {
            pageObject().scrollTo(row.getCell(columnNames.get(0)));
            pageObject().verifyExpertDeckTitleIsVisible(row.getCell(columnNames.get(0)));
        }
        pageObject().getWebElementsNameList(ANDROID_ALL_EXPERT_DECKS_CONTAINER, ANDROID_DECK_TITLE_ID);
    }

    @Step("Verify that the <deckTitle> expert deck is not visible")
    public void verifyExpertDeckIsNotVisible(String deckTitle) throws IOException {
        pageObject().scrollTo(deckTitle);
        pageObject().freeze(2);
        pageObject().verifyExpertDeckTitleIsNotVisible(deckTitle);
        pageObject().getWebElementsNameList(ANDROID_ALL_EXPERT_DECKS_CONTAINER, ANDROID_DECK_TITLE_ID);
    }

    @Step("Verify that the below expert decks are not visible <deckTitleTable>")
    public void verifyExpertDecksAreNotVisible(Table deckTitleTable) throws IOException {
        pageObject().freeze(2);
        List<TableRow> rows = deckTitleTable.getTableRows();
        List<String> columnNames = deckTitleTable.getColumnNames();
        for (TableRow row : rows) {
            try {
                pageObject().scrollTo(row.getCell(columnNames.get(0)));
            } catch (NoSuchElementException ex) { }
            pageObject().verifyExpertDeckTitleIsNotVisible(row.getCell(columnNames.get(0)));
        }
        pageObject().getWebElementsNameList(ANDROID_ALL_EXPERT_DECKS_CONTAINER, ANDROID_DECK_TITLE_ID);
    }

    @Step("Tap on <deckTitle> Expert Deck")
    public void tapOnExpertDeck(String deckTitle) throws IOException {
        pageObject().tapOnExpertDeck(deckTitle);
    }

    @Step("Verify that the Last Modified button is visible on the Expert Decks page")
    public void verifyLastModifiedButtonIsVisible() throws IOException {
        pageObject().verifyLastModifiedButtonIsVisible();
    }

    @Step("Verify that the Option button is visible on the Expert Decks page")
    public void verifyOptionButtonIsVisible() throws IOException {
        pageObject().verifyOptionButtonIsVisible();
    }

    @Step("Verify that the Expert Deck Option menu items are visible")
    public void verifyMenuItemstOfOptionButton() throws IOException {
        pageObject().verifyMenuItemstOfOptionButton();
    }

    @Step("Tap on Options button in <deckTitle> Expert Deck")
    public void tapOptionButton(String deckTitle) throws IOException {
        pageObject().tapOptionButton();
    }

    @Step("Verify that the <deckTitle> is visible as Expert Deck title on the top of the Option menu")
    public void verifyExpertDeckTitle(String deckTitle) throws IOException {
        pageObject().verifyExpertDeckTitle(deckTitle);
    }

    @Step("Tap on Edit Deck Info menu item of <deckTitle> Expert Deck")
    public void tapOnEditDeckMenuItem(String deckTitle) throws IOException {
        pageObject().tapOnEditDeckMenuItem(deckTitle);
    }

    @Step("Verify that the Create New Deck button is not visible on the Expert Decks page")
    public void verifyCreateNewDeckButtonIsNotVisible() throws IOException {
        pageObject().verifyCreateNewDeckButtonIsNotVisible();
    }


}
