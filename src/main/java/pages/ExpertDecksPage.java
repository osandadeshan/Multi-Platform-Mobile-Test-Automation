package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 5/14/2017.
 */


public class ExpertDecksPage extends BasePage {

    public static final String EXPERT_DECKS_PAGE = "ExpertDecksPage";
    public static final String EXPERT_DECKS_TITLE_TEXTVIEW = "expert_decks_title_textview";
    public static final String EXPERT_DECKS = "Expert Decks";
    public static final String CREATE_NEW_DECK_ICON = "create_new_deck_button";
    public static final String ADDED_DECK_TITLE = "added_deck_title";
    public static final String ANDROID_ALL_EXPERT_DECKS_CONTAINER = "android.support.v7.widget.RecyclerView";
    public static final String ANDROID_DECK_TITLE_ID = "com.pearsoned.smartflashcards:id/textViewTitle";
    public static final String IOS_ALL_EXPERT_DECKS_CONTAINER = "";
    public static final String IOS_DECK_TITLE_ID = "";
    public static final String LAST_MODIFIED_BUTTON = "last_modified_button";
    public static final String OPTION_BUTTON = "option_button";
    public static final String OPTION_MENU_ITEM_DECK_TITLE = "option_menu_item_deck_title";
    public static final String OPTION_MENU_ITEM_EDIT_DECK_INFO = "option_menu_item_edit_deck_info";
    public static final String EDIT_DECK_INFO = "Edit Deck Info";
    public static final String OPTION_MENU_ITEM_COPY_TO = "option_menu_item_copy_to";
    public static final String COPY_TO = "Copy To";
    public static final String OPTION_MENU_ITEM_ARCHIVE_DECK = "option_menu_item_archive";
    public static final String ARCHIVE_DECK = "Archive Deck";

    List <String> elementNameList = new ArrayList();

    public ExpertDecksPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void verifyExpertDeckTitleIsVisible(String deckTitle) {
        addElementNamesToList(getWebElements(ANDROID_ALL_EXPERT_DECKS_CONTAINER, ANDROID_DECK_TITLE_ID), elementNameList);
        Assert.assertTrue(elementNameList.contains(deckTitle), "\"" + deckTitle + "\" Deck cannot be found!\n");
    }

    public void verifyExpertDeckTitleIsNotVisible(String deckTitle) {
        addElementNamesToList(getWebElements(ANDROID_ALL_EXPERT_DECKS_CONTAINER, ANDROID_DECK_TITLE_ID), elementNameList);
        Assert.assertFalse(elementNameList.contains(deckTitle), "\"" + deckTitle + "\" Deck has found!\n");
    }

    public void tapOnExpertDeck(String decktitle){
        freeze(2);
        scrollAndClick(decktitle);
    }

    public void verifyLastModifiedButtonIsVisible() throws IOException {
        isElementVisible(EXPERT_DECKS_PAGE, LAST_MODIFIED_BUTTON);
    }

    public void verifyOptionButtonIsVisible() throws IOException {
        isElementVisible(EXPERT_DECKS_PAGE, OPTION_BUTTON);
    }

    public void tapOptionButton() throws IOException {
        tapElement(EXPERT_DECKS_PAGE, OPTION_BUTTON);
    }

    public void verifyMenuItemstOfOptionButton() throws IOException {
        isElementNameEqualTo(EXPERT_DECKS_PAGE, OPTION_MENU_ITEM_EDIT_DECK_INFO, EDIT_DECK_INFO);
        isElementNameEqualTo(EXPERT_DECKS_PAGE, OPTION_MENU_ITEM_COPY_TO, COPY_TO);
        isElementNameEqualTo(EXPERT_DECKS_PAGE, OPTION_MENU_ITEM_ARCHIVE_DECK, ARCHIVE_DECK);
    }

    public void verifyExpertDeckTitle(String deckTitle) throws IOException {
        isElementNameEqualTo(EXPERT_DECKS_PAGE, OPTION_MENU_ITEM_DECK_TITLE, deckTitle);
    }

    public void verifyCreateNewDeckButtonIsNotVisible() throws IOException {
        isElementNotVisible(EXPERT_DECKS_PAGE, CREATE_NEW_DECK_ICON);
    }

    public void tapOnEditDeckMenuItem(String deckTitle) throws IOException {
        scrollTo(deckTitle);
        tapOptionButton();
        tapElement(EXPERT_DECKS_PAGE,OPTION_MENU_ITEM_EDIT_DECK_INFO);
    }


}
