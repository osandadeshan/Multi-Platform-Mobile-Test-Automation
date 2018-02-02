package stepImpl;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.MyDecksPage;
import util.DriverSetup;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.NoSuchElementException;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class MyDecksPageStepDefinitions {

    private MyDecksPage myDecksPage;

    public MyDecksPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            myDecksPage = PageFactory.initElements(iosDriver, MyDecksPage.class);
            return myDecksPage;
        } else {
            myDecksPage = PageFactory.initElements(androidDriver, MyDecksPage.class);
            return myDecksPage;
        }
    }

    @Step("Verify that the newly added <deckTitle> my deck is visible")
    public void verifyDeckIsVisible(String deckTitle) throws IOException {
        pageObject().scrollTo(deckTitle);
        pageObject().verifyDeckTitleIsVisible(deckTitle);
    }

    @Step("Verify that the following my decks are visible <deckTitleTable>")
    public void verifyDeckIsVisible(Table deckTitleTable) throws IOException {
        pageObject().freeze(2);
        List<TableRow> rows = deckTitleTable.getTableRows();
        List<String> columnNames = deckTitleTable.getColumnNames();
        for (TableRow row : rows) {
            pageObject().scrollTo(row.getCell(columnNames.get(0)));
            //pageObject().verifyDeckTitleIsVisible(row.getCell(columnNames.get(0)));
        }
    }

    @Step("Verify that the <deckTitle> my deck is not visible")
    public void verifyDeckIsNotVisible(String deckTitle) throws IOException {
        pageObject().verifyDeckTitleIsNotVisible(deckTitle);
    }

    @Step("Verify that the following my decks are not visible <deckTitleTable>")
    public void verifyDeckIsNotVisible(Table deckTitleTable) throws IOException {
        pageObject().freeze(2);
        List<TableRow> rows = deckTitleTable.getTableRows();
        List<String> columnNames = deckTitleTable.getColumnNames();
        for (TableRow row : rows) {
            pageObject().verifyDeckTitleIsNotVisible(row.getCell(columnNames.get(0)));
        }
    }

    @Step("Tap on <deckTitle> My Deck")
    public void tapOnMyDeck(String deckTitle) throws IOException {
        pageObject().tapOnMyDeck(deckTitle);
    }

    @Step("On Create New Deck page")
    public void navigateToCreateNewDeckPage() throws IOException {
        pageObject().navigateToCreateNewDeckPage();
    }

    @Step("Verify that the Deck title label is visible")
    public void verifyDeckTitleLabelIsVisible() throws IOException {
        pageObject().verifyDeckTitleLabelIsVisible();
    }

    @Step("Verify that the Days remaining label is visible")
    public void verifyDaysRemainingLabelIsVisible() throws IOException {
        pageObject().verifyDaysRemainingLabelIsVisible();
    }

    @Step("Verify that the Progress bar is visible")
    public void verifyProgressBarIsVisible() throws IOException {
        pageObject().verifyProgressBarIsVisible();
    }

    @Step("Verify that the Last Modified button is visible on the My Decks page")
    public void verifyLastModifiedButtonIsVisible() throws IOException {
        pageObject().verifyLastModifiedButtonIsVisible();
    }

    @Step("Verify that the Option button is visible on the My Decks page")
    public void verifyOptionButtonIsVisible() throws IOException {
        pageObject().verifyOptionButtonIsVisible();
    }

    @Step("Verify that the Create New Deck button is visible on the My Decks page")
    public void verifyCreateNewDeckButtonIsVisible() throws IOException {
        pageObject().verifyCreateNewDeckButtonIsVisible();
    }

    @Step("Verify that the My Deck Option menu items are visible")
    public void verifyMenuItemstOfOptionButton() throws IOException {
        pageObject().verifyMenuItemstOfOptionButton();
    }

    @Step("Tap on Options button in <deckTitle> My Deck")
    public void tapOptionButton(String deckTitle) throws IOException {
        pageObject().scrollTo(deckTitle);
        pageObject().tapOptionButton();
    }

    @Step("Verify that the <deckTitle> is visible as My Deck title on the top of the Option menu")
    public void verifyMyDeckTitle(String deckTitle) throws IOException {
        pageObject().verifyMyDeckTitle(deckTitle);
    }

    @Step("Tap on Edit Deck Info menu item of <deckTitle> My Deck")
    public void tapOnEditDeckMenuItem(String deckTitle) throws IOException {
        pageObject().tapOnEditDeckMenuItem(deckTitle);
    }

    @Step("Tap on Copy To button")
    public void tapOnCopyToButton() throws IOException {
        pageObject().tapOnCopyToButton();
    }


}
