package pages;

import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 5/14/2017.
 */


public class MyDecksPage extends BasePage {

    public static final String MY_DECKS_PAGE = "MyDecksPage";
    public static final String MY_DECKS_TITLE_TEXTVIEW = "my_decks_title_textview";
    public static final String MY_DECKS = "My Decks";
    public static final String ADDED_DECK_TITLE = "added_deck_title";
    public static final String CREATE_NEW_DECK_ICON = "create_new_deck_button";
    public static final String LAST_MODIFIED_BUTTON = "last_modified_button";
    public static final String OPTION_BUTTON = "option_button";
    public static final String OPTION_MENU_ITEM_DECK_TITLE = "option_menu_item_deck_title";
    public static final String OPTION_MENU_ITEM_EDIT_DECK_INFO = "option_menu_item_edit_deck_info";
    public static final String EDIT_DECK_INFO = "Edit Deck Info";
    public static final String OPTION_MENU_ITEM_COPY_TO = "option_menu_item_copy_to";
    public static final String COPY_TO = "Copy To";
    public static final String OPTION_MENU_ITEM_ARCHIVE_DECK = "option_menu_item_archive";
    public static final String ARCHIVE_DECK = "Archive Deck";
    public static final String DAYS_REMAINING_TEXTVIEW = "days_remaining_textview";
    public static final String PROGRESS_BAR = "progress_bar";

    public MyDecksPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void verifyDeckTitleIsVisible(String deckTitle) throws IOException {
        verifyElementAccessibilityIdTextIsVisibleAs(MY_DECKS_PAGE, ADDED_DECK_TITLE, deckTitle);
    }

    public void verifyDeckTitleIsNotVisible(String deckTitle) throws IOException {
        verifyElementTextIsNotVisible(MY_DECKS_PAGE, ADDED_DECK_TITLE, deckTitle);
    }

    public void navigateToCreateNewDeckPage() throws IOException {
        tapElement(MY_DECKS_PAGE, CREATE_NEW_DECK_ICON);
    }

    public void tapOnMyDeck(String decktitle){
        freeze(2);
        scrollAndClick(decktitle);
    }

    public void verifyDeckTitleLabelIsVisible() throws IOException {
        isElementVisible(MY_DECKS_PAGE, ADDED_DECK_TITLE);
    }

    public void verifyDaysRemainingLabelIsVisible() throws IOException {
        isElementVisible(MY_DECKS_PAGE, DAYS_REMAINING_TEXTVIEW);
    }

    public void verifyProgressBarIsVisible() throws IOException {
        isElementVisible(MY_DECKS_PAGE, PROGRESS_BAR);
    }

    public void verifyLastModifiedButtonIsVisible() throws IOException {
        isElementVisible(MY_DECKS_PAGE, LAST_MODIFIED_BUTTON);
    }

    public void verifyOptionButtonIsVisible() throws IOException {
        isElementVisible(MY_DECKS_PAGE, OPTION_BUTTON);
    }

    public void tapOptionButton() throws IOException {
        tapElement(MY_DECKS_PAGE, OPTION_BUTTON);
    }

    public void verifyMenuItemstOfOptionButton() throws IOException {
        isElementNameEqualTo(MY_DECKS_PAGE, OPTION_MENU_ITEM_EDIT_DECK_INFO, EDIT_DECK_INFO);
        isElementNameEqualTo(MY_DECKS_PAGE, OPTION_MENU_ITEM_COPY_TO, COPY_TO);
        isElementNameEqualTo(MY_DECKS_PAGE, OPTION_MENU_ITEM_ARCHIVE_DECK, ARCHIVE_DECK);
    }

    public void verifyMyDeckTitle(String deckTitle) throws IOException {
        isElementNameEqualTo(MY_DECKS_PAGE, OPTION_MENU_ITEM_DECK_TITLE, deckTitle);
    }

    public void verifyCreateNewDeckButtonIsVisible() throws IOException {
        isElementVisible(MY_DECKS_PAGE, CREATE_NEW_DECK_ICON);
    }

    public void tapOnEditDeckMenuItem(String deckTitle) throws IOException {
        scrollTo(deckTitle);
        tapOptionButton();
        tapElement(MY_DECKS_PAGE,OPTION_MENU_ITEM_EDIT_DECK_INFO);
    }

    public void tapOnCopyToButton() throws IOException {
        tapElement(MY_DECKS_PAGE, OPTION_MENU_ITEM_COPY_TO);
    }

}
