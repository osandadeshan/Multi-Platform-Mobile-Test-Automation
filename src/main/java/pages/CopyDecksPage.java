package pages;

import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 5/14/2017.
 */


public class CopyDecksPage extends BasePage {

    public static final String COPY_DECKS_PAGE = "CopyDecksPage";
    public static final String CREATE_NEW_DECK_BUTTON = "create_new_deck_button";
    public static final String COPY_NOW_BUTTON = "copy_now_button";
    public static final String ALERT_MESSAGE = "alert_message";
    public static final String ALERT_OK_BUTTON = "alert_ok_button";

    public CopyDecksPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void tapOnCreateNewDeckButton() throws IOException {
        tapElement(COPY_DECKS_PAGE, CREATE_NEW_DECK_BUTTON);
    }

    public void tapOnCopyNowButton() throws IOException {
        tapElement(COPY_DECKS_PAGE, COPY_NOW_BUTTON);
    }

    public void isAlertVisible() throws IOException {
        isElementVisible(COPY_DECKS_PAGE, ALERT_MESSAGE);
    }

    public void isAlertMessageEquals(String alertMessage) throws IOException {
        isElementTextEquals(COPY_DECKS_PAGE, ALERT_MESSAGE, alertMessage);
    }

    public void tapOnAlertOkButton() throws IOException {
        tapElement(COPY_DECKS_PAGE, ALERT_OK_BUTTON);
    }

}
