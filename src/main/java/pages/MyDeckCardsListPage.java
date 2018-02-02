package pages;

import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 5/14/2017.
 */


public class MyDeckCardsListPage extends BasePage {

    public static final String MY_DECK_CARDS_LIST_PAGE = "MyDeckCardsListPage";
    public static final String MY_DECK_TITLE_TEXTVIEW = "my_deck_title_textview";
    public static final String MODIFIED_DATE_TIME = "modified_date_time";
    public static final String ANDROID_ALL_CARDS_LIST_CONTAINER = "android_all_cards_list_container";
    public static final String ANDROID_ALL_CARDS_LIST_CONTAINER_ID = "android.support.v7.widget.RecyclerView";
    public static final String ANDROID_CARD_TITLE = "android_card_title";
    public static final String ANDROID_CARD_TITLE_ID = "com.pearsoned.smartflashcards:id/textViewCardTitle";
    public static final String ANDROID_CARD_MODIFIED_DATE_TIME = "modified_date_time";
    public static final String ANDROID_CARD_MODIFIED_DATE_TIME_ID = "com.pearsoned.smartflashcards:id/textViewCardTime";
    public static final String ADD_CARD_BUTTON = "add_card_button";
    public static final String OPTIONS_BUTTON = "options_button";
    public static final String OPTIONS_BUTTON_BY_CARD_INDEX = "options_button_of_card";
    public static final String BACK_BUTTON = "back_button";
    public static final String OPTION_DELETE = "card_option_delete";
    public static final String OPTION_EDIT = "card_option_edit";

    public MyDeckCardsListPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void verifyMyDeckTitle(String expectedDeckTitle) throws IOException {
        if(PLATFORM.toLowerCase().equals("android")) {
            isElementTextEquals(MY_DECK_CARDS_LIST_PAGE, MY_DECK_TITLE_TEXTVIEW, expectedDeckTitle);
        } else {
            isElementLabelEqualTo(MY_DECK_CARDS_LIST_PAGE, MY_DECK_TITLE_TEXTVIEW, expectedDeckTitle);
        }
    }

    public void verifyCardTitleIsVisible() throws IOException {
        isElementVisible(MY_DECK_CARDS_LIST_PAGE, ANDROID_CARD_TITLE);
    }

    public void getMyDeckCardTitleList() throws IOException {
        getWebElementsNameList(ANDROID_ALL_CARDS_LIST_CONTAINER_ID, ANDROID_CARD_TITLE_ID);
    }

    public void verifyCardModifiedDateTimeIsVisible() throws IOException {
        isElementVisible(MY_DECK_CARDS_LIST_PAGE, ANDROID_CARD_MODIFIED_DATE_TIME);
    }

    public void getMyDeckCardsModifiedDateTimeList() throws IOException {
        getWebElementsNameList(ANDROID_ALL_CARDS_LIST_CONTAINER_ID, ANDROID_CARD_MODIFIED_DATE_TIME_ID);
    }

    public void verifyCardContent(String cardContent) throws IOException {
        verifyElementAccessibilityIdTextIsVisibleAs(MY_DECK_CARDS_LIST_PAGE, ANDROID_CARD_TITLE, cardContent);
    }

    public void verifyModifiedDateTime(String dateTime) throws IOException {
        verifyElementAccessibilityIdTextIsVisibleAs(MY_DECK_CARDS_LIST_PAGE, MODIFIED_DATE_TIME, dateTime);
    }

    public void verifyAddCardButtonIsVisible() throws IOException {
        isElementVisible(MY_DECK_CARDS_LIST_PAGE, ADD_CARD_BUTTON);
    }

    public void verifyCardOptionsButtonIsVisible() throws IOException {
        isElementVisible(MY_DECK_CARDS_LIST_PAGE, OPTIONS_BUTTON);
    }

    public void verifyCardEditButtonIsVisible() throws IOException {
        isElementVisible(MY_DECK_CARDS_LIST_PAGE, OPTION_EDIT);
    }

    public void tapOnAddCardButton() throws IOException {
        tapElement(MY_DECK_CARDS_LIST_PAGE, ADD_CARD_BUTTON);
    }

    public void tapOnCard(String cardTitle) throws IOException {
        scrollAndClick(cardTitle);
    }

    public void tapOnOptionButton() throws IOException{
        tapElement(MY_DECK_CARDS_LIST_PAGE, OPTIONS_BUTTON);
    }

    public void tapOnOptionButtonByCardIndex(String cardIndex) throws IOException{
        replaceXpathContentAndClickElement(MY_DECK_CARDS_LIST_PAGE, OPTIONS_BUTTON_BY_CARD_INDEX, "#id", cardIndex);
    }

    public void tapOnDeleteOption() throws  IOException{
        tapElement(MY_DECK_CARDS_LIST_PAGE, OPTION_DELETE);
    }

    public void tapOnEditOption() throws  IOException{
        tapElement(MY_DECK_CARDS_LIST_PAGE, OPTION_EDIT);
    }

    public void navigateBackToSelectedMyDeckPage() throws IOException {
        tapElement(MY_DECK_CARDS_LIST_PAGE, BACK_BUTTON);
    }


}
