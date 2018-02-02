package stepImpl;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.MyDeckCardsListPage;
import util.DriverSetup;

import java.io.IOException;
import java.util.List;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class MyDeckCardsListPageStepDefinitions {

    private MyDeckCardsListPage myDeckCardsListPage;

    public MyDeckCardsListPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            myDeckCardsListPage = PageFactory.initElements(iosDriver, MyDeckCardsListPage.class);
            return myDeckCardsListPage;
        } else {
            myDeckCardsListPage = PageFactory.initElements(androidDriver, MyDeckCardsListPage.class);
            return myDeckCardsListPage;
        }
    }

    @Step("Verify that the My Deck title is <myDeckTitle>")
    public void verifyMyDeckTitle(String myDeckTitle) throws IOException {
        pageObject().verifyMyDeckTitle(myDeckTitle);
    }

    @Step("Verify that the My Deck card titles are visible")
    public void verifyCardTitleIsVisible() throws IOException {
        pageObject().verifyCardTitleIsVisible();
    }

    @Step("Get all Card titles of the My Deck")
    public void getExpertDeckCardTitleList() throws IOException {
        pageObject().printText("Card Titles of the My Deck");
        pageObject().getMyDeckCardTitleList();
    }

    @Step("Verify that the My Deck card modified date and times are visible")
    public void verifyCardModifiedDateTimeIsVisible() throws IOException {
        pageObject().verifyCardModifiedDateTimeIsVisible();
    }

    @Step("Get all Card modified date and times of the My Deck")
    public void getMyDeckCardsModifiedDateTimeList() throws IOException {
        pageObject().printText("Card Modified Date and Times of the My Deck");
        pageObject().getMyDeckCardsModifiedDateTimeList();
    }

    @Step("Verify that the Card title is <cardTitle>")
    public void verifyCardTitle(String cardTitle) throws IOException {
        pageObject().freeze(2);
        pageObject().scrollTo(cardTitle);
        pageObject().freeze(2);
        pageObject().verifyCardContent(cardTitle);
    }

    @Step("Verify the Card contents of the My Deck <cardContent>")
    public void verifyCardContents(Table cardContent) throws IOException {
        List<TableRow> rows = cardContent.getTableRows();
        List<String> columnNames = cardContent.getColumnNames();
        for (TableRow row : rows) {
                pageObject().scrollTo(row.getCell(columnNames.get(0)));
                pageObject().verifyCardContent(row.getCell(columnNames.get(0)));
        }
    }

    @Step("Verify that the Card modified date and time is <modifiedDateTime>")
    public void verifyCardModifiedDateTime(String modifiedDateTime) throws IOException {
        pageObject().scrollTo(modifiedDateTime);
        pageObject().verifyCardContent(modifiedDateTime);
    }

    @Step("Verify the modified date and time of the My Deck <modifiedDateTime>")
    public void verifyModifiedDateTime(Table modifiedDateTime) throws IOException {
        List<TableRow> rows = modifiedDateTime.getTableRows();
        List<String> columnNames = modifiedDateTime.getColumnNames();
        for (TableRow row : rows) {
            pageObject().scrollTo(row.getCell(columnNames.get(0)));
            pageObject().verifyModifiedDateTime(row.getCell(columnNames.get(0)));
        }
    }

    @Step("Verify that the Add Card button is visible")
    public void verifyAddCardButtonIsVisible() throws IOException {
        pageObject().verifyAddCardButtonIsVisible();
    }

    @Step("Verify that the Card Options button is visible in my deck card list")
    public void verifyCardOptionsButtonIsVisible() throws IOException {
        pageObject().verifyCardOptionsButtonIsVisible();
    }

    @Step("Verify that the Card Edit button is visible")
    public void verifyCardEditButtonIsVisible() throws IOException {
        pageObject().verifyCardEditButtonIsVisible();
    }

    @Step("Tap on Add Card button")
    public void tapOnAddCardButton() throws IOException {
        pageObject().tapOnAddCardButton();
    }

    @Step("Tap on <cardTitle> Card")
    public void tapOnCard(String cardTitle) throws IOException {
        pageObject().tapOnCard(cardTitle);
    }

    @Step("Tap on Card Options button")
    public void tapOnOptions() throws IOException {
        pageObject().tapOnOptionButton();
    }

    @Step("Tap on card index = <cardIndex> Options button")
    public void tapOnOptionButtonByCardIndex(String cardIndex) throws IOException {
        pageObject().tapOnOptionButtonByCardIndex(cardIndex);
    }

    @Step("Tap on Card Delete Option")
    public void tapOnDeleteOption() throws IOException {
        pageObject().tapOnDeleteOption();
    }

    @Step("Tap on Card Edit Option")
    public void tapOnEditOption() throws IOException {
        pageObject().tapOnEditOption();
    }

    @Step("Verify that the Card title <cardTitle> is not visible")
    public void verifyCardIsNotExist(String cardTitle){
        try{
            pageObject().verifyContent(cardTitle);
            Assert.fail("Card Exist");
        } catch (NoSuchElementException e){

        }
    }

    @Step("Navigate back from My Deck Card List page")
    public void navigateBackToSelectedMyDeckPage() throws IOException {
        pageObject().navigateBackToSelectedMyDeckPage();
    }


}
