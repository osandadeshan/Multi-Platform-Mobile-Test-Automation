package pages;

import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 5/14/2017.
 */


public class ExpertDeckCardsListPage extends BasePage {

    public static final String EXPERT_DECK_CARDS_LIST_PAGE = "ExpertDeckCardsListPage";
    public static final String EXPERT_DECK_TITLE_TEXTVIEW = "expert_deck_title_textview";
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
    public static final String PRACTICE_BUTTON = "practice_button";
    public static final String BACK_BUTTON = "back_button";

    public ExpertDeckCardsListPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void verifyExpertDeckTitle(String expectedDeckTitle) throws IOException {
        isPageTitleEqualTo(EXPERT_DECK_CARDS_LIST_PAGE, EXPERT_DECK_TITLE_TEXTVIEW, expectedDeckTitle);
    }

    public void verifyCardTitleIsVisible() throws IOException {
        isElementVisible(EXPERT_DECK_CARDS_LIST_PAGE, ANDROID_CARD_TITLE);
    }

    public void getExpertDeckCardTitleList() throws IOException {
        getWebElementsNameList(ANDROID_ALL_CARDS_LIST_CONTAINER_ID, ANDROID_CARD_TITLE_ID);
    }

    public void verifyCardModifiedDateTimeIsVisible() throws IOException {
        isElementVisible(EXPERT_DECK_CARDS_LIST_PAGE, ANDROID_CARD_MODIFIED_DATE_TIME);
    }

    public void getExpertDeckCardsModifiedDateTimeList() throws IOException {
        getWebElementsNameList(ANDROID_ALL_CARDS_LIST_CONTAINER_ID, ANDROID_CARD_MODIFIED_DATE_TIME_ID);
    }

    public void verifyCardContent(String cardContent) throws IOException {
        verifyElementAccessibilityIdTextIsVisibleAs(EXPERT_DECK_CARDS_LIST_PAGE, ANDROID_CARD_TITLE, cardContent);
    }

    public void verifyModifiedDateTime(String dateTime) throws IOException {
        verifyElementAccessibilityIdTextIsVisibleAs(EXPERT_DECK_CARDS_LIST_PAGE, MODIFIED_DATE_TIME, dateTime);
    }

    public void verifyAddCardButtonIsNotVisible() throws IOException {
        isElementNotVisible(EXPERT_DECK_CARDS_LIST_PAGE, ADD_CARD_BUTTON);
    }

    public void verifyCardOptionsButtonIsVisible() throws IOException {
        isElementVisible(EXPERT_DECK_CARDS_LIST_PAGE, OPTIONS_BUTTON);
    }

    public void tapOnOptionButtonByCardIndex(String cardIndex) throws IOException{
        replaceXpathContentAndClickElement(EXPERT_DECK_CARDS_LIST_PAGE, OPTIONS_BUTTON_BY_CARD_INDEX, "#id", cardIndex);
    }

    public void navigateBackToSelectedExpertDeckPage() throws IOException {
        tapElement(EXPERT_DECK_CARDS_LIST_PAGE, BACK_BUTTON);
    }


}
