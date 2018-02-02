package stepImpl;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.openqa.selenium.support.PageFactory;
import pages.ExpertDeckCardsListPage;
import util.DriverSetup;
import java.io.IOException;
import java.util.List;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class ExpertDeckCardsListPageStepDefinitions {

    private ExpertDeckCardsListPage expertDeckCardsListPage;

    public ExpertDeckCardsListPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            expertDeckCardsListPage = PageFactory.initElements(iosDriver, ExpertDeckCardsListPage.class);
            return expertDeckCardsListPage;
        } else {
            expertDeckCardsListPage = PageFactory.initElements(androidDriver, ExpertDeckCardsListPage.class);
            return expertDeckCardsListPage;
        }
    }

    @Step("Verify that the Expert Deck title is <expertDeckTitle>")
    public void verifyExpertDeckTitle(String expertDeckTitle) throws IOException {
        pageObject().verifyExpertDeckTitle(expertDeckTitle);
    }

    @Step("Verify that the Expert Deck card titles are visible")
    public void verifyCardTitleIsVisible() throws IOException {
        pageObject().verifyCardTitleIsVisible();
    }

    @Step("Get all Card titles of the Expert Deck")
    public void getExpertDeckCardTitleList() throws IOException {
        pageObject().printText("Card Titles of the Expert Deck");
        pageObject().getExpertDeckCardTitleList();
    }

    @Step("Verify that the Expert Deck card modified date and times are visible")
    public void verifyCardModifiedDateTimeIsVisible() throws IOException {
        pageObject().verifyCardModifiedDateTimeIsVisible();
    }

    @Step("Get all Card modified date and times of the Expert Deck")
    public void getExpertDeckCardsModifiedDateTimeList() throws IOException {
        pageObject().printText("Card Modified Date and Times of the Expert Deck");
        pageObject().getExpertDeckCardsModifiedDateTimeList();
    }

    @Step("Verify that the Add Card button is not visible")
    public void verifyAddCardButtonIsNotVisible() throws IOException {
        pageObject().verifyAddCardButtonIsNotVisible();
    }

    @Step("Verify that the Card Options button is visible in expert deck card list")
    public void verifyCardOptionsButtonIsVisible() throws IOException {
        pageObject().verifyCardOptionsButtonIsVisible();
    }

    @Step("Verify the Card contents of the Expert Deck <cardContent>")
    public void verifyCardContents(Table cardContent) throws IOException {
        List<TableRow> rows = cardContent.getTableRows();
        List<String> columnNames = cardContent.getColumnNames();
        for (TableRow row : rows) {
                pageObject().scrollTo(row.getCell(columnNames.get(0)));
                pageObject().verifyCardContent(row.getCell(columnNames.get(0)));
        }
    }

    @Step("Verify the modified date and time of the Expert Deck <modifiedDateTime>")
    public void verifyModifiedDateTime(Table modifiedDateTime) throws IOException {
        List<TableRow> rows = modifiedDateTime.getTableRows();
        List<String> columnNames = modifiedDateTime.getColumnNames();
        for (TableRow row : rows) {
            pageObject().scrollTo(row.getCell(columnNames.get(0)));
            pageObject().verifyModifiedDateTime(row.getCell(columnNames.get(0)));
        }
    }

    @Step("Navigate back from Expert Deck Card List page")
    public void navigateBackToSelectedExpertDeckPage() throws IOException {
        pageObject().navigateBackToSelectedExpertDeckPage();
    }


}
